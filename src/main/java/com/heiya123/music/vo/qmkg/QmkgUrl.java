package com.heiya123.music.vo.qmkg;

import java.util.List;

public class QmkgUrl {
    private DetailBean detail;
    private DownloadConfigBean downloadConfig;
    private boolean isMV;
    private boolean isPcQQMusic;
    private boolean isTest;
    private LangBean lang;
    private String langType;
    private boolean nohref;
    private int rawCode;
    private String rawMessage;
    private ShareBean share;
    private String shareid;

    public DetailBean getDetail() {
        return detail;
    }

    public void setDetail(DetailBean detail) {
        this.detail = detail;
    }

    public DownloadConfigBean getDownloadConfig() {
        return downloadConfig;
    }

    public void setDownloadConfig(DownloadConfigBean downloadConfig) {
        this.downloadConfig = downloadConfig;
    }

    public boolean isIsMV() {
        return isMV;
    }

    public void setIsMV(boolean isMV) {
        this.isMV = isMV;
    }

    public boolean isIsPcQQMusic() {
        return isPcQQMusic;
    }

    public void setIsPcQQMusic(boolean isPcQQMusic) {
        this.isPcQQMusic = isPcQQMusic;
    }

    public boolean isIsTest() {
        return isTest;
    }

    public void setIsTest(boolean isTest) {
        this.isTest = isTest;
    }

    public LangBean getLang() {
        return lang;
    }

    public void setLang(LangBean lang) {
        this.lang = lang;
    }

    public String getLangType() {
        return langType;
    }

    public void setLangType(String langType) {
        this.langType = langType;
    }

    public boolean isNohref() {
        return nohref;
    }

    public void setNohref(boolean nohref) {
        this.nohref = nohref;
    }

    public int getRawCode() {
        return rawCode;
    }

    public void setRawCode(int rawCode) {
        this.rawCode = rawCode;
    }

    public String getRawMessage() {
        return rawMessage;
    }

