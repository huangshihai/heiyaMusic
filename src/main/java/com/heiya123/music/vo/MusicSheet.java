package com.heiya123.music.vo;

import com.heiya123.music.musicEnum.MusicType;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MusicSheet {


  private String cover;
  private String creatorAvatar;
  private String creatorName;
  private String name;
  private List<ItemBean> item;

  @Setter
  @Getter
  public static class ItemBean {

    private String album;
    private String artist;
    private String id;
    private String lyric_id;
    private String name;
    private String pic;
    private String pic_id;
    private MusicType type;
    private String url;
    private String url_id;
  }
}
