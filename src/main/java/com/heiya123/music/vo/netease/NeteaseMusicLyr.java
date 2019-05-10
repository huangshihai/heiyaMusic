package com.heiya123.music.vo.netease;

public class NeteaseMusicLyr {


    private int code;
    private Klyric klyric;
    private Lrc lrc;
    private boolean qfy;
    private boolean sfy;
    private boolean sgc;
    private Tlyric tlyric;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setKlyric(Klyric klyric) {
        this.klyric = klyric;
    }

    public Klyric getKlyric() {
        return klyric;
    }

    public void setLrc(Lrc lrc) {
        this.lrc = lrc;
    }

    public Lrc getLrc() {
        return lrc;
    }

    public void setQfy(boolean qfy) {
        this.qfy = qfy;
    }

    public boolean getQfy() {
        return qfy;
    }

    public void setSfy(boolean sfy) {
        this.sfy = sfy;
    }

    public boolean getSfy() {
        return sfy;
    }

    public void setSgc(boolean sgc) {
        this.sgc = sgc;
    }

    public boolean getSgc() {
        return sgc;
    }

    public void setTlyric(Tlyric tlyric) {
        this.tlyric = tlyric;
    }

    public Tlyric getTlyric() {
        return tlyric;
    }

    public static class Klyric {

        private String lyric;
        private int version;

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }

        public String getLyric() {
            return lyric;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getVersion() {
            return version;
        }

    }

    public static class Lrc {

        private String lyric;
        private int version;

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }

        public String getLyric() {
            return lyric;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getVersion() {
            return version;
        }

    }

    public static class Tlyric {

        private int version;

        public void setVersion(int version) {
            this.version = version;
        }

        public int getVersion() {
            return version;
        }

    }
}
