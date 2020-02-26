package com.heiya123.music.service.impl;


import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.entity.Music;
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
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NeteaseMusicServiceImpl implements NeteaseMusicService {
    private static Logger logger = LoggerFactory.getLogger(NeteaseMusicServiceImpl.class);
    private static String domain = "http://musicapi.heiya123.com";

    /**
     * 分页获取歌曲
     *
     * @param req
     * @return
     */
    @Override
    public List<Music> findMusicByPage(SearchRequestVo req) {
        ArrayList<Music> list = new ArrayList<>();
        String limit = String.valueOf(req.getPageSize());
        String offset = String.valueOf((req.getPageIndex() - 1) * req.getPageSize());
        String url = String.format("%s/search?keywords=%s&limit=%s&offset=%s", domain, req.getName(), limit, offset);
        NeteaseMusicBase neteaseMusicBase = OkHttpUtils.getRequest(url, null, null, NeteaseMusicBase.class);
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
            String songId = song.getId() + "";
            music.setPic_id(songId + ":" + song.getAlbum().getId());
            music.setId(songId);
            music.setUrl_id(songId);
            music.setLyric_id(song.getId() + "");
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
        String url = String.format("http://musicapi.heiya123.com/song/url?id=%s", id);
        NeteaseMusicUrl neteaseMusicUrl = OkHttpUtils.postRequest(url, null, null, NeteaseMusicUrl.class);
        return neteaseMusicUrl.getData().get(0).getUrl();
    }

    /**
     * 获取封面图片
     *
     * @param id
     * @return
     */
    @Override
    public String loadPic(String id) {
        String[] split = id.split(":");
        String url = String.format("%s/album?id=%s", domain, split[1]);
        NeteaseMusicPic neteaseMusicPic = OkHttpUtils.getRequest(url, null, null, NeteaseMusicPic.class);
        for (NeteaseMusicPic.SongsBean song : neteaseMusicPic.getSongs()) {
            if (split[0].equals(String.valueOf(song.getId()))) {
                return song.getAl().getPicUrl();
            }
        }
        return null;
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
