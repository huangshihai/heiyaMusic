package com.heiya123.music.service.impl;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.entity.Music;
import com.heiya123.music.entity.kugou.KuGouMusicBase;
import com.heiya123.music.entity.kugou.KuGouMusicBase.DataBean.ListsBean;
import com.heiya123.music.entity.kugou.KuGouMusicUrl;
import com.heiya123.music.entity.vo.SearchRequestVo;
import com.heiya123.music.musicEnum.MusicSourceEnum;
import com.heiya123.music.service.KuGouMusicService;
import com.heiya123.music.util.CommonUtils;
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        String url = "http://songsearch.kugou.com/song_search_v2?keyword=" + req.getName()
                + "&page=" + req.getPageIndex() + "&pagesize=" + req.getPageSize();
        KuGouMusicBase kuGouMusicBase = OkHttpUtils.getRequest(url, RequestHeaders.kugouHeaders, null, KuGouMusicBase.class);
        List<ListsBean> lists = kuGouMusicBase.getData().getLists();
        String emptyKey = "00000000000000000000000000000000";
        for (ListsBean song : lists) {
            Music music = new Music();
            music.setArtist(song.getSingerName());
            music.setName(song.getSongName());
            String hash = emptyKey.equals(song.getSQFileHash()) ? (emptyKey.equals(song.getHQFileHash()) ? song.getFileHash() : song.getHQFileHash()) : song.getSQFileHash();
            music.setId(hash);
            music.setPic_id(hash);
            music.setUrl_id(hash);
            music.setLyric_id(hash);
            music.setAlbum(song.getAlbumName());
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
        return (String) jsonObject.get("url");
    }

    /**
     * 获取歌曲链接
     *
     * @param hash
     * @return
     */
    @Override
    public String loadMusicUrl(String hash) {
        String url = "http://trackercdnbj.kugou.com/i/v2/?cmd=23&pid=1&behavior=download&hash=" + hash + "&key="+CommonUtils.getMD5(hash+"kgcloudv2");
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
