package com.heiya123.music.bean;

public enum ResultCode {
  C_SUCCESS("请求成功", 1),
  C_FAIL("请求失败", -1001),
  C_EXCEPTION("请求服务异常", -1002),
  C_DATA_NOT_FOUND("找不到对应数据", -1003),
  C_PARAMS_ERROR("请求参数有误", -1004);

  private String result;
  private int code;

  private ResultCode(String result, int code) {
    this.result = result;
    this.code = code;
  }

  public String getResult() {
    return this.result;
  }

  public int getCode() {
    return this.code;
  }
}
