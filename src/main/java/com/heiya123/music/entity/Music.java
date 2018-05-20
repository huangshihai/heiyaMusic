package com.heiya123.music.entity;

public class Music {
    /**
     * 自增ID
     */
    private Long mid;

    /**
     * 音乐ID
     */
    private String id;
    /**
     * 音乐名字
     */
    private String name;
    /**
     * 专辑名称
     */
    private String album;
    /**
     * 艺术家名字
     */
    private String artist;
    /**
     * 歌词ID
     */
    private String lyric_id;
    /**
     * 封面ID
     */
    private String pic_id;
    /**
     * 音乐来源
     */
    private String source;
    /**
     * 链接ID
     */
    private String url_id;
    /**
     * 歌词
     */
    private String lyric = "";
    /**
     * 图片链接
     */
    private String pic = "";
    private String url = "";

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

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

    public String getUrl_id() {
        return url_id;
    }

    public void setUrl_id(String url_id) {
        this.url_id = url_id;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
