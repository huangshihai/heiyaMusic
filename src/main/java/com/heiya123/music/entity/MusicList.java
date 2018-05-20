package com.heiya123.music.entity;

import java.util.ArrayList;
import java.util.List;

public class MusicList {

    /**
     * cover : https://p3.music.126.net/34YW1QtKxJ_3YnX9ZzKhzw==/2946691234868155.jpg
     * creatorAvatar :
     * creatorName :
     * item : [{"album":"成都","artist":"赵雷","id":"436514312","lyric_id":"436514312","name":"成都","pic":"https://p3.music.126.net/34YW1QtKxJ_3YnX9ZzKhzw==/2946691234868155.jpg","pic_id":"2946691234868155","source":"qmkg","url":"","url_id":"436514312"}]
     * name : 为你聲沙
     */

    private String cover;
    private String creatorAvatar;
    private String creatorName;
    private String name;
    private List<ItemBean> item;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCreatorAvatar() {
        return creatorAvatar;
    }

    public void setCreatorAvatar(String creatorAvatar) {
        this.creatorAvatar = creatorAvatar;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemBean> getItem() {
        if(item == null){
            item = new ArrayList<ItemBean>();
        }
        return item;
    }

    public void setItem(List<ItemBean> item) {
        this.item = item;
    }

    public static class ItemBean {
        /**
         * album : 成都
         * artist : 赵雷
         * id : 436514312
         * lyric_id : 436514312
         * name : 成都
         * pic : https://p3.music.126.net/34YW1QtKxJ_3YnX9ZzKhzw==/2946691234868155.jpg
         * pic_id : 2946691234868155
         * source : qmkg
         * url :
         * url_id : 436514312
         */

        private String album;
        private String artist;
        private String id;
        private String lyric_id;
        private String name;
        private String pic;
        private String pic_id;
        private String source;
        private String url;
        private String url_id;

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLyric_id() {
            return lyric_id;
        }

        public void setLyric_id(String lyric_id) {
            this.lyric_id = lyric_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getPic_id() {
            return pic_id;
        }

        public void setPic_id(String pic_id) {
            this.pic_id = pic_id;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl_id() {
            return url_id;
        }

        public void setUrl_id(String url_id) {
            this.url_id = url_id;
        }
    }
}
