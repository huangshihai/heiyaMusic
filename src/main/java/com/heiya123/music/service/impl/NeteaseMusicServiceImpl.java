package com.heiya123.music.service.impl;


import com.alibaba.fastjson.JSON;
import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.entity.*;
import com.heiya123.music.entity.netease.NeteaseMusicBase;
import com.heiya123.music.entity.netease.NeteaseMusicBase.ResultBean.SongsBean;
import com.heiya123.music.entity.netease.NeteaseMusicBase.ResultBean.SongsBean.ArtistsBean;
import com.heiya123.music.entity.netease.NeteaseMusicLyr;
import com.heiya123.music.entity.netease.NeteaseMusicPic;
import com.heiya123.music.entity.netease.NeteaseMusicUrl;
import com.heiya123.music.entity.vo.SearchRequestVo;
import com.heiya123.music.musicEnum.MusicSourceEnum;
import com.heiya123.music.service.NeteaseMusicService;
import com.heiya123.music.util.CommonUtils;
import com.heiya123.music.util.NeteaseEncryption;
import com.heiya123.music.util.OkHttpUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class NeteaseMusicServiceImpl implements NeteaseMusicService {
    private static Logger logger = LoggerFactory.getLogger(NeteaseMusicServiceImpl.class);

    /**
     * 分页获取歌曲
     *
     * @param req
     * @return
     */
    @Override
    public List<Music> findMusicByPage(SearchRequestVo req) {
        ArrayList<Music> list = new ArrayList<>();
        Map<String, String> params = new HashMap<String, String>();
        params.put("s", req.getName());
        params.put("limit", req.getPageSize() + "");
        params.put("type", "1");
        params.put("offset", (req.getPageIndex() - 1) * req.getPageSize() + "");
        String url = "http://music.163.com/api/search/pc";
        NeteaseMusicBase neteaseMusicBase = OkHttpUtils.postRequest(url, RequestHeaders.neteaseHeaders, params, NeteaseMusicBase.class);
        List<SongsBean> songs = neteaseMusicBase.getResult().getSongs();
        for (SongsBean song : songs) {
            Music music = new Music();
            music.setName(song.getName());
            String artist = "";
            List<ArtistsBean> artists = song.getArtists();
            for (int i = 0; i < artists.size(); i++) {
                artist += artists.get(i).getName();
                if (i != artists.size() - 1) {
                    artist += "、";
                }
            }
            music.setArtist(artist);
            music.setAlbum(song.getAlbum().getName());
            String songId = song.getDuration() + "";
            music.setPic_id(songId);
            music.setId(songId);
            music.setUrl_id(songId);
            music.setLyric_id(song.getId()+"");
            music.setSource(MusicSourceEnum.NeteaseMusic.getSource());
            list.add(music);
        }
        return list;
    }

    /**
     * 加载歌单
     *
     * @param id
     * @return
     */
    @Override
    public String playList(String id) {
        String url = "http://music.163.com/api/v3/playlist/detail?n=1000&id=" + id;
        return CommonUtils.jsonp2Json(OkHttpUtils.getRequest(url, RequestHeaders.neteaseHeaders));
    }

    /**
     * 加载用户歌单
     *
     * @param uid
     * @return
     */
    @Override
    public String userList(String uid) {
        String url = "http://music.163.com/api/user/playlist/?offset=0&uid=" + uid + "&limit=50";
        return OkHttpUtils.getRequest(url, RequestHeaders.neteaseHeaders);
    }

    /**
     * 获取歌曲链接
     *
     * @param id
     * @return
     */
    @Override
    public String loadMusicUrl(String id) {
        RequestHeaders.neteaseHeaders.put("User-Agent", RequestHeaders.randomUserAgent());
        RequestHeaders.neteaseHeaders.put("Cookie", RequestHeaders.getNeteaseCookie());
        Map<String, String> map = new HashMap<>();
        map.put("ids", "[" + id + "]");
        map.put("br", "320000");
        String data = JSON.toJSONString(map);
        Map<String, String> params = NeteaseEncryption.encrypt(data);
        String url = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";
        logger.info("网易云音乐的请求头信息:{}",JSON.toJSONString(RequestHeaders.neteaseHeaders));
        NeteaseMusicUrl neteaseMusicUrl = OkHttpUtils.postRequest(url, RequestHeaders.neteaseHeaders, params, NeteaseMusicUrl.class);
        logger.info("网易云歌曲{}的链接信息为{}",id,JSON.toJSONString(neteaseMusicUrl));
        if (neteaseMusicUrl.getCode() != -460) {
            return neteaseMusicUrl.getData().get(0).getUrl() == null ? "" : neteaseMusicUrl.getData().get(0).getUrl();
        }
        return "";
    }

    /**
     * 获取封面图片
     *
     * @param id
     * @return
     */
    @Override
    public String loadPic(String id) {
        String url = "http://music.163.com/api/song/detail/?" + id + "&ids=%5B" + id + "%5D";
        NeteaseMusicPic neteaseMusicPic = OkHttpUtils.getRequest(url, RequestHeaders.neteaseHeaders, null, NeteaseMusicPic.class);
        return neteaseMusicPic.getSongs().get(0).getAlbum().getPicUrl();
    }

    /**
     * 获取歌词
     *
     * @param id
     * @return
     */
    @Override
    public String loadLyric(String id) {
        String lrc = "";
        String url = "https://music.163.com/api/song/lyric?os=pc&id=" + id + "&lv=-1&kv=-1&tv=-1";
        NeteaseMusicLyr neteaseMusicLyr = OkHttpUtils.getRequest(url, RequestHeaders.neteaseHeaders, null, NeteaseMusicLyr.class);
        if (neteaseMusicLyr != null && neteaseMusicLyr.getLrc() != null) {
            lrc = neteaseMusicLyr.getLrc().getLyric();
        }
        return lrc;
    }

}
