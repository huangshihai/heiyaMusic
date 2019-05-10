package com.heiya123.music.bean;

import java.util.List;

public class CommonListRspVo extends CommonRspVo {
  private int total;
  private List<? extends Object> data;

  public CommonListRspVo() {
  }

  public CommonListRspVo(ResultCode code) {
    super(code);
  }

  public List<? extends Object> getData() {
    return this.data;
  }

  public void setData(List<? extends Object> data) {
    this.data = data;
  }

  public int getTotal() {
    return this.total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
