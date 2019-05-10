package com.heiya123.music.vo.xiami;

import java.util.List;

public class XiamiInfo {
        private Data data;
        private boolean status;
        public void setData(Data data) {
            this.data = data;
        }
        public Data getData() {
            return data;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
        public boolean getStatus() {
            return status;
        }
    public class Data {

        private int hqset;
        private int lastSongId;
        private List<TrackList> trackList;
        private String type;
        private int type_id;
        private String uid;
        private int vip;
        private int vip_role;
        public void setHqset(int hqset) {
            this.hqset = hqset;
        }
        public int getHqset() {
            return hqset;
        }

        public void setLastSongId(int lastSongId) {
            this.lastSongId = lastSongId;
        }
        public int getLastSongId() {
            return lastSongId;
        }

        public void setTrackList(List<TrackList> trackList) {
            this.trackList = trackList;
        }
        public List<TrackList> getTrackList() {
            return trackList;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setType_id(int type_id) {
            this.type_id = type_id;
        }
        public int getType_id() {
            return type_id;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
        public String getUid() {
            return uid;
        }

        public void setVip(int vip) {
            this.vip = vip;
        }
        public int getVip() {
            return vip;
        }

        public void setVip_role(int vip_role) {
            this.vip_role = vip_role;
        }
        public int getVip_role() {
            return vip_role;
        }
        public class TrackList {

            private int albumId;
            private String albumLanguage;
            private String albumStringId;
            private int album_id;
            private String album_logo;
            private String album_name;
            private String album_pic;
            private int aritst_type;
            private String arrangement;
            private String artist;
            private int artistId;
            private String artistStringId;
            private int artist_id;
            private String artist_name;
            private String artist_url;
            private String background;
            private int bakSongId;
            private List<String> bizTags;
            private int boughtCount;
            private int can_check;
            private int can_show;
            private int cdSerial;
            private int cd_serial;
            private int collectCount;
            private int collects;
            private String composer;
            private boolean demo;
            private long demoCreateTime;
            private boolean downloadCount;
            private String downloadjson;
            private int downloadstatus;
            private boolean exclusive;
            private int grade;
            private int insert_type;
            private int length;
            private String location;
            private String lyric;
            private LyricInfo lyricInfo;
            private String lyric_url;
            private String musicType;
            private int music_type;
            private int mvId;
            private String mvUrl;
            private String name;
            private int needpay;
            private String newSubName;
            private String new_sub_title;
            private String object_id;
            private String object_name;
            private boolean offLyric;
            private boolean offline;
            private boolean originOffline;
            private int pace;
            private int panFlag;
            private String pic;
            private String pinyin;
            private int playCount;
            private int play_volume;
            private int playstatus;
            private String publishStatus;
            private Purviews purviews;
            private String rec_note;
            private int recommendCount;
            private int recommends;
            private int s;
            private List<Integer> singerIds;
            private String singers;
            private List<SingersSource> singersSource;
            private String songId;
            private String songName;
            private String songOpt;
            private String songStringId;
            private String song_id;
            private String song_sub_title;
            private String songwriters;
            private String subName;
            private String sub_title;
            private List<String> tags;
            private String title;
            private int track;
            private String translation;
            private int tryhq;
            public void setAlbumId(int albumId) {
                this.albumId = albumId;
            }
            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumLanguage(String albumLanguage) {
                this.albumLanguage = albumLanguage;
            }
            public String getAlbumLanguage() {
                return albumLanguage;
            }

            public void setAlbumStringId(String albumStringId) {
                this.albumStringId = albumStringId;
            }
            public String getAlbumStringId() {
                return albumStringId;
            }

            public void setAlbum_id(int album_id) {
                this.album_id = album_id;
            }
            public int getAlbum_id() {
                return album_id;
            }

            public void setAlbum_logo(String album_logo) {
                this.album_logo = album_logo;
            }
            public String getAlbum_logo() {
                return album_logo;
            }

            public void setAlbum_name(String album_name) {
                this.album_name = album_name;
            }
            public String getAlbum_name() {
                return album_name;
            }

            public void setAlbum_pic(String album_pic) {
                this.album_pic = album_pic;
            }
            public String getAlbum_pic() {
                return album_pic;
            }

            public void setAritst_type(int aritst_type) {
                this.aritst_type = aritst_type;
            }
            public int getAritst_type() {
                return aritst_type;
            }

            public void setArrangement(String arrangement) {
                this.arrangement = arrangement;
            }
            public String getArrangement() {
                return arrangement;
            }

            public void setArtist(String artist) {
                this.artist = artist;
            }
            public String getArtist() {
                return artist;
            }

            public void setArtistId(int artistId) {
                this.artistId = artistId;
            }
            public int getArtistId() {
                return artistId;
            }

            public void setArtistStringId(String artistStringId) {
                this.artistStringId = artistStringId;
            }
            public String getArtistStringId() {
                return artistStringId;
            }

            public void setArtist_id(int artist_id) {
                this.artist_id = artist_id;
            }
            public int getArtist_id() {
                return artist_id;
            }

            public void setArtist_name(String artist_name) {
                this.artist_name = artist_name;
            }
            public String getArtist_name() {
                return artist_name;
            }

            public void setArtist_url(String artist_url) {
                this.artist_url = artist_url;
            }
            public String getArtist_url() {
                return artist_url;
            }

            public void setBackground(String background) {
                this.background = background;
            }
            public String getBackground() {
                return background;
            }

            public void setBakSongId(int bakSongId) {
                this.bakSongId = bakSongId;
            }
            public int getBakSongId() {
                return bakSongId;
            }

            public void setBizTags(List<String> bizTags) {
                this.bizTags = bizTags;
            }
            public List<String> getBizTags() {
                return bizTags;
            }

            public void setBoughtCount(int boughtCount) {
                this.boughtCount = boughtCount;
            }
            public int getBoughtCount() {
                return boughtCount;
            }

            public void setCan_check(int can_check) {
                this.can_check = can_check;
            }
            public int getCan_check() {
                return can_check;
            }

            public void setCan_show(int can_show) {
                this.can_show = can_show;
            }
            public int getCan_show() {
                return can_show;
            }

            public void setCdSerial(int cdSerial) {
                this.cdSerial = cdSerial;
            }
            public int getCdSerial() {
                return cdSerial;
            }

            public void setCd_serial(int cd_serial) {
                this.cd_serial = cd_serial;
            }
            public int getCd_serial() {
                return cd_serial;
            }

            public void setCollectCount(int collectCount) {
                this.collectCount = collectCount;
            }
            public int getCollectCount() {
                return collectCount;
            }

            public void setCollects(int collects) {
                this.collects = collects;
            }
            public int getCollects() {
                return collects;
            }

            public void setComposer(String composer) {
                this.composer = composer;
            }
            public String getComposer() {
                return composer;
            }

            public void setDemo(boolean demo) {
                this.demo = demo;
            }
            public boolean getDemo() {
                return demo;
            }

            public void setDemoCreateTime(long demoCreateTime) {
                this.demoCreateTime = demoCreateTime;
            }
            public long getDemoCreateTime() {
                return demoCreateTime;
            }

            public void setDownloadCount(boolean downloadCount) {
                this.downloadCount = downloadCount;
            }
            public boolean getDownloadCount() {
                return downloadCount;
            }

            public void setDownloadjson(String downloadjson) {
                this.downloadjson = downloadjson;
            }
            public String getDownloadjson() {
                return downloadjson;
            }

            public void setDownloadstatus(int downloadstatus) {
                this.downloadstatus = downloadstatus;
            }
            public int getDownloadstatus() {
                return downloadstatus;
            }

            public void setExclusive(boolean exclusive) {
                this.exclusive = exclusive;
            }
            public boolean getExclusive() {
                return exclusive;
            }

            public void setGrade(int grade) {
                this.grade = grade;
            }
            public int getGrade() {
                return grade;
            }

            public void setInsert_type(int insert_type) {
                this.insert_type = insert_type;
            }
            public int getInsert_type() {
                return insert_type;
            }

            public void setLength(int length) {
                this.length = length;
            }
            public int getLength() {
                return length;
            }

            public void setLocation(String location) {
                this.location = location;
            }
            public String getLocation() {
                return location;
            }

            public void setLyric(String lyric) {
                this.lyric = lyric;
            }
            public String getLyric() {
                return lyric;
            }

            public void setLyricInfo(LyricInfo lyricInfo) {
                this.lyricInfo = lyricInfo;
            }
            public LyricInfo getLyricInfo() {
                return lyricInfo;
            }

            public void setLyric_url(String lyric_url) {
                this.lyric_url = lyric_url;
            }
            public String getLyric_url() {
                return lyric_url;
            }

            public void setMusicType(String musicType) {
                this.musicType = musicType;
            }
            public String getMusicType() {
                return musicType;
            }

            public void setMusic_type(int music_type) {
                this.music_type = music_type;
            }
            public int getMusic_type() {
                return music_type;
            }

            public void setMvId(int mvId) {
                this.mvId = mvId;
            }
            public int getMvId() {
                return mvId;
            }

            public void setMvUrl(String mvUrl) {
                this.mvUrl = mvUrl;
            }
            public String getMvUrl() {
                return mvUrl;
            }

            public void setName(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }

            public void setNeedpay(int needpay) {
                this.needpay = needpay;
            }
            public int getNeedpay() {
                return needpay;
            }

            public void setNewSubName(String newSubName) {
                this.newSubName = newSubName;
            }
            public String getNewSubName() {
                return newSubName;
            }

            public void setNew_sub_title(String new_sub_title) {
                this.new_sub_title = new_sub_title;
            }
            public String getNew_sub_title() {
                return new_sub_title;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }
            public String getObject_id() {
                return object_id;
            }

            public void setObject_name(String object_name) {
                this.object_name = object_name;
            }
            public String getObject_name() {
                return object_name;
            }

            public void setOffLyric(boolean offLyric) {
                this.offLyric = offLyric;
            }
            public boolean getOffLyric() {
                return offLyric;
            }

            public void setOffline(boolean offline) {
                this.offline = offline;
            }
            public boolean getOffline() {
                return offline;
            }

            public void setOriginOffline(boolean originOffline) {
                this.originOffline = originOffline;
            }
            public boolean getOriginOffline() {
                return originOffline;
            }

            public void setPace(int pace) {
                this.pace = pace;
            }
            public int getPace() {
                return pace;
            }

            public void setPanFlag(int panFlag) {
                this.panFlag = panFlag;
            }
            public int getPanFlag() {
                return panFlag;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }
            public String getPic() {
                return pic;
            }

            public void setPinyin(String pinyin) {
                this.pinyin = pinyin;
            }
            public String getPinyin() {
                return pinyin;
            }

            public void setPlayCount(int playCount) {
                this.playCount = playCount;
            }
            public int getPlayCount() {
                return playCount;
            }

            public void setPlay_volume(int play_volume) {
                this.play_volume = play_volume;
            }
            public int getPlay_volume() {
                return play_volume;
            }

            public void setPlaystatus(int playstatus) {
                this.playstatus = playstatus;
            }
            public int getPlaystatus() {
                return playstatus;
            }

            public void setPublishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
            }
            public String getPublishStatus() {
                return publishStatus;
            }

            public void setPurviews(Purviews purviews) {
                this.purviews = purviews;
            }
            public Purviews getPurviews() {
                return purviews;
            }

            public void setRec_note(String rec_note) {
                this.rec_note = rec_note;
            }
            public String getRec_note() {
                return rec_note;
            }

            public void setRecommendCount(int recommendCount) {
                this.recommendCount = recommendCount;
            }
            public int getRecommendCount() {
                return recommendCount;
            }

            public void setRecommends(int recommends) {
                this.recommends = recommends;
            }
            public int getRecommends() {
                return recommends;
            }

            public void setS(int s) {
                this.s = s;
            }
            public int getS() {
                return s;
            }

            public void setSingerIds(List<Integer> singerIds) {
                this.singerIds = singerIds;
            }
            public List<Integer> getSingerIds() {
                return singerIds;
            }

            public void setSingers(String singers) {
                this.singers = singers;
            }
            public String getSingers() {
                return singers;
            }

            public void setSingersSource(List<SingersSource> singersSource) {
                this.singersSource = singersSource;
            }
            public List<SingersSource> getSingersSource() {
                return singersSource;
            }

            public void setSongId(String songId) {
                this.songId = songId;
            }
            public String getSongId() {
                return songId;
            }

            public void setSongName(String songName) {
                this.songName = songName;
            }
            public String getSongName() {
                return songName;
            }

            public void setSongOpt(String songOpt) {
                this.songOpt = songOpt;
            }
            public String getSongOpt() {
                return songOpt;
            }

            public void setSongStringId(String songStringId) {
                this.songStringId = songStringId;
            }
            public String getSongStringId() {
                return songStringId;
            }

            public void setSong_id(String song_id) {
                this.song_id = song_id;
            }
            public String getSong_id() {
                return song_id;
            }

            public void setSong_sub_title(String song_sub_title) {
                this.song_sub_title = song_sub_title;
            }
            public String getSong_sub_title() {
                return song_sub_title;
            }

            public void setSongwriters(String songwriters) {
                this.songwriters = songwriters;
            }
            public String getSongwriters() {
                return songwriters;
            }

            public void setSubName(String subName) {
                this.subName = subName;
            }
            public String getSubName() {
                return subName;
            }

            public void setSub_title(String sub_title) {
                this.sub_title = sub_title;
            }
            public String getSub_title() {
                return sub_title;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }
            public List<String> getTags() {
                return tags;
            }

            public void setTitle(String title) {
                this.title = title;
            }
            public String getTitle() {
                return title;
            }

            public void setTrack(int track) {
                this.track = track;
            }
            public int getTrack() {
                return track;
            }

            public void setTranslation(String translation) {
                this.translation = translation;
            }
            public String getTranslation() {
                return translation;
            }

            public void setTryhq(int tryhq) {
                this.tryhq = tryhq;
            }
            public int getTryhq() {
                return tryhq;
            }
            public class SingersSource {

                private int albumCount;
                private String alias;
                private String area;
                private int artistId;
                private String artistLogo;
                private String artistName;
                private String artistStringId;
                private String description;
                private boolean isMusician;
                private boolean isShow;
                private String pinyin;
                public void setAlbumCount(int albumCount) {
                    this.albumCount = albumCount;
                }
                public int getAlbumCount() {
                    return albumCount;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }
                public String getAlias() {
                    return alias;
                }

                public void setArea(String area) {
                    this.area = area;
                }
                public String getArea() {
                    return area;
                }

                public void setArtistId(int artistId) {
                    this.artistId = artistId;
                }
                public int getArtistId() {
                    return artistId;
                }

                public void setArtistLogo(String artistLogo) {
                    this.artistLogo = artistLogo;
                }
                public String getArtistLogo() {
                    return artistLogo;
                }

                public void setArtistName(String artistName) {
                    this.artistName = artistName;
                }
                public String getArtistName() {
                    return artistName;
                }

                public void setArtistStringId(String artistStringId) {
                    this.artistStringId = artistStringId;
                }
                public String getArtistStringId() {
                    return artistStringId;
                }

                public void setDescription(String description) {
                    this.description = description;
                }
                public String getDescription() {
                    return description;
                }

                public void setIsMusician(boolean isMusician) {
                    this.isMusician = isMusician;
                }
                public boolean getIsMusician() {
                    return isMusician;
                }

                public void setIsShow(boolean isShow) {
                    this.isShow = isShow;
                }
                public boolean getIsShow() {
                    return isShow;
                }

                public void setPinyin(String pinyin) {
                    this.pinyin = pinyin;
                }
                public String getPinyin() {
                    return pinyin;
                }

            }
            public class Purviews {

                private DOWNLOAD DOWNLOAD;
                private LISTEN LISTEN;
                public void setDOWNLOAD(DOWNLOAD DOWNLOAD) {
                    this.DOWNLOAD = DOWNLOAD;
                }
                public DOWNLOAD getDOWNLOAD() {
                    return DOWNLOAD;
                }

                public void setLISTEN(LISTEN LISTEN) {
                    this.LISTEN = LISTEN;
                }
                public LISTEN getLISTEN() {
                    return LISTEN;
                }
                public class DOWNLOAD {

                    private String HIGH;
                    private String LOW;
                    public void setHIGH(String HIGH) {
                        this.HIGH = HIGH;
                    }
                    public String getHIGH() {
                        return HIGH;
                    }

                    public void setLOW(String LOW) {
                        this.LOW = LOW;
                    }
                    public String getLOW() {
                        return LOW;
                    }

                }
                public class LISTEN {

                    private String HIGH;
                    private String LOW;
                    public void setHIGH(String HIGH) {
                        this.HIGH = HIGH;
                    }
                    public String getHIGH() {
                        return HIGH;
                    }

                    public void setLOW(String LOW) {
                        this.LOW = LOW;
                    }
                    public String getLOW() {
                        return LOW;
                    }

                }

            }
            public class LyricInfo {

                private boolean isOfficial;
                private String lyricFile;
                private int lyricId;
                private int lyricType;
                public void setIsOfficial(boolean isOfficial) {
                    this.isOfficial = isOfficial;
                }
                public boolean getIsOfficial() {
                    return isOfficial;
                }

                public void setLyricFile(String lyricFile) {
                    this.lyricFile = lyricFile;
                }
                public String getLyricFile() {
                    return lyricFile;
                }

                public void setLyricId(int lyricId) {
                    this.lyricId = lyricId;
                }
                public int getLyricId() {
                    return lyricId;
                }

                public void setLyricType(int lyricType) {
                    this.lyricType = lyricType;
                }
                public int getLyricType() {
                    return lyricType;
                }

            }

        }
    }
}
