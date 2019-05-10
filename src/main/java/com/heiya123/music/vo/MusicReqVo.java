package com.heiya123.music.vo;

import com.heiya123.music.bean.CommonListReqVo;
import com.heiya123.music.musicEnum.MusicType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MusicReqVo extends CommonListReqVo {

  private String name;
  private MusicType type;
}