    public void setRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
    }

    public ShareBean getShare() {
        return share;
    }

    public void setShare(ShareBean share) {
        this.share = share;
    }

    public String getShareid() {
        return shareid;
    }

    public void setShareid(String shareid) {
        this.shareid = shareid;
    }

    public static class DetailBean {
        /**
         * _uid : 712074239
         * activity_id : 0
         * avatar : http://shp.qlogo.cn/ttsing/712074239/712074239/100
         * client_key : ebc8fcae-862a-4ce4-b914-839ffc9c9572
         * comment_num : 5
         * comments : [{"avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","comment_id":"405664884_1533200054_61599_622","content":"感谢友友的合作，友友唱得真棒","ctime":1533200054,"is_owner":0,"nick":"湖南锑城胶粘剂厂","reply_avatar":"","reply_nick":"","uid":"669d988323293f8330"},{"avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","comment_id":"405664884_1533200056_593871_5464","content":"气息稳如山，音准稳如钟","ctime":1533200056,"is_owner":0,"nick":"湖南锑城胶粘剂厂","reply_avatar":"","reply_nick":"","uid":"669d988323293f8330"},{"avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","comment_id":"405664884_1533200059_13504_2003","content":"靓颖海豚音在你面前也不过如此！","ctime":1533200059,"is_owner":0,"nick":"湖南锑城胶粘剂厂","reply_avatar":"","reply_nick":"","uid":"669d988323293f8330"},{"avatar":"http://shp.qlogo.cn/ttsing/712074239/712074239/100","comment_id":"712074239_1533200304_708413_872","content":"谢谢鼓励","ctime":1533200304,"is_owner":1,"nick":"荷塘月色","reply_avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","reply_nick":"湖南锑城胶粘剂厂","uid":"659c9f85222935883d"},{"avatar":"http://shp.qlogo.cn/ttsing/712074239/712074239/100","comment_id":"712074239_1533200325_216938_133","content":"谢谢你夸奖","ctime":1533200325,"is_owner":1,"nick":"荷塘月色","reply_avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","reply_nick":"湖南锑城胶粘剂厂","uid":"659c9f85222935883d"}]
         * content : 我参与了合唱，快来听听吧~
         * cover : http://shp.qpic.cn/ttkg/712074239/c14dfaeeea7e7691047e47ef83f9fafc598173ac/640?j=PiajxSqBRaEIf0bHhsJQ0QVoFSjos8ibuwib8icMibSGWGru7aj84uAW826V84GUk58dtVGrIjzPEcNIuZJAHJGfHTCuxsBCF1uUwfiaqFmlUqHSQErwM2qv5ScQ5V1Pbqib4zCoMUOXfAyAlU
         * ctime : 1533199474
         * f_lat : 25.6571
         * f_lon : 25.6571114.748
         * fb_cover : http://shp.qpic.cn/ttkg/712074239/c14dfaeeea7e7691047e47ef83f9fafc598173ac/200?j=PiajxSqBRaEIf0bHhsJQ0QVoFSjos8ibuwib8icMibSGWGru7aj84uAW826V84GUk58dtqf27eKC51gRtLapYyjVa4yxXoLicV8IShnIZ00IXUfgYuf3vibmHnI0CORqjWaDbfyGJib9rnqGDyg
         * file_mid : 003Fbi1W3ob9an
         * flower : [{"avatar":"http://shp.qlogo.cn/ttsing/405664884/405664884/100","nick":"湖南锑城胶粘剂厂","num":1,"type":0,"uIsInvisble":4147728384,"uid":"669d988323293f8330"},{"avatar":"http://shp.qlogo.cn/ttsing/712074239/712074239/100","nick":"荷塘月色","num":9,"type":1,"uIsInvisble":4147728384,"uid":"659c9f85222935883d"}]
         * flower_num : 9
         * gift_num : 1
         * hc_avatar : http://shp.qlogo.cn/ttsing/405664884/405664884/100
         * hc_level : 17
         * hc_nick : 湖南锑城胶粘剂厂
         * hc_second_sing_count : 0
         * hc_ugcid_half : 405664884_1526332285_1911
         * hc_uid : 669d988323293f8330
         * iHasCp : 1
         * is_anonymous : 0
         * is_segment : 0
         * kg_nick : 荷塘月色
         * ksong_mid : 0048tTJo46ZnT6
         * lSongMask : 18432
         * level : 4
         * mapAuth : {"0":"","10":"0","15":"0","19":"0","20":"0","21":"0","22":"0","3":"0","8":"0","9":"0"}
         * mapRight : {}
         * nick : 荷塘月色
         * not_show_qrc_mask : 0
         * photos : []
         * play_num : 5
         * playurl :
         * playurl_video : http://dl.stream.kg.qq.com/shkge/b3d4a33fc86306711629512a8c9504c6c11f9516?ftnrkey=cc9e352797b7170a15114b06d816149e53ecd362112e67bdb612e62498261f9237a269747c8a08dcb655e9038d4bac057b0e7747006e6831195c640e8b1159eb&vkey=03CB87A08A6B98A6E45FA93E065BC0DFF269931AFA1DE5A5B982DD14BCAA8B653C9805FA24C8B34BEF343F39C7697D828C87F312B0B23D2BE3FFFE527F97D4EF67C7DB71E48D862963B81BA7D70A57F965C81801D59EBABB&fname=81_0169cfeeea7e7691557e47ef83f9fafc598104ae.0.mp4&fromtag=1508&sdtfrom=v1508
         * poi_id : 15891749220611781553
         * score : 1892
         * scoreRank : 5
         * segment_end : 226046
         * segment_start : 0
         * sentence_count : 20
         * short_video_tag_id :
         * singer_mid : 0040MELG3TS8OW
         * singer_name : 费玉清
         * song_name : 一剪梅(Live)
         * tail_name : 小米5X
         * total : 5
         * ugc_id : 712074239_1533199474_2640
         * ugc_mask : 32773
         * ugctype : 2
         * uid : 659c9f85222935883d
         * userNick : 荷塘月色
         */

        private String _uid;
        private int activity_id;
        private String avatar;
        private String client_key;
        private int comment_num;
        private String content;
        private String cover;
        private int ctime;
        private String f_lat;
        private String f_lon;
        private String fb_cover;
        private String file_mid;
        private int flower_num;
        private int gift_num;
        private String hc_avatar;
        private int hc_level;
        private String hc_nick;
        private int hc_second_sing_count;
        private String hc_ugcid_half;
        private String hc_uid;
        private int iHasCp;
        private int is_anonymous;
        private int is_segment;
        private String kg_nick;
        private String ksong_mid;
        private int lSongMask;
        private int level;
        private MapAuthBean mapAuth;
        private MapRightBean mapRight;
        private String nick;
        private int not_show_qrc_mask;
        private int play_num;
        private String playurl;
        private String playurl_video;
        private String poi_id;
        private int score;
        private int scoreRank;
        private int segment_end;
        private int segment_start;
        private int sentence_count;
        private String short_video_tag_id;
        private String singer_mid;
        private String singer_name;
        private String song_name;
        private String tail_name;
        private int total;
        private String ugc_id;
        private int ugc_mask;
        private int ugctype;
        private String uid;
        private String userNick;
        private List<CommentsBean> comments;
        private List<FlowerBean> flower;
        private List<?> photos;

        public String get_uid() {
            return _uid;
        }

        public void set_uid(String _uid) {
            this._uid = _uid;
        }

        public int getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(int activity_id) {
            this.activity_id = activity_id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getClient_key() {
            return client_key;
        }

        public void setClient_key(String client_key) {
            this.client_key = client_key;
        }

        public int getComment_num() {
            return comment_num;
        }

        public void setComment_num(int comment_num) {
            this.comment_num = comment_num;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getCtime() {
            return ctime;
        }

        public void setCtime(int ctime) {
            this.ctime = ctime;
        }

        public String getF_lat() {
            return f_lat;
        }

        public void setF_lat(String f_lat) {
            this.f_lat = f_lat;
        }

        public String getF_lon() {
            return f_lon;
        }

        public void setF_lon(String f_lon) {
            this.f_lon = f_lon;
        }

        public String getFb_cover() {
            return fb_cover;
        }

        public void setFb_cover(String fb_cover) {
            this.fb_cover = fb_cover;
        }

        public String getFile_mid() {
            return file_mid;
        }

        public void setFile_mid(String file_mid) {
            this.file_mid = file_mid;
        }

        public int getFlower_num() {
            return flower_num;
        }

        public void setFlower_num(int flower_num) {
            this.flower_num = flower_num;
        }

        public int getGift_num() {
            return gift_num;
        }

        public void setGift_num(int gift_num) {
            this.gift_num = gift_num;
        }

        public String getHc_avatar() {
            return hc_avatar;
        }

        public void setHc_avatar(String hc_avatar) {
            this.hc_avatar = hc_avatar;
        }

        public int getHc_level() {
            return hc_level;
        }

        public void setHc_level(int hc_level) {
            this.hc_level = hc_level;
        }

        public String getHc_nick() {
            return hc_nick;
        }

        public void setHc_nick(String hc_nick) {
            this.hc_nick = hc_nick;
        }

        public int getHc_second_sing_count() {
            return hc_second_sing_count;
        }

        public void setHc_second_sing_count(int hc_second_sing_count) {
            this.hc_second_sing_count = hc_second_sing_count;
        }

        public String getHc_ugcid_half() {
            return hc_ugcid_half;
        }

        public void setHc_ugcid_half(String hc_ugcid_half) {
            this.hc_ugcid_half = hc_ugcid_half;
        }

        public String getHc_uid() {
            return hc_uid;
        }

        public void setHc_uid(String hc_uid) {
            this.hc_uid = hc_uid;
        }

        public int getIHasCp() {
            return iHasCp;
        }

        public void setIHasCp(int iHasCp) {
            this.iHasCp = iHasCp;
        }

        public int getIs_anonymous() {
            return is_anonymous;
        }

        public void setIs_anonymous(int is_anonymous) {
            this.is_anonymous = is_anonymous;
        }

        public int getIs_segment() {
            return is_segment;
        }

        public void setIs_segment(int is_segment) {
            this.is_segment = is_segment;
        }

        public String getKg_nick() {
            return kg_nick;
        }

        public void setKg_nick(String kg_nick) {
            this.kg_nick = kg_nick;
        }

        public String getKsong_mid() {
            return ksong_mid;
        }

        public void setKsong_mid(String ksong_mid) {
            this.ksong_mid = ksong_mid;
        }

        public int getLSongMask() {
            return lSongMask;
        }

        public void setLSongMask(int lSongMask) {
            this.lSongMask = lSongMask;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public MapAuthBean getMapAuth() {
            return mapAuth;
        }

        public void setMapAuth(MapAuthBean mapAuth) {
            this.mapAuth = mapAuth;
        }

        public MapRightBean getMapRight() {
            return mapRight;
        }

        public void setMapRight(MapRightBean mapRight) {
            this.mapRight = mapRight;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public int getNot_show_qrc_mask() {
            return not_show_qrc_mask;
        }

        public void setNot_show_qrc_mask(int not_show_qrc_mask) {
            this.not_show_qrc_mask = not_show_qrc_mask;
        }

        public int getPlay_num() {
            return play_num;
        }

        public void setPlay_num(int play_num) {
            this.play_num = play_num;
        }

        public String getPlayurl() {
            return playurl;
        }

        public void setPlayurl(String playurl) {
            this.playurl = playurl;
        }

        public String getPlayurl_video() {
            return playurl_video;
        }

        public void setPlayurl_video(String playurl_video) {
            this.playurl_video = playurl_video;
        }

        public String getPoi_id() {
            return poi_id;
        }

        public void setPoi_id(String poi_id) {
            this.poi_id = poi_id;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScoreRank() {
            return scoreRank;
        }

        public void setScoreRank(int scoreRank) {
            this.scoreRank = scoreRank;
        }

        public int getSegment_end() {
            return segment_end;
        }

        public void setSegment_end(int segment_end) {
            this.segment_end = segment_end;
        }

        public int getSegment_start() {
            return segment_start;
        }

        public void setSegment_start(int segment_start) {
            this.segment_start = segment_start;
        }

        public int getSentence_count() {
            return sentence_count;
        }

        public void setSentence_count(int sentence_count) {
            this.sentence_count = sentence_count;
        }

        public String getShort_video_tag_id() {
            return short_video_tag_id;
        }

        public void setShort_video_tag_id(String short_video_tag_id) {
            this.short_video_tag_id = short_video_tag_id;
        }

        public String getSinger_mid() {
            return singer_mid;
        }

        public void setSinger_mid(String singer_mid) {
            this.singer_mid = singer_mid;
        }

        public String getSinger_name() {
            return singer_name;
        }

        public void setSinger_name(String singer_name) {
            this.singer_name = singer_name;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public String getTail_name() {
            return tail_name;
        }

        public void setTail_name(String tail_name) {
            this.tail_name = tail_name;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public String getUgc_id() {
            return ugc_id;
        }

        public void setUgc_id(String ugc_id) {
            this.ugc_id = ugc_id;
        }

        public int getUgc_mask() {
            return ugc_mask;
        }

        public void setUgc_mask(int ugc_mask) {
            this.ugc_mask = ugc_mask;
        }

        public int getUgctype() {
            return ugctype;
        }

        public void setUgctype(int ugctype) {
            this.ugctype = ugctype;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUserNick() {
            return userNick;
        }

        public void setUserNick(String userNick) {
            this.userNick = userNick;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public List<FlowerBean> getFlower() {
            return flower;
        }

        public void setFlower(List<FlowerBean> flower) {
            this.flower = flower;
        }

        public List<?> getPhotos() {
            return photos;
        }

        public void setPhotos(List<?> photos) {
            this.photos = photos;
        }

        public static class MapAuthBean {
        }

        public static class MapRightBean {
        }

        public static class CommentsBean {
            /**
             * avatar : http://shp.qlogo.cn/ttsing/405664884/405664884/100
             * comment_id : 405664884_1533200054_61599_622
             * content : 感谢友友的合作，友友唱得真棒
             * ctime : 1533200054
             * is_owner : 0
             * nick : 湖南锑城胶粘剂厂
             * reply_avatar :
             * reply_nick :
             * uid : 669d988323293f8330
             */

            private String avatar;
            private String comment_id;
            private String content;
            private int ctime;
            private int is_owner;
            private String nick;
            private String reply_avatar;
            private String reply_nick;
            private String uid;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getComment_id() {
                return comment_id;
            }

            public void setComment_id(String comment_id) {
                this.comment_id = comment_id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public int getIs_owner() {
                return is_owner;
            }

            public void setIs_owner(int is_owner) {
                this.is_owner = is_owner;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public String getReply_avatar() {
                return reply_avatar;
            }

            public void setReply_avatar(String reply_avatar) {
                this.reply_avatar = reply_avatar;
            }

            public String getReply_nick() {
                return reply_nick;
            }

            public void setReply_nick(String reply_nick) {
                this.reply_nick = reply_nick;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }

        public static class FlowerBean {
            /**
             * avatar : http://shp.qlogo.cn/ttsing/405664884/405664884/100
             * nick : 湖南锑城胶粘剂厂
             * num : 1
             * type : 0
             * uIsInvisble : 4147728384
             * uid : 669d988323293f8330
             */

            private String avatar;
            private String nick;
            private int num;
            private int type;
            private long uIsInvisble;
            private String uid;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getNick() {
                return nick;
            }

            public void setNick(String nick) {
                this.nick = nick;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public long getUIsInvisble() {
                return uIsInvisble;
            }

            public void setUIsInvisble(long uIsInvisble) {
                this.uIsInvisble = uIsInvisble;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }
    }

    public static class DownloadConfigBean {
        /**
         * link : http://d3g.qq.com/musicapp/kge/4010/karaoke_5.2.5.278_android_c59923_20180730125823_release_WXCPFEED_D.apk
         * md5 : e83206b5387199175ba7c601add0dd45
         */

        private String link;
        private String md5;

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }
    }

    public static class LangBean {
        /**
         * alert_title : 弹窗标题
         * anko : 安子
         * bullet : 弹幕
         * cancel : 取消
         * close : 关闭
         * comment_max_length : 评论不能超过140个字符
         * comment_success : 评论成功
         * comments : 评论
         * confirm : 确定
         * dowload_now : 立即下载
         * download : 下载
         * download_get_flower : 想要更多鲜花？快去下载全民K歌APP吧！
         * download_see_friends_comment : 下载全民K歌APP，可以查看好友的回复哦！
         * download_see_more : 下载全民K歌，演唱这首歌
         * download_see_more_comment : 我也要评论
         * follow : 关注
         * friend_invite : 邀你一起来玩全民K歌啦！
         * gift_rank : 礼物榜
         * give_flower : 现在就去给好友的作品送花吧！
         * iam : 我是
         * introduce : 查看作品详情、参与互动，尽在《全民K歌》
         * invite_download : 我在全民K歌等你哦，快来下载全民K歌一起玩吧！
         * login : 登录信息失效，请重新登录
         * more_songs : 更多作品
         * musicerr_hint : 播放错误，请刷新重试
         * no_data_hint : 此作品不存在或被用户删除
         * none_flower : 鲜花已送完
         * open : 打开
         * open_see_more : 打开全民K歌，演唱这首歌
         * open_see_more_comment : 我也要评论
         * qiangshafa : 抢沙发的机会只有一次，你还等什么？
         * qrcode : 二维码
         * qzone : QQ空间
         * recieve_flower : 立即领取
         * register_flower : 加入K歌获得鲜花10朵
         * retry : 网络错误，请稍后重试
         * scan_follow : 扫一扫关注我
         * send_comment : 发送
         * send_flower : 给发表者送花
         * seo_tit_e : ，你也来下载和朋友们争夺擂主吧！
         * seo_tit_s : 在全民k歌录制了一首
         * share_intro : 全民K歌，KTV交友社区
         * share_tit_e : 》太棒了，快来听听（来自全民K歌，立即下载
         * share_tit_s : 唱的《
         * share_to : 分享到：
         * singer_count : 人合唱过
         * today : 今天
         * total : 累计
         * use_browser : 请用浏览器打开此页面，体验该功能哦
         * view_detail : 查看作品详情
         * view_more_comment : 查看更多评论
         * want_sing : 我也要唱
         * want_your_comment : 期待你的神评论
         * wechat_scan : 微信扫描分享朋友圈
         * weibo : 新浪微博
         * wesing : 全民K歌
         * yesterday : 昨天
         * yourfriend : 你的好友
         */

        private String alert_title;
        private String anko;
        private String bullet;
        private String cancel;
        private String close;
        private String comment_max_length;
        private String comment_success;
        private String comments;
        private String confirm;
        private String dowload_now;
        private String download;
        private String download_get_flower;
        private String download_see_friends_comment;
        private String download_see_more;
        private String download_see_more_comment;
        private String follow;
        private String friend_invite;
        private String gift_rank;
        private String give_flower;
        private String iam;
        private String introduce;
        private String invite_download;
        private String login;
        private String more_songs;
        private String musicerr_hint;
        private String no_data_hint;
        private String none_flower;
        private String open;
        private String open_see_more;
        private String open_see_more_comment;
        private String qiangshafa;
        private String qrcode;
        private String qzone;
        private String recieve_flower;
        private String register_flower;
        private String retry;
        private String scan_follow;
        private String send_comment;
        private String send_flower;
        private String seo_tit_e;
        private String seo_tit_s;
        private String share_intro;
        private String share_tit_e;
        private String share_tit_s;
        private String share_to;
        private String singer_count;
        private String today;
        private String total;
        private String use_browser;
        private String view_detail;
        private String view_more_comment;
        private String want_sing;
        private String want_your_comment;
        private String wechat_scan;
        private String weibo;
        private String wesing;
        private String yesterday;
        private String yourfriend;

        public String getAlert_title() {
            return alert_title;
        }

        public void setAlert_title(String alert_title) {
            this.alert_title = alert_title;
        }

        public String getAnko() {
            return anko;
        }

        public void setAnko(String anko) {
            this.anko = anko;
        }

        public String getBullet() {
            return bullet;
        }

        public void setBullet(String bullet) {
            this.bullet = bullet;
        }

        public String getCancel() {
            return cancel;
        }

        public void setCancel(String cancel) {
            this.cancel = cancel;
        }

        public String getClose() {
            return close;
        }

        public void setClose(String close) {
            this.close = close;
        }

        public String getComment_max_length() {
            return comment_max_length;
        }

        public void setComment_max_length(String comment_max_length) {
            this.comment_max_length = comment_max_length;
        }

        public String getComment_success() {
            return comment_success;
        }

        public void setComment_success(String comment_success) {
            this.comment_success = comment_success;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getConfirm() {
            return confirm;
        }

        public void setConfirm(String confirm) {
            this.confirm = confirm;
        }

        public String getDowload_now() {
            return dowload_now;
        }

        public void setDowload_now(String dowload_now) {
            this.dowload_now = dowload_now;
        }

        public String getDownload() {
            return download;
        }

        public void setDownload(String download) {
            this.download = download;
        }

        public String getDownload_get_flower() {
            return download_get_flower;
        }

        public void setDownload_get_flower(String download_get_flower) {
            this.download_get_flower = download_get_flower;
        }

        public String getDownload_see_friends_comment() {
            return download_see_friends_comment;
        }

        public void setDownload_see_friends_comment(String download_see_friends_comment) {
            this.download_see_friends_comment = download_see_friends_comment;
        }

        public String getDownload_see_more() {
            return download_see_more;
        }

        public void setDownload_see_more(String download_see_more) {
            this.download_see_more = download_see_more;
        }

        public String getDownload_see_more_comment() {
            return download_see_more_comment;
        }

        public void setDownload_see_more_comment(String download_see_more_comment) {
            this.download_see_more_comment = download_see_more_comment;
        }

        public String getFollow() {
            return follow;
        }

        public void setFollow(String follow) {
            this.follow = follow;
        }

        public String getFriend_invite() {
            return friend_invite;
        }

        public void setFriend_invite(String friend_invite) {
            this.friend_invite = friend_invite;
        }

        public String getGift_rank() {
            return gift_rank;
        }

        public void setGift_rank(String gift_rank) {
            this.gift_rank = gift_rank;
        }

        public String getGive_flower() {
            return give_flower;
        }

        public void setGive_flower(String give_flower) {
            this.give_flower = give_flower;
        }

        public String getIam() {
            return iam;
        }

        public void setIam(String iam) {
            this.iam = iam;
        }

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }

        public String getInvite_download() {
            return invite_download;
        }

        public void setInvite_download(String invite_download) {
            this.invite_download = invite_download;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getMore_songs() {
            return more_songs;
        }

        public void setMore_songs(String more_songs) {
            this.more_songs = more_songs;
        }

        public String getMusicerr_hint() {
            return musicerr_hint;
        }

        public void setMusicerr_hint(String musicerr_hint) {
            this.musicerr_hint = musicerr_hint;
        }

        public String getNo_data_hint() {
            return no_data_hint;
        }

        public void setNo_data_hint(String no_data_hint) {
            this.no_data_hint = no_data_hint;
        }

        public String getNone_flower() {
            return none_flower;
        }

        public void setNone_flower(String none_flower) {
            this.none_flower = none_flower;
        }

        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getOpen_see_more() {
            return open_see_more;
        }

        public void setOpen_see_more(String open_see_more) {
            this.open_see_more = open_see_more;
        }

        public String getOpen_see_more_comment() {
            return open_see_more_comment;
        }

        public void setOpen_see_more_comment(String open_see_more_comment) {
            this.open_see_more_comment = open_see_more_comment;
        }

        public String getQiangshafa() {
            return qiangshafa;
        }

        public void setQiangshafa(String qiangshafa) {
            this.qiangshafa = qiangshafa;
        }

        public String getQrcode() {
            return qrcode;
        }

        public void setQrcode(String qrcode) {
            this.qrcode = qrcode;
        }

        public String getQzone() {
            return qzone;
        }

        public void setQzone(String qzone) {
            this.qzone = qzone;
        }

        public String getRecieve_flower() {
            return recieve_flower;
        }

        public void setRecieve_flower(String recieve_flower) {
            this.recieve_flower = recieve_flower;
        }

        public String getRegister_flower() {
            return register_flower;
        }

        public void setRegister_flower(String register_flower) {
            this.register_flower = register_flower;
        }

        public String getRetry() {
            return retry;
        }

        public void setRetry(String retry) {
            this.retry = retry;
        }

        public String getScan_follow() {
            return scan_follow;
        }

        public void setScan_follow(String scan_follow) {
            this.scan_follow = scan_follow;
        }

        public String getSend_comment() {
            return send_comment;
        }

        public void setSend_comment(String send_comment) {
            this.send_comment = send_comment;
        }

        public String getSend_flower() {
            return send_flower;
        }

        public void setSend_flower(String send_flower) {
            this.send_flower = send_flower;
        }

        public String getSeo_tit_e() {
            return seo_tit_e;
        }

        public void setSeo_tit_e(String seo_tit_e) {
            this.seo_tit_e = seo_tit_e;
        }

        public String getSeo_tit_s() {
            return seo_tit_s;
        }

        public void setSeo_tit_s(String seo_tit_s) {
            this.seo_tit_s = seo_tit_s;
        }

        public String getShare_intro() {
            return share_intro;
        }

        public void setShare_intro(String share_intro) {
            this.share_intro = share_intro;
        }

        public String getShare_tit_e() {
            return share_tit_e;
        }

        public void setShare_tit_e(String share_tit_e) {
            this.share_tit_e = share_tit_e;
        }

        public String getShare_tit_s() {
            return share_tit_s;
        }

        public void setShare_tit_s(String share_tit_s) {
            this.share_tit_s = share_tit_s;
        }

        public String getShare_to() {
            return share_to;
        }

        public void setShare_to(String share_to) {
            this.share_to = share_to;
        }

        public String getSinger_count() {
            return singer_count;
        }

        public void setSinger_count(String singer_count) {
            this.singer_count = singer_count;
        }

        public String getToday() {
            return today;
        }

        public void setToday(String today) {
            this.today = today;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getUse_browser() {
            return use_browser;
        }

        public void setUse_browser(String use_browser) {
            this.use_browser = use_browser;
        }

        public String getView_detail() {
            return view_detail;
        }

        public void setView_detail(String view_detail) {
            this.view_detail = view_detail;
        }

        public String getView_more_comment() {
            return view_more_comment;
        }

        public void setView_more_comment(String view_more_comment) {
            this.view_more_comment = view_more_comment;
        }

        public String getWant_sing() {
            return want_sing;
        }

        public void setWant_sing(String want_sing) {
            this.want_sing = want_sing;
        }

        public String getWant_your_comment() {
            return want_your_comment;
        }

        public void setWant_your_comment(String want_your_comment) {
            this.want_your_comment = want_your_comment;
        }

        public String getWechat_scan() {
            return wechat_scan;
        }

        public void setWechat_scan(String wechat_scan) {
            this.wechat_scan = wechat_scan;
        }

        public String getWeibo() {
            return weibo;
        }

        public void setWeibo(String weibo) {
            this.weibo = weibo;
        }

        public String getWesing() {
            return wesing;
        }

        public void setWesing(String wesing) {
            this.wesing = wesing;
        }

        public String getYesterday() {
            return yesterday;
        }

        public void setYesterday(String yesterday) {
            this.yesterday = yesterday;
        }

        public String getYourfriend() {
            return yourfriend;
        }

        public void setYourfriend(String yourfriend) {
            this.yourfriend = yourfriend;
        }
    }

    public static class ShareBean {
        /**
         * content : 荷塘月色唱的《一剪梅(Live)》太棒了，快来听听（来自全民K歌，立即下载( 全民K歌，KTV交友社区 https://c.y.qq.com/r/8zQU )
         * data_url : http://cgi.kg.qq.com/fcgi-bin/fcg_get_play_url?shareid=GWgxRpGzKHP-0GfI
         * img_url : http://shp.qpic.cn/ttkg/712074239/c14dfaeeea7e7691047e47ef83f9fafc598173ac/200?j=PiajxSqBRaEIf0bHhsJQ0QVoFSjos8ibuwib8icMibSGWGru7aj84uAW826V84GUk58dtqf27eKC51gRtLapYyjVa4yxXoLicV8IShnIZ00IXUfgYuf3vibmHnI0CORqjWaDbfyGJib9rnqGDyg
         * link : http://node.kg.qq.com/play?s=GWgxRpGzKHP-0GfI&lang=zh_Hans&shareuid=&secondshare=1
         * title : 一剪梅(Live)
         * type : video
         */

        private String content;
        private String data_url;
        private String img_url;
        private String link;
        private String title;
        private String type;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getData_url() {
            return data_url;
        }

        public void setData_url(String data_url) {
            this.data_url = data_url;
        }

        public String getImg_url() {
            return img_url;
        }

        public void setImg_url(String img_url) {
            this.img_url = img_url;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
