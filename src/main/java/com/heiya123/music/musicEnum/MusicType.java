package com.heiya123.music.musicEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * @author huangsh
 * @date 2019/5/9
 */
@Getter
public enum MusicType {

  QQ("QQMusic", "QQ音乐", 1),
  NETEASE("NeteaseMusic", "网易云音乐", 2),
  KUGOU("KugouMusic", "酷狗音乐", 3),
  XIAMI("XiamiMusic", "虾米音乐", 4),
  BAIDU("BaiduMusic", "百度音乐", 5);

  private final String name;
  private final String describe;
  private final int value;

  MusicType(String name, String describe, int value) {
    this.name = name;
    this.describe = describe;
    this.value = value;
  }

  @JsonValue
  public int getValue() {
    return this.value;
  }

  public String getName() {
    return this.name;
  }

  public String getDescribe() {
    return this.describe;
  }

  @JsonCreator
  public static MusicType get(int value) {
    MusicType[] values = MusicType
        .values();
    for (MusicType musicType : values) {
      if (musicType.value == value) {
        return musicType;
      }
    }
    return null;
  }
}
