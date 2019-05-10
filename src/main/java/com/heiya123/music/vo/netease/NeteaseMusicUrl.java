package com.heiya123.music.vo.netease;

import java.util.List;

public class NeteaseMusicUrl {

    private List<Data> data;
    private int code;

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }


    public static class Data {

        private int id;
        private String url;
        private int br;
        private int size;
        private String md5;
        private int code;
        private int expi;
        private String type;
        private double gain;
        private int fee;
        private String uf;
        private int payed;
        private int flag;
        private boolean canextend;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setBr(int br) {
            this.br = br;
        }

        public int getBr() {
            return br;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public String getMd5() {
            return md5;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public void setExpi(int expi) {
            this.expi = expi;
        }

        public int getExpi() {
            return expi;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setGain(double gain) {
            this.gain = gain;
        }

        public double getGain() {
            return gain;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getFee() {
            return fee;
        }

        public void setUf(String uf) {
            this.uf = uf;
        }

        public String getUf() {
            return uf;
        }

        public void setPayed(int payed) {
            this.payed = payed;
        }

        public int getPayed() {
            return payed;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public int getFlag() {
            return flag;
        }

        public void setCanextend(boolean canextend) {
            this.canextend = canextend;
        }

        public boolean getCanextend() {
            return canextend;
        }

    }
}
