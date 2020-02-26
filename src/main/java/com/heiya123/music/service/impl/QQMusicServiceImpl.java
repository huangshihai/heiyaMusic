package com.heiya123.music.service.impl;

import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.entity.Music;
import com.heiya123.music.entity.QQ.QQLyr;
import com.heiya123.music.entity.QQ.QQMusicBase;
import com.heiya123.music.entity.QQ.QQMusicBase.DataBean.SongBean.ListBean;
import com.heiya123.music.entity.QQ.QQMusicBase.DataBean.SongBean.ListBean.SingerBean;
import com.heiya123.music.entity.QQ.QQMusicUrl;
import com.heiya123.music.entity.vo.SearchRequestVo;
import com.heiya123.music.musicEnum.MusicSourceEnum;
import com.heiya123.music.service.QQMusicService;
import com.heiya123.music.util.OkHttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QQMusicServiceImpl implements QQMusicService {
    private static Logger logger = LoggerFactory.getLogger(QQMusicServiceImpl.class);
    private static String domain = "https://api.qq.jsososo.com";

    /**
     * 分页获取歌曲
     *
     * @param req
     * @return
     */
    @Override
    public List<Music> findMusicByPage(SearchRequestVo req) {
        ArrayList<Music> list = new ArrayList<>();
        String url = "http://soso.music.qq.com/fcgi-bin/search_cp?aggr=0&catZhida=0&lossless=1&sem=1&w="
                + req.getName() + "&n=" + req.getPageSize() + "&t=0&p=" + req.getPageIndex()
                + "&remoteplace=sizer.yqqlist.song&g_tk=5381&loginUin=0&hostUin=0&format=jsonp&inCharset=GB2312&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0";
        QQMusicBase qqMusicBase = OkHttpUtils.getRequest(url, RequestHeaders.tencentHeaders, null, QQMusicBase.class);
        List<ListBean> songs = qqMusicBase.getData().getSong().getList();
        for (ListBean song : songs) {
            Music music = new Music();
            /** 设置歌名 */
            music.setName(song.getSongname());
            /** 获取歌手 */
            List<SingerBean> singers = song.getSinger();
            String artist = "";
            for (int i = 0; i < singers.size(); i++) {
                artist += singers.get(i).getName();
                if (i != singers.size() - 1) {
                    artist += "、";
                }
            }
            music.setArtist(artist);
            /** 设置专辑 */
            music.setAlbum(song.getAlbumname());
            /** 设置封面图片ID */
            music.setPic_id(song.getAlbummid());
            /** 设置音乐链接ID */
//            String quality = song.getSizeflac() > 0 ? "flac" : song.getSizeape() > 0 ? "ape" : song.getSize320() > 0 ? "320" : "128";
            String quality = song.getSize320() > 0 ? "320" : "128";
            music.setUrl_id(song.getSongmid() + ":" + quality);
            music.setId(song.getSongmid() + ":" + quality);
            /** 设置歌词ID */
            music.setLyric_id(song.getSongmid());
            /** 设置封面 */
            String albummid = song.getAlbummid();
            music.setPic("http://i.gtimg.cn/music/photo/mid_album_500/" + albummid.substring(albummid.length() - 2, albummid.length() - 1) + "/" + albummid.substring(albummid.length() - 1) + "/" + albummid + ".jpg");
            music.setSource(MusicSourceEnum.QQMusic.getSource());
            list.add(music);
        }
        return list;
    }


    /**
     * 获取歌曲URL
     *
     * @param media_mid
     * @return
     */
    @Override
    public String loadMusicUrl(String media_mid) {
        String[] split = media_mid.split(":");
        String url = String.format("%s/song/url?id=%s&type=%s", domain, split[0], split[1]);
        QQMusicUrl qqMusicUrl = OkHttpUtils.getRequest(url, RequestHeaders.tencentHeaders, null, QQMusicUrl.class);
        return qqMusicUrl.getData();
    }

    /**
     * 获取封面图片
     *
     * @param albummid
     * @return
     */
    @Override
    public String loadPic(String albummid) {
        return "http://i.gtimg.cn/music/photo/mid_album_500/" + albummid.substring(albummid.length() - 2, albummid.length() - 1) + "/" + albummid.substring(albummid.length() - 1) + "/" + albummid + ".jpg";
    }

    /**
     * 获取歌词
     *
     * @param media_mid
     * @return
     */
    @Override
    public String loadLyric(String media_mid) {
        String url = String.format("%s/lyric?songmid=%s", domain, media_mid);
        QQLyr qqLyr = OkHttpUtils.getRequest(url, RequestHeaders.tencentHeaders, null, QQLyr.class);
        return qqLyr.getData().getLyric();
    }
}
