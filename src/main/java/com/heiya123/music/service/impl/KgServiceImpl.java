package com.heiya123.music.service.impl;

import com.alibaba.fastjson.JSON;
import com.heiya123.music.config.KegeConfig;
import com.heiya123.music.entity.*;
import com.heiya123.music.entity.kege.KegeLyric;
import com.heiya123.music.entity.kege.KegeMusic;
import com.heiya123.music.entity.kege.KegeProperties;
import com.heiya123.music.entity.kege.KegeUrl;
import com.heiya123.music.service.KgService;
import com.heiya123.music.util.CommonUtils;
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String url = "http://node.kg.qq.com/play?s=" + id + "&g_f=personal";
        String rsp = OkHttpUtils.getRequest(url, null);
        String regex = "window.__DATA__ = ([\\s\\S]*?(?=</script>))</script>";
        Matcher matcher = Pattern.compile(regex).matcher(rsp);
        while (matcher.find()) {
            KegeUrl kegeUrl = JSON.parseObject(CommonUtils.jsonp2Json(matcher.group(1)), KegeUrl.class);
            return kegeUrl.getDetail().getPlayurl();
        }
        return null;
    }

    @Override
    public String playList(String id) {
        MusicList musicList = new MusicList();
        KegeProperties kegeProperties = kegeConfig.getUserAttr().get(id);
        musicList.setName(kegeProperties.getTitle());
        musicList.setCover(kegeProperties.getCover());
        KegeMusic kegeMusic = getKgMusicList(id, 1);
        if (kegeMusic.getCode() == 0 && kegeMusic.getData() != null) {
            int total = kegeMusic.getData().getUgc_total_count();
            int count = total % 8 == 0 ? total / 8 : (total / 8) + 1;
            for (int i = 1; i <= count; i++) {
                KegeMusic kgMusicList = getKgMusicList(id, i);
                if (kgMusicList != null && kgMusicList.getCode() == 0 && kgMusicList.getData() != null && kgMusicList.getData().getUgclist().size() > 0) {
                    List<KegeMusic.DataBean.UgclistBean> ugclist = kgMusicList.getData().getUgclist();
                    for (int j = 0; j < ugclist.size(); j++) {
                        MusicList.ItemBean item = new MusicList.ItemBean();
                        item.setId(ugclist.get(j).getShareid());
                        item.setName(ugclist.get(j).getTitle());
                        item.setPic(ugclist.get(j).getAvatar());
                        item.setArtist(kegeProperties.getSinger());
                        item.setSource("qmkg");
                        item.setUrl_id(ugclist.get(j).getKsong_mid());
                        item.setLyric_id(ugclist.get(j).getKsong_mid());
                        item.setAlbum(kegeProperties.getAlbum());
                        musicList.getItem().add(item);
                    }
                }
            }
        }
        String json = JSON.toJSONString(musicList);
        return json;
    }

    @Override
    public String kgUserList() {
        List<String> list = new ArrayList<>();
        kegeConfig.getUserAttr().forEach((k, v) -> {
            list.add("kg-"+k);
        });
        return JSON.toJSONString(list);
    }

    private KegeMusic getKgMusicList(String id, int index) {
        String url = "http://node.kg.qq.com/cgi/fcgi-bin/kg_ugc_get_homepage?jsonpcallback=callback_4&g_tk=5381&outcharset=utf-8&format=jsonp&type=get_ugc&start=" + index + "&num=8&touin=&share_uid=" + id + "&g_tk_openkey=1191280939&_=" + System.currentTimeMillis();
        return OkHttpUtils.getRequest(url, null, null, KegeMusic.class);
    }
}
