package com.heiya123.music.vo;

import com.heiya123.music.musicEnum.MusicType;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Music {

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
     * 链接ID
     */
    private String url_id;
    /**
     * 音乐来源
     */
    private MusicType type;
    /**
     * 歌词
     */
    private String lyric;
    /**
     * 图片链接
     */
    private String pic;
    /**
     * 音乐链接
     */
    private String url;

    private List<String> allRate;

}
