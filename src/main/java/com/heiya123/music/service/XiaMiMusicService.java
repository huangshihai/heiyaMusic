package com.heiya123.music.service;

import com.heiya123.music.entity.Music;
import com.heiya123.music.entity.vo.SearchRequestVo;

import java.util.List;

public interface XiaMiMusicService {

    List<Music> findMusicByPage(SearchRequestVo req);

    String loadLyric(String url);

    String loadPic(String  id);

    String loadMusicUrl(String id);
}
