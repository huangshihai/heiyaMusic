package com.heiya123.music.vo.qmkg;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class QmkgMusic {

    /**
     * code : 0
     * data : {"has_more":1,"kge_uid":"619f94812d2e328e32","ugc_total_count":27,"ugclist":[{"albumid":1853998,"avatar":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000011IIJE3XYf9L.jpg?max_age=2592000","coment_count":0,"gift_count":0,"is_segment":false,"ksong_mid":"000SMykv0U4z12","play_count":21,"score_rank":0,"shareid":"OIjDoXO15_AIWO1J","stralbumid":"0011IIJE3XYf9L","time":1516537065,"title":"凉凉","ugcmask":4}]}
     * default : 0
     * message : ok
     * subcode : 0
     */

    private int code;
    private DataBean data;
    @JSONField(name="default")
    private int defaultX;
    private String message;
    private int subcode;

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

    public int getDefaultX() {
        return defaultX;
    }

    public void setDefaultX(int defaultX) {
        this.defaultX = defaultX;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }

    public static class DataBean {
        /**
         * has_more : 1
         * kge_uid : 619f94812d2e328e32
         * ugc_total_count : 27
         * ugclist : [{"albumid":1853998,"avatar":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000011IIJE3XYf9L.jpg?max_age=2592000","coment_count":0,"gift_count":0,"is_segment":false,"ksong_mid":"000SMykv0U4z12","play_count":21,"score_rank":0,"shareid":"OIjDoXO15_AIWO1J","stralbumid":"0011IIJE3XYf9L","time":1516537065,"title":"凉凉","ugcmask":4}]
         */

        private int has_more;
        private String kge_uid;
        private int ugc_total_count;
        private List<UgclistBean> ugclist;

        public int getHas_more() {
            return has_more;
        }

        public void setHas_more(int has_more) {
            this.has_more = has_more;
        }

        public String getKge_uid() {
            return kge_uid;
        }

        public void setKge_uid(String kge_uid) {
            this.kge_uid = kge_uid;
        }

        public int getUgc_total_count() {
            return ugc_total_count;
        }

        public void setUgc_total_count(int ugc_total_count) {
            this.ugc_total_count = ugc_total_count;
        }

        public List<UgclistBean> getUgclist() {
            return ugclist;
        }

        public void setUgclist(List<UgclistBean> ugclist) {
            this.ugclist = ugclist;
        }

        public static class UgclistBean {
            /**
             * albumid : 1853998
             * avatar : http://y.gtimg.cn/music/photo_new/T002R300x300M0000011IIJE3XYf9L.jpg?max_age=2592000
             * coment_count : 0
             * gift_count : 0
             * is_segment : false
             * ksong_mid : 000SMykv0U4z12
             * play_count : 21
             * score_rank : 0
             * shareid : OIjDoXO15_AIWO1J
             * stralbumid : 0011IIJE3XYf9L
             * time : 1516537065
             * title : 凉凉
             * ugcmask : 4
             */

            private int albumid;
            private String avatar;
            private int coment_count;
            private int gift_count;
            private boolean is_segment;
            private String ksong_mid;
            private int play_count;
            private int score_rank;
            private String shareid;
            private String stralbumid;
            private int time;
            private String title;
            private int ugcmask;

            public int getAlbumid() {
                return albumid;
            }

            public void setAlbumid(int albumid) {
                this.albumid = albumid;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getComent_count() {
                return coment_count;
            }

            public void setComent_count(int coment_count) {
                this.coment_count = coment_count;
            }

            public int getGift_count() {
                return gift_count;
            }

            public void setGift_count(int gift_count) {
                this.gift_count = gift_count;
            }

            public boolean isIs_segment() {
                return is_segment;
            }

            public void setIs_segment(boolean is_segment) {
                this.is_segment = is_segment;
            }

            public String getKsong_mid() {
                return ksong_mid;
            }

            public void setKsong_mid(String ksong_mid) {
                this.ksong_mid = ksong_mid;
            }

            public int getPlay_count() {
                return play_count;
            }

            public void setPlay_count(int play_count) {
                this.play_count = play_count;
            }

            public int getScore_rank() {
                return score_rank;
            }

            public void setScore_rank(int score_rank) {
                this.score_rank = score_rank;
            }

            public String getShareid() {
                return shareid;
            }

            public void setShareid(String shareid) {
                this.shareid = shareid;
            }

            public String getStralbumid() {
                return stralbumid;
            }

            public void setStralbumid(String stralbumid) {
                this.stralbumid = stralbumid;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUgcmask() {
                return ugcmask;
            }

            public void setUgcmask(int ugcmask) {
                this.ugcmask = ugcmask;
            }
        }
    }
}
