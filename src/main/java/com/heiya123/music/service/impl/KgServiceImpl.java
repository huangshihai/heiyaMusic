package com.heiya123.music.service.impl;

import com.alibaba.fastjson.JSON;
import com.heiya123.music.config.KegeConfig;
import com.heiya123.music.entity.MusicList;
import com.heiya123.music.entity.kege.KegeLyric;
import com.heiya123.music.entity.kege.KegeMusic;
import com.heiya123.music.entity.kege.KegeProperties;
import com.heiya123.music.service.KgService;
import com.heiya123.music.util.CommonUtils;
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KgServiceImpl implements KgService {
    private Logger logger = LoggerFactory.getLogger(KgServiceImpl.class);

    @Autowired
    private KegeConfig kegeConfig;

    @Override
    public String loadLyric(String id) {
        String url = "http://node.kg.qq.com/cgi/fcgi-bin/fcg_lyric?jsonpCallback=callback_1&g_tk=5381&outCharset=utf-8&format=jsonp&ksongmid=" + id + "&g_tk_openkey=1191280939&_=" + System.currentTimeMillis();
        KegeLyric kegeLyric = OkHttpUtils.getRequest(url, null, null, KegeLyric.class);
        if (kegeLyric != null && kegeLyric.getData() != null) {
            return kegeLyric.getData().getLyric();
        }
        return "";
    }

    @Override
    public String loadMusicUrl(String id) {
        return "https://node.kg.qq.com/cgi/fcgi-bin/fcg_get_play_url?shareid=" + id;
    }

    @Override
    public String playList(String id) {
        MusicList musicList = new MusicList();
        KegeProperties kegeProperties = kegeConfig.getUserAttr().get(id);
        KegeMusic kegeMusic = getKgMusicList(id, 1);
        if (kegeMusic != null && kegeMusic.getCode() == 0 && kegeMusic.getData() != null) {
            int total = kegeMusic.getData().getUgc_total_count();
            String title = kegeMusic.getData().getNickname() + "的全民K歌";
            String cover = kegeMusic.getData().getHead_img_url();
            musicList.setName(title);
            musicList.setCover(cover);
            int count = total % 8 == 0 ? total / 8 : (total / 8) + 1;
            for (int i = 1; i <= count; i++) {
                KegeMusic kgMusicList = getKgMusicList(id, i);
                if (kgMusicList != null && kgMusicList.getCode() == 0 && kgMusicList.getData() != null && kgMusicList.getData().getUgclist().size() > 0) {
                    List<KegeMusic.DataBean.UgclistBean> ugclist = kgMusicList.getData().getUgclist();
                    for (KegeMusic.DataBean.UgclistBean ugclistBean : ugclist) {
                        MusicList.ItemBean item = new MusicList.ItemBean();
                        item.setId(ugclistBean.getShareid());
                        item.setName(ugclistBean.getTitle());
                        item.setPic(ugclistBean.getAvatar());
                        item.setArtist(kegeProperties.getSinger());
                        item.setSource("qmkg");
                        item.setUrl_id(ugclistBean.getKsong_mid());
                        item.setLyric_id(ugclistBean.getKsong_mid());
                        item.setAlbum(title);
                        musicList.getItem().add(item);
                    }
                }
            }
        }
        return JSON.toJSONString(musicList);
    }

    @Override
    public String kgUserList() {
        List<String> list = new ArrayList<>();
        kegeConfig.getUserAttr().forEach((k, v) -> {
            list.add("kg-" + k);
        });
        return JSON.toJSONString(list);
    }

    private KegeMusic getKgMusicList(String id, int index) {
        String kgUrl = "https://node.kg.qq.com/cgi/fcgi-bin/kg_ugc_get_homepage?jsonpCallback=callback_0&inChFarset=GB2312&outCharset=utf-8&format=&g_tk=5381&g_tk_openkey=719182536&nocache=0.8706501019187272&share_uid=";
        String kgUrl2 = kgUrl + id + "&type=get_uinfo&start=" + index + "&num=8";
        String response = OkHttpUtils.getRequest(kgUrl2, null, null);
        String json = CommonUtils.jsonp2Json(response);
        return JSON.parseObject(json, KegeMusic.class);
    }
}
