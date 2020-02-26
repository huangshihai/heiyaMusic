package com.heiya123.music.entity.QQ;

public class QQLyr {

    private int result;
    private DataBean data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private int retcode;
        private int code;
        private int subcode;
        private String lyric;
        private String trans;

        public int getRetcode() {
            return retcode;
        }

        public void setRetcode(int retcode) {
            this.retcode = retcode;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getSubcode() {
            return subcode;
        }

        public void setSubcode(int subcode) {
            this.subcode = subcode;
        }

        public String getLyric() {
            return lyric;
        }

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }

        public String getTrans() {
            return trans;
        }

        public void setTrans(String trans) {
            this.trans = trans;
        }
    }
}
