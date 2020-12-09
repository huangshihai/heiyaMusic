package com.heiya123.music.service;

import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import java.util.List;

/**
 * @author huangsh
 * @date 2019/5/10
 */
public interface MusicService {

  default List<Music> getMusics(MusicReqVo req) {
    return null;
  }

  default String getLyric(String id) {
    return null;
  }

  default String getPic(String id) {
    return null;
  }

  default String getMusicUrl(String id, String bit) {
    return null;
  }

  default Object getPlayList(String id) {
    return null;
  }

  default Object getUserPlayList(String id) {
    return null;
  }

  MusicType getType();
}
