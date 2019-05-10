package com.heiya123.music.vo;

import com.heiya123.music.musicEnum.MusicType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Music {

  /**
   * 自增ID
   */
  private Long mid;

  /**
   * 音乐ID
   */
  private String id;
  /**
   * 音乐名字
   */
  private String name;
  /**
   * 专辑名称
   */
  private String album;
  /**
   * 艺术家名字
   */
  private String artist;
  /**
   * 歌词ID
   */
  private String lyric_id;
  /**
   * 封面ID
   */
  private String pic_id;
  /**
   * 音乐来源
   */
  private MusicType type;
  /**
   * 链接ID
   */
  private String url_id;
  /**
   * 歌词
   */
  private String lyric = "";
  /**
   * 图片链接
   */
  private String pic = "";
  private String url = "";

}
