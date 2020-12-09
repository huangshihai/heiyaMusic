package com.heiya123.music.service.impl;


import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.constant.MusicConstant;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicService;
import com.heiya123.music.util.HttpUtils;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import com.heiya123.music.vo.xiami.XiaMiMusicBase;
import com.heiya123.music.vo.xiami.XiaMiMusicBase.Data.Songs;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class XiaMiMusicServiceImpl implements MusicService {


  /**
   * 分页获取歌曲
   */
  @Override
  public List<Music> getMusics(MusicReqVo req) {
    ArrayList<Music> list = new ArrayList<>();
    String url = String
        .format(MusicConstant.XIAMIMUSIC_SEARCH, req.getName(), req.getPageNo(), req.getPageSize());
    XiaMiMusicBase xiaMiMusicBase = HttpUtils
        .getRequest(url, RequestHeaders.XIAMI_HEADERS, null, XiaMiMusicBase.class);
    List<Songs> songs = xiaMiMusicBase.getData().getSongs();
    for (Songs song : songs) {
      Music music = new Music();
      music.setName(song.getSong_name());
      music.setArtist(song.getArtist_name());
      music.setAlbum(song.getAlbum_name());
      music.setUrl(song.getListen_file());
      music.setPic(song.getAlbum_logo());
      music.setLyric(getLyric(song.getLyric()));
      music.setId(song.getSong_id() + "");
      music.setPic_id(song.getSong_id() + "");
      music.setUrl_id(song.getSong_id() + "");
      music.setLyric_id(song.getSong_id() + "");
      music.setType(MusicType.XIAMI);
      list.add(music);
    }
    return list;
  }

  /**
   * 获取歌词
   */
  @Override
  public String getLyric(String url) {
    String lyr = null;
    if (!StringUtils.isEmpty(url) && url.contains("http")) {
      String rsp = HttpUtils.getRequest(url, RequestHeaders.XIAMI_HEADERS);
      if (rsp != null) {
        String regex = "<([0-9]+)>";
        lyr = rsp.replaceAll(regex, "");
      }
    }
    return lyr;
  }

  @Override
  public MusicType getType() {
    return MusicType.XIAMI;
  }
}
