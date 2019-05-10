package com.heiya123.music.vo.netease;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */

public class NeteaseMusicPic {

    private int code;
    private EqualizersBean equalizers;
    private List<SongsBean> songs;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public EqualizersBean getEqualizers() {
        return equalizers;
    }

    public void setEqualizers(EqualizersBean equalizers) {
        this.equalizers = equalizers;
    }

    public List<SongsBean> getSongs() {
        return songs;
    }

    public void setSongs(List<SongsBean> songs) {
        this.songs = songs;
    }

    public static class EqualizersBean {
    }

    public static class SongsBean {

        private AlbumBean album;
        private BMusicBean bMusic;
        private String commentThreadId;
        private String copyFrom;
        private int copyright;
        private int copyrightId;
        private int dayPlays;
        private String disc;
        private int duration;
        private int fee;
        private int ftype;
        private HMusicBean hMusic;
        private int hearTime;
        private int id;
        private LMusicBean lMusic;
        private MMusicBean mMusic;
        private String mp3Url;
        private int mvid;
        private String name;
        private int no;
        private int playedNum;
        private double popularity;
        private int position;
        private String ringtone;
        private int rtype;
        private int score;
        private boolean starred;
        private int starredNum;
        private int status;
        private List<?> alias;
        private List<ArtistsBeanX> artists;
        private List<?> rtUrls;

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public BMusicBean getBMusic() {
            return bMusic;
        }

