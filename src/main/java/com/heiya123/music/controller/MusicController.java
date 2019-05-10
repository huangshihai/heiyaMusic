package com.heiya123.music.controller;


import com.alibaba.fastjson.JSON;
import com.heiya123.music.bean.CommonListRspVo;
import com.heiya123.music.bean.CommonRspVo;
import com.heiya123.music.bean.ResultCode;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicServiceFactory;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

  @Autowired
  private MusicServiceFactory service;

  /**
   * 查找歌曲
   */
  @RequestMapping("/search")
  public CommonListRspVo searchMusic(MusicReqVo req) {
    CommonListRspVo rsp = new CommonListRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(req.getName()) || req.getType() == null) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    List<Music> musics = service.getService(req.getType()).getMusics(req);
    rsp.setData(musics);
    rsp.setTotal(musics.size());
    return rsp;
  }

  /**
   * 歌单
   */
  @RequestMapping("/playlist")
  public CommonRspVo playlist(String id, int type) {
    CommonRspVo rsp = new CommonRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(id)) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    Object playList = service.getService(MusicType.get(type)).getPlayList(id);
    rsp.setData(playList);
    return rsp;
  }

  /**
   * 用户歌单
   */
  @RequestMapping("/userplaylist")
  public CommonRspVo userPlayList(String id, int type) {
    CommonRspVo rsp = new CommonRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(id)) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    Object userPlayList = service.getService(MusicType.get(type)).getUserPlayList(id);
    rsp.setData(userPlayList);
    return rsp;
  }

  /**
   * 音乐链接
   */
  @RequestMapping("/url")
  public CommonRspVo loadMusicUrl(String id, int type) {
    CommonRspVo rsp = new CommonRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(id)) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    String url = service.getService(MusicType.get(type)).getMusicUrl(id);
    rsp.setData(url);
    return rsp;
  }

  /**
   * 封面图片
   */
  @RequestMapping("/pic")
  public CommonRspVo loadPic(String id, int type) {
    CommonRspVo rsp = new CommonRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(id)) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    String pic = service.getService(MusicType.get(type)).getPic(id);
    rsp.setData(pic);
    return rsp;
  }

  /**
   * 歌词
   */
  @RequestMapping("/lyric")
  public CommonRspVo loadLrc(String id, int type) {
    CommonRspVo rsp = new CommonRspVo(ResultCode.C_SUCCESS);
    if (StringUtils.isEmpty(id)) {
      rsp.setRtnCode(ResultCode.C_PARAMS_ERROR);
      return rsp;
    }
    String lyric = service.getService(MusicType.get(type)).getLyric(id);
    rsp.setData(lyric);
    return rsp;
  }

}
