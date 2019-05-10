package com.heiya123.music.vo.QQ;

import java.util.List;

public class QQMusicVkey {

    private int cid;
    private int code;
    private DataBean data;
    private String userip;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip;
    }

    public static class DataBean {
        /**
         * expiration : 80400
         * items : [{"filename":"C400003a1tne1nSz1Y.m4a","songmid":"003a1tne1nSz1Y","subcode":0,"vkey":"F51688FEB4770F6F665BF7D163A2C2163C2DA89BD115052477A65F7E71CF986BFA513198795662962BCF004E826DE138E7B7F4D50BDBE9E9"}]
         */

        private int expiration;
        private List<ItemsBean> items;

        public int getExpiration() {
            return expiration;
        }

        public void setExpiration(int expiration) {
            this.expiration = expiration;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * filename : C400003a1tne1nSz1Y.m4a
             * songmid : 003a1tne1nSz1Y
             * subcode : 0
             * vkey : F51688FEB4770F6F665BF7D163A2C2163C2DA89BD115052477A65F7E71CF986BFA513198795662962BCF004E826DE138E7B7F4D50BDBE9E9
             */

            private String filename;
            private String songmid;
            private int subcode;
            private String vkey;

            public String getFilename() {
                return filename;
            }

            public void setFilename(String filename) {
                this.filename = filename;
            }

            public String getSongmid() {
                return songmid;
            }

            public void setSongmid(String songmid) {
                this.songmid = songmid;
            }

            public int getSubcode() {
                return subcode;
            }

            public void setSubcode(int subcode) {
                this.subcode = subcode;
            }

            public String getVkey() {
                return vkey;
            }

            public void setVkey(String vkey) {
                this.vkey = vkey;
            }
        }
    }
}