        public void setBMusic(BMusicBean bMusic) {
            this.bMusic = bMusic;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public String getCopyFrom() {
            return copyFrom;
        }

        public void setCopyFrom(String copyFrom) {
            this.copyFrom = copyFrom;
        }

        public int getCopyright() {
            return copyright;
        }

        public void setCopyright(int copyright) {
            this.copyright = copyright;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public int getDayPlays() {
            return dayPlays;
        }

        public void setDayPlays(int dayPlays) {
            this.dayPlays = dayPlays;
        }

        public String getDisc() {
            return disc;
        }

        public void setDisc(String disc) {
            this.disc = disc;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getFtype() {
            return ftype;
        }

        public void setFtype(int ftype) {
            this.ftype = ftype;
        }

        public HMusicBean getHMusic() {
            return hMusic;
        }

        public void setHMusic(HMusicBean hMusic) {
            this.hMusic = hMusic;
        }

        public int getHearTime() {
            return hearTime;
        }

        public void setHearTime(int hearTime) {
            this.hearTime = hearTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public LMusicBean getLMusic() {
            return lMusic;
        }

        public void setLMusic(LMusicBean lMusic) {
            this.lMusic = lMusic;
        }

        public MMusicBean getMMusic() {
            return mMusic;
        }

        public void setMMusic(MMusicBean mMusic) {
            this.mMusic = mMusic;
        }

        public String getMp3Url() {
            return mp3Url;
        }

        public void setMp3Url(String mp3Url) {
            this.mp3Url = mp3Url;
        }

        public int getMvid() {
            return mvid;
        }

        public void setMvid(int mvid) {
            this.mvid = mvid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getPlayedNum() {
            return playedNum;
        }

        public void setPlayedNum(int playedNum) {
            this.playedNum = playedNum;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public String getRingtone() {
            return ringtone;
        }

        public void setRingtone(String ringtone) {
            this.ringtone = ringtone;
        }

        public int getRtype() {
            return rtype;
        }

        public void setRtype(int rtype) {
            this.rtype = rtype;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isStarred() {
            return starred;
        }

        public void setStarred(boolean starred) {
            this.starred = starred;
        }

        public int getStarredNum() {
            return starredNum;
        }

        public void setStarredNum(int starredNum) {
            this.starredNum = starredNum;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<?> getAlias() {
            return alias;
        }

        public void setAlias(List<?> alias) {
            this.alias = alias;
        }

        public List<ArtistsBeanX> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBeanX> artists) {
            this.artists = artists;
        }

        public List<?> getRtUrls() {
            return rtUrls;
        }

        public void setRtUrls(List<?> rtUrls) {
            this.rtUrls = rtUrls;
        }

        public static class AlbumBean {

            private ArtistBean artist;
            private String blurPicUrl;
            private String briefDesc;
            private String commentThreadId;
            private int companyId;
            private int copyrightId;
            private String description;
            private int id;
            private String name;
            private long pic;
            private long picId;
            private String picUrl;
            private long publishTime;
            private int size;
            private int status;
            private String subType;
            private String tags;
            private String type;
            private List<?> alias;
            private List<ArtistsBean> artists;
            private List<?> songs;

            public ArtistBean getArtist() {
                return artist;
            }

            public void setArtist(ArtistBean artist) {
                this.artist = artist;
            }

            public String getBlurPicUrl() {
                return blurPicUrl;
            }

            public void setBlurPicUrl(String blurPicUrl) {
                this.blurPicUrl = blurPicUrl;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public String getCommentThreadId() {
                return commentThreadId;
            }

            public void setCommentThreadId(String commentThreadId) {
                this.commentThreadId = commentThreadId;
            }

            public int getCompanyId() {
                return companyId;
            }

            public void setCompanyId(int companyId) {
                this.companyId = companyId;
            }

            public int getCopyrightId() {
                return copyrightId;
            }

            public void setCopyrightId(int copyrightId) {
                this.copyrightId = copyrightId;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public long getPic() {
                return pic;
            }

            public void setPic(long pic) {
                this.pic = pic;
            }

            public long getPicId() {
                return picId;
            }

            public void setPicId(long picId) {
                this.picId = picId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getSubType() {
                return subType;
            }

            public void setSubType(String subType) {
                this.subType = subType;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public List<ArtistsBean> getArtists() {
                return artists;
            }

            public void setArtists(List<ArtistsBean> artists) {
                this.artists = artists;
            }

            public List<?> getSongs() {
                return songs;
            }

            public void setSongs(List<?> songs) {
                this.songs = songs;
            }

            public static class ArtistBean {

                private int albumSize;
                private String briefDesc;
                private int id;
                private int img1v1Id;
                private String img1v1Url;
                private int musicSize;
                private String name;
                private int picId;
                private String picUrl;
                private String trans;
                private List<?> alias;

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getImg1v1Id() {
                    return img1v1Id;
                }

                public void setImg1v1Id(int img1v1Id) {
                    this.img1v1Id = img1v1Id;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getMusicSize() {
                    return musicSize;
                }

                public void setMusicSize(int musicSize) {
                    this.musicSize = musicSize;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getTrans() {
                    return trans;
                }

                public void setTrans(String trans) {
                    this.trans = trans;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }

            public static class ArtistsBean {

                private int albumSize;
                private String briefDesc;
                private int id;
                private int img1v1Id;
                private String img1v1Url;
                private int musicSize;
                private String name;
                private int picId;
                private String picUrl;
                private String trans;
                private List<?> alias;

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public String getBriefDesc() {
                    return briefDesc;
                }

                public void setBriefDesc(String briefDesc) {
                    this.briefDesc = briefDesc;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getImg1v1Id() {
                    return img1v1Id;
                }

                public void setImg1v1Id(int img1v1Id) {
                    this.img1v1Id = img1v1Id;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getMusicSize() {
                    return musicSize;
                }

                public void setMusicSize(int musicSize) {
                    this.musicSize = musicSize;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public String getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(String picUrl) {
                    this.picUrl = picUrl;
                }

                public String getTrans() {
                    return trans;
                }

                public void setTrans(String trans) {
                    this.trans = trans;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }
        }

        public static class BMusicBean {

            private int bitrate;
            private long dfsId;
            private String extension;
            private int id;
            private int playTime;
            private int size;
            private int sr;
            private double volumeDelta;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class HMusicBean {

            private int bitrate;
            private long dfsId;
            private String extension;
            private int id;
            private int playTime;
            private int size;
            private int sr;
            private double volumeDelta;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class LMusicBean {

            private int bitrate;
            private long dfsId;
            private String extension;
            private int id;
            private int playTime;
            private int size;
            private int sr;
            private double volumeDelta;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class MMusicBean {

            private int bitrate;
            private long dfsId;
            private String extension;
            private int id;
            private int playTime;
            private int size;
            private int sr;
            private double volumeDelta;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public long getDfsId() {
                return dfsId;
            }

            public void setDfsId(long dfsId) {
                this.dfsId = dfsId;
            }

            public String getExtension() {
                return extension;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPlayTime() {
                return playTime;
            }

            public void setPlayTime(int playTime) {
                this.playTime = playTime;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getSr() {
                return sr;
            }

            public void setSr(int sr) {
                this.sr = sr;
            }

            public double getVolumeDelta() {
                return volumeDelta;
            }

            public void setVolumeDelta(double volumeDelta) {
                this.volumeDelta = volumeDelta;
            }
        }

        public static class ArtistsBeanX {

            private int albumSize;
            private String briefDesc;
            private int id;
            private int img1v1Id;
            private String img1v1Url;
            private int musicSize;
            private String name;
            private int picId;
            private String picUrl;
            private String trans;
            private List<?> alias;

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(int img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPicId() {
                return picId;
            }

            public void setPicId(int picId) {
                this.picId = picId;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }
    }
}
