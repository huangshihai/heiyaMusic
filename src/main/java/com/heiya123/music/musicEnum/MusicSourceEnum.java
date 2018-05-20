package com.heiya123.music.musicEnum;

public enum MusicSourceEnum {
    QQMusic("tencent"),
    NeteaseMusic("netease"),
    KuGouMusic("kugou"),
    XiaMiMusic("xiami");

    private String source;

    private MusicSourceEnum(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
