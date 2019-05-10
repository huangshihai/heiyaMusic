package com.heiya123.music.bean;

public class CommonRspVo {
  private int rtnCode;
  private String msg;
  private Object data;

  public Object getData() {
    return this.data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public CommonRspVo() {
    this.rtnCode = ResultCode.C_FAIL.getCode();
  }

  public CommonRspVo(String msg) {
    this.rtnCode = ResultCode.C_FAIL.getCode();
    this.msg = msg;
  }

  public CommonRspVo(ResultCode code) {
    this.rtnCode = code.getCode();
    this.msg = code.getResult();
  }

  public CommonRspVo(ResultCode code, String msg) {
    this.rtnCode = code.getCode();
    this.msg = msg;
  }

  public CommonRspVo(int code, String msg) {
    this.rtnCode = code;
    this.msg = msg;
  }

  public int getRtnCode() {
    return this.rtnCode;
  }

  public void setRtnCode(ResultCode resultCode) {
    this.rtnCode = resultCode.getCode();
    this.msg = resultCode.getResult();
  }

  public void setRtnCode(ResultCode resultCode, String msg) {
    this.rtnCode = resultCode.getCode();
    this.msg = msg;
  }

  public void setRtnCode(int rtnCode) {
    this.rtnCode = rtnCode;
  }

  public void setRtnCode(int rtnCode, String msg) {
    this.rtnCode = rtnCode;
    this.msg = msg;
  }

  public String getMsg() {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
