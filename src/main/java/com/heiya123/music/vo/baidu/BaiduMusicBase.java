package com.heiya123.music.vo.baidu;

import lombok.Setter;
import lombok.Getter;

import java.util.List;

@Setter
@Getter
public class BaiduMusicBase {

    private String query;
    private int is_artist;
    private int is_album;
    private String rs_words;
    private PagesBean pages;
    private ArtistBean artist;
    private List<SongListBean> song_list;

    @Setter
    @Getter
    public static class PagesBean {

        private String total;
        private String rn_num;

    }

    @Setter
    @Getter
    public static class ArtistBean {

        private int artist_id;
        private String ting_uid;
        private String name;
        private String country;
        private String albums_total;
        private String songs_total;
        private AvatarBean avatar;


        public static class AvatarBean {

            private String small;
            private String big;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getBig() {
                return big;
            }

            public void setBig(String big) {
                this.big = big;
            }
        }
    }

    @Setter
    @Getter
    public static class SongListBean {

        private String title;
        private String song_id;
        private String author;
        private String artist_id;
        private String all_artist_id;
        private String album_title;
        private String appendix;
        private String album_id;
        private String lrclink;
        private String resource_type;
        private String content;
        private int relate_status;
        private int havehigh;
        private String copy_type;
        private String del_status;
        private String all_rate;
        private int has_mv;
        private int has_mv_mobile;
        private String mv_provider;
        private int charge;
        private String toneid;
        private String info;
        private int data_source;
        private int learn;
    }
}
