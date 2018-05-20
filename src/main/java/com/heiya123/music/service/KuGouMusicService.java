package com.heiya123.music.service;

import com.heiya123.music.entity.Music;
import com.heiya123.music.entity.vo.SearchRequestVo;

import java.util.List;

public interface KuGouMusicService {

    List<Music> findMusicByPage(SearchRequestVo req);

    String loadLyric(String hash);

    String loadPic(String  hash);

    String loadMusicUrl(String hash);

}
