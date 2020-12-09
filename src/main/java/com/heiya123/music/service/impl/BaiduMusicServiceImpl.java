package com.heiya123.music.service.impl;

import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.constant.MusicConstant;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicService;
import com.heiya123.music.util.HttpUtils;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import com.heiya123.music.vo.baidu.BaiduMusicBase;
import com.heiya123.music.vo.baidu.BaiduMusicDetail;
import com.heiya123.music.vo.baidu.BaiduMusicInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class BaiduMusicServiceImpl implements MusicService {

  @Override
  public List<Music> getMusics(MusicReqVo req) {
    ArrayList<Music> list = new ArrayList<>();
    String url = String
        .format(MusicConstant.BAIDU_SEARCH, req.getName(), req.getPageNo(), req.getPageSize());
    BaiduMusicBase musicBase = HttpUtils
        .getRequest(url, RequestHeaders.BAIDU_HEADERS, null, BaiduMusicBase.class);
    List<BaiduMusicBase.SongListBean> song_list = musicBase.getSong_list();
    for (BaiduMusicBase.SongListBean bean : song_list) {
      Music music = new Music();
      music.setName(bean.getTitle().replace("<em>", "").replace("</em>", ""));
      music.setArtist(bean.getAuthor().replace("<em>", "").replace("</em>", ""));
      music.setAlbum(bean.getAlbum_title().replace("<em>", "").replace("</em>", ""));
      //设置封面图片ID
      music.setPic_id(bean.getSong_id());
      //设置音乐链接ID
      music.setUrl_id(bean.getSong_id());
      music.setId(bean.getSong_id());
      music.setLyric_id(bean.getSong_id());
      music.setAllRate(Arrays.asList(bean.getAll_rate().split(",")));
      list.add(music);
    }
    return list;
  }

  @Override
  public String getLyric(String id) {
    Map<String, String> params = new HashMap<>();
    params.put("songIds", id);
    BaiduMusicInfo info = HttpUtils
        .getRequest(MusicConstant.BAIDU_INFO, RequestHeaders.BAIDU_HEADERS, params,
            BaiduMusicInfo.class);
    String lrcLink = info.getData().getSongList().get(0).getLrcLink();
    return HttpUtils
        .getRequest(lrcLink, RequestHeaders.BAIDU_HEADERS);
  }

  @Override
  public String getPic(String id) {
    Map<String, String> params = new HashMap<>();
    params.put("songIds", id);
    BaiduMusicInfo info = HttpUtils
        .getRequest(MusicConstant.BAIDU_INFO, RequestHeaders.BAIDU_HEADERS, params,
            BaiduMusicInfo.class);
    return info.getData().getSongList().get(0).getSongPicRadio();
  }

  @Override
  public String getMusicUrl(String id, String bit) {
    if (StringUtils.isEmpty(bit) || bit.contains("flac")) {
      Map<String, String> params = new HashMap<>();
      params.put("songIds", id);
      params.put("type", "flac");
      BaiduMusicInfo info = HttpUtils
          .getRequest(MusicConstant.BAIDU_INFO, RequestHeaders.BAIDU_HEADERS, params,
              BaiduMusicInfo.class);
      return info.getData().getSongList().get(0).getSongLink();
    } else {
      Map<String, String> params = new HashMap<>();
      params.put("songid", id);
      params.put("method", "baidu.ting.song.play");
      String[] rates = bit.split(",");
      params.put("bit", rates[rates.length - 1]);
      BaiduMusicDetail detail = HttpUtils
          .getRequest(MusicConstant.BAIDU_DETAIL, RequestHeaders.BAIDU_HEADERS, params,
              BaiduMusicDetail.class);
      return detail.getBitrate().getFile_link();
    }
  }

  @Override
  public MusicType getType() {
    return MusicType.BAIDU;
  }
}