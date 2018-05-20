package com.heiya123.music.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.entity.*;
import com.heiya123.music.entity.kugou.KuGouMusicBase;
import com.heiya123.music.entity.kugou.KuGouMusicBase.Data.Info;
import com.heiya123.music.entity.kugou.KuGouMusicUrl;
import com.heiya123.music.entity.vo.SearchRequestVo;
import com.heiya123.music.musicEnum.MusicSourceEnum;
import com.heiya123.music.service.KuGouMusicService;
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class KuGouMusicServiceImpl implements KuGouMusicService {
    private static Logger logger = LoggerFactory.getLogger(KuGouMusicServiceImpl.class);


    /**
     * 分页获取歌曲
     *
     * @param req
     * @return
     */
    @Override
    public List<Music> findMusicByPage(SearchRequestVo req) {
        ArrayList<Music> list = new ArrayList<>();
        String url = "http://mobilecdn.kugou.com/api/v3/search/song?format=json&keyword=" + req.getName()
                + "&page=" + req.getPageIndex() + "&pagesize=" + req.getPageSize() + "&showtype=1";
        KuGouMusicBase kuGouMusicBase = OkHttpUtils.getRequest(url, RequestHeaders.kugouHeaders, null, KuGouMusicBase.class);
        List<Info> info = kuGouMusicBase.getData().getInfo();
        for (Info song : info) {
            Music music = new Music();
            music.setArtist(song.getSingername());
            music.setName(song.getSongname());
            String hash = song.getHash();
            music.setId(hash);
            music.setPic_id(hash);
            music.setUrl_id(hash);
            music.setLyric_id(hash);
            music.setAlbum(song.getAlbum_name());
            music.setSource(MusicSourceEnum.KuGouMusic.getSource());
            list.add(music);
        }
        return list;
    }

    /**
     * 获取封面图片
     *
     * @param hash
     * @return
     */
    @Override
    public String loadPic(String hash) {
        String url = "http://tools.mobile.kugou.com/api/v1/singer_header/get_by_hash?hash=" + hash + "&size=150&format=json";
        String rsp = OkHttpUtils.getRequest(url, RequestHeaders.kugouHeaders);
        JSONObject jsonObject = JSON.parseObject(rsp);
        return (String)jsonObject.get("url");
    }

    /**
     * 获取歌曲链接
     *
     * @param hash
     * @return
     */
    @Override
    public String loadMusicUrl(String hash) {
        String url = "http://m.kugou.com/app/i/getSongInfo.php?cmd=playInfo&hash=" + hash;
        KuGouMusicUrl kuGouMusic = OkHttpUtils.getRequest(url, RequestHeaders.kugouHeaders, null, KuGouMusicUrl.class);
        return kuGouMusic.getUrl();
    }

    /**
     * 获取歌词
     *
     * @param hash
     * @return
     */
    @Override
    public String loadLyric(String hash) {
        String url = "http://m.kugou.com/app/i/krc.php?cmd=100&timelength=999999&hash=" + hash;
        return OkHttpUtils.getRequest(url, RequestHeaders.kugouHeaders);
    }
}
