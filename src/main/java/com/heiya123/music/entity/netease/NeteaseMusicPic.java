package com.heiya123.music.entity.netease;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */

public class NeteaseMusicPic {

    private int code;
    private AlbumBean album;
    private List<SongsBean> songs;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public AlbumBean getAlbum() {
        return album;
    }

    public void setAlbum(AlbumBean album) {
        this.album = album;
    }

    public List<SongsBean> getSongs() {
        return songs;
    }

    public void setSongs(List<SongsBean> songs) {
        this.songs = songs;
    }

    public static class AlbumBean {
        /**
         * songs : []
         * paid : false
         * onSale : false
         * mark : 0
         * briefDesc :
         * publishTime : 746812800000
         * company : 滚石唱片
         * alias : []
         * artists : [{"img1v1Id":18686200114669624,"topicPerson":0,"briefDesc":"","musicSize":0,"albumSize":0,"alias":[],"picId":0,"followed":false,"img1v1Url":"https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","trans":"","picUrl":"https://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","name":"Beyond","id":11127,"img1v1Id_str":"18686200114669622"}]
         * copyrightId : 1003
         * picId : 102254581395219
         * artist : {"img1v1Id":18686200114669624,"topicPerson":0,"briefDesc":"","musicSize":2756,"albumSize":114,"alias":[],"picId":109951163720162980,"followed":false,"img1v1Url":"https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","trans":"","picUrl":"https://p2.music.126.net/Umy9RllboQslHMGkPlPVOA==/109951163720162979.jpg","name":"Beyond","id":11127,"picId_str":"109951163720162979","img1v1Id_str":"18686200114669622"}
         * commentThreadId : R_AL_3_34209
         * picUrl : https://p2.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg
         * blurPicUrl : https://p2.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg
         * companyId : 0
         * pic : 102254581395219
         * tags :
         * status : 1
         * subType : 录音室版
         * description : "海阔天空" 是黄家驹为BEYOND 成立十周年而作的，刻划着他们十年来的心路历程。有起起伏伏，有意气风发，有疲倦无奈，也有奋战不懈。


         这张专辑很特殊，一共10首歌曲，曲全部是出自“乐与怒”，但词有粤语的、国语的以及 日语的。家驹再次展现了他个人的才华与魅力——日语歌唱的也同样十分的出色，尤其是 “海阔天空”的日文版——“遥远的梦”，无不让人陶醉在其中！不管世事变化多快 在音乐的世界里 一切海阔天空。
         * name : 海阔天空
         * id : 34209
         * type : 专辑
         * size : 10
         * info : {"commentThread":{"id":"R_AL_3_34209","resourceInfo":{"id":34209,"userId":-1,"name":"海阔天空","imgUrl":"http://p3.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg","creator":null},"resourceType":3,"commentCount":224,"likedCount":0,"shareCount":254,"hotCount":9,"latestLikedUsers":null,"resourceId":34209,"resourceOwnerId":-1,"resourceTitle":"海阔天空"},"latestLikedUsers":null,"liked":false,"comments":null,"resourceType":3,"resourceId":34209,"commentCount":224,"likedCount":0,"shareCount":254,"threadId":"R_AL_3_34209"}
         */

        private boolean paid;
        private boolean onSale;
        private int mark;
        private String briefDesc;
        private long publishTime;
        private String company;
        private int copyrightId;
        private long picId;
        private ArtistBean artist;
        private String commentThreadId;
        private String picUrl;
        private String blurPicUrl;
        private int companyId;
        private long pic;
        private String tags;
        private int status;
        private String subType;
        private String description;
        private String name;
        private int id;
        private String type;
        private int size;
        private InfoBean info;
        private List<?> songs;
        private List<?> alias;
        private List<ArtistsBean> artists;

        public boolean isPaid() {
            return paid;
        }

        public void setPaid(boolean paid) {
            this.paid = paid;
        }

        public boolean isOnSale() {
            return onSale;
        }

        public void setOnSale(boolean onSale) {
            this.onSale = onSale;
        }

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }

        public String getBriefDesc() {
            return briefDesc;
        }

        public void setBriefDesc(String briefDesc) {
            this.briefDesc = briefDesc;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public int getCopyrightId() {
            return copyrightId;
        }

        public void setCopyrightId(int copyrightId) {
            this.copyrightId = copyrightId;
        }

        public long getPicId() {
            return picId;
        }

        public void setPicId(long picId) {
            this.picId = picId;
        }

        public ArtistBean getArtist() {
            return artist;
        }

        public void setArtist(ArtistBean artist) {
            this.artist = artist;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getBlurPicUrl() {
            return blurPicUrl;
        }

        public void setBlurPicUrl(String blurPicUrl) {
            this.blurPicUrl = blurPicUrl;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public long getPic() {
            return pic;
        }

        public void setPic(long pic) {
            this.pic = pic;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public List<?> getSongs() {
            return songs;
        }

        public void setSongs(List<?> songs) {
            this.songs = songs;
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

        public static class ArtistBean {
            /**
             * img1v1Id : 18686200114669624
             * topicPerson : 0
             * briefDesc :
             * musicSize : 2756
             * albumSize : 114
             * alias : []
             * picId : 109951163720162980
             * followed : false
             * img1v1Url : https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
             * trans :
             * picUrl : https://p2.music.126.net/Umy9RllboQslHMGkPlPVOA==/109951163720162979.jpg
             * name : Beyond
             * id : 11127
             * picId_str : 109951163720162979
             * img1v1Id_str : 18686200114669622
             */

            private long img1v1Id;
            private int topicPerson;
            private String briefDesc;
            private int musicSize;
            private int albumSize;
            private long picId;
            private boolean followed;
            private String img1v1Url;
            private String trans;
            private String picUrl;
            private String name;
            private int id;
            private String picId_str;
            private String img1v1Id_str;
            private List<?> alias;

            public long getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(long img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public int getTopicPerson() {
                return topicPerson;
            }

            public void setTopicPerson(int topicPerson) {
                this.topicPerson = topicPerson;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public long getPicId() {
                return picId;
            }

            public void setPicId(long picId) {
                this.picId = picId;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPicId_str() {
                return picId_str;
            }

            public void setPicId_str(String picId_str) {
                this.picId_str = picId_str;
            }

            public String getImg1v1Id_str() {
                return img1v1Id_str;
            }

            public void setImg1v1Id_str(String img1v1Id_str) {
                this.img1v1Id_str = img1v1Id_str;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }

        public static class InfoBean {
            /**
             * commentThread : {"id":"R_AL_3_34209","resourceInfo":{"id":34209,"userId":-1,"name":"海阔天空","imgUrl":"http://p3.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg","creator":null},"resourceType":3,"commentCount":224,"likedCount":0,"shareCount":254,"hotCount":9,"latestLikedUsers":null,"resourceId":34209,"resourceOwnerId":-1,"resourceTitle":"海阔天空"}
             * latestLikedUsers : null
             * liked : false
             * comments : null
             * resourceType : 3
             * resourceId : 34209
             * commentCount : 224
             * likedCount : 0
             * shareCount : 254
             * threadId : R_AL_3_34209
             */

            private CommentThreadBean commentThread;
            private Object latestLikedUsers;
            private boolean liked;
            private Object comments;
            private int resourceType;
            private int resourceId;
            private int commentCount;
            private int likedCount;
            private int shareCount;
            private String threadId;

            public CommentThreadBean getCommentThread() {
                return commentThread;
            }

            public void setCommentThread(CommentThreadBean commentThread) {
                this.commentThread = commentThread;
            }

            public Object getLatestLikedUsers() {
                return latestLikedUsers;
            }

            public void setLatestLikedUsers(Object latestLikedUsers) {
                this.latestLikedUsers = latestLikedUsers;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public Object getComments() {
                return comments;
            }

            public void setComments(Object comments) {
                this.comments = comments;
            }

            public int getResourceType() {
                return resourceType;
            }

            public void setResourceType(int resourceType) {
                this.resourceType = resourceType;
            }

            public int getResourceId() {
                return resourceId;
            }

            public void setResourceId(int resourceId) {
                this.resourceId = resourceId;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public int getLikedCount() {
                return likedCount;
            }

            public void setLikedCount(int likedCount) {
                this.likedCount = likedCount;
            }

            public int getShareCount() {
                return shareCount;
            }

            public void setShareCount(int shareCount) {
                this.shareCount = shareCount;
            }

            public String getThreadId() {
                return threadId;
            }

            public void setThreadId(String threadId) {
                this.threadId = threadId;
            }

            public static class CommentThreadBean {
                /**
                 * id : R_AL_3_34209
                 * resourceInfo : {"id":34209,"userId":-1,"name":"海阔天空","imgUrl":"http://p3.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg","creator":null}
                 * resourceType : 3
                 * commentCount : 224
                 * likedCount : 0
                 * shareCount : 254
                 * hotCount : 9
                 * latestLikedUsers : null
                 * resourceId : 34209
                 * resourceOwnerId : -1
                 * resourceTitle : 海阔天空
                 */

                private String id;
                private ResourceInfoBean resourceInfo;
                private int resourceType;
                private int commentCount;
                private int likedCount;
                private int shareCount;
                private int hotCount;
                private Object latestLikedUsers;
                private int resourceId;
                private int resourceOwnerId;
                private String resourceTitle;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public ResourceInfoBean getResourceInfo() {
                    return resourceInfo;
                }

                public void setResourceInfo(ResourceInfoBean resourceInfo) {
                    this.resourceInfo = resourceInfo;
                }

                public int getResourceType() {
                    return resourceType;
                }

                public void setResourceType(int resourceType) {
                    this.resourceType = resourceType;
                }

                public int getCommentCount() {
                    return commentCount;
                }

                public void setCommentCount(int commentCount) {
                    this.commentCount = commentCount;
                }

                public int getLikedCount() {
                    return likedCount;
                }

                public void setLikedCount(int likedCount) {
                    this.likedCount = likedCount;
                }

                public int getShareCount() {
                    return shareCount;
                }

                public void setShareCount(int shareCount) {
                    this.shareCount = shareCount;
                }

                public int getHotCount() {
                    return hotCount;
                }

                public void setHotCount(int hotCount) {
                    this.hotCount = hotCount;
                }

                public Object getLatestLikedUsers() {
                    return latestLikedUsers;
                }

                public void setLatestLikedUsers(Object latestLikedUsers) {
                    this.latestLikedUsers = latestLikedUsers;
                }

                public int getResourceId() {
                    return resourceId;
                }

                public void setResourceId(int resourceId) {
                    this.resourceId = resourceId;
                }

                public int getResourceOwnerId() {
                    return resourceOwnerId;
                }

                public void setResourceOwnerId(int resourceOwnerId) {
                    this.resourceOwnerId = resourceOwnerId;
                }

                public String getResourceTitle() {
                    return resourceTitle;
                }

                public void setResourceTitle(String resourceTitle) {
                    this.resourceTitle = resourceTitle;
                }

                public static class ResourceInfoBean {
                    /**
                     * id : 34209
                     * userId : -1
                     * name : 海阔天空
                     * imgUrl : http://p3.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg
                     * creator : null
                     */

                    private int id;
                    private int userId;
                    private String name;
                    private String imgUrl;
                    private Object creator;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getUserId() {
                        return userId;
                    }

                    public void setUserId(int userId) {
                        this.userId = userId;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getImgUrl() {
                        return imgUrl;
                    }

                    public void setImgUrl(String imgUrl) {
                        this.imgUrl = imgUrl;
                    }

                    public Object getCreator() {
                        return creator;
                    }

                    public void setCreator(Object creator) {
                        this.creator = creator;
                    }
                }
            }
        }

        public static class ArtistsBean {
            /**
             * img1v1Id : 18686200114669624
             * topicPerson : 0
             * briefDesc :
             * musicSize : 0
             * albumSize : 0
             * alias : []
             * picId : 0
             * followed : false
             * img1v1Url : https://p2.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg
             * trans :
             * picUrl : https://p2.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
             * name : Beyond
             * id : 11127
             * img1v1Id_str : 18686200114669622
             */

            private long img1v1Id;
            private int topicPerson;
            private String briefDesc;
            private int musicSize;
            private int albumSize;
            private int picId;
            private boolean followed;
            private String img1v1Url;
            private String trans;
            private String picUrl;
            private String name;
            private int id;
            private String img1v1Id_str;
            private List<?> alias;

            public long getImg1v1Id() {
                return img1v1Id;
            }

            public void setImg1v1Id(long img1v1Id) {
                this.img1v1Id = img1v1Id;
            }

            public int getTopicPerson() {
                return topicPerson;
            }

            public void setTopicPerson(int topicPerson) {
                this.topicPerson = topicPerson;
            }

            public String getBriefDesc() {
                return briefDesc;
            }

            public void setBriefDesc(String briefDesc) {
                this.briefDesc = briefDesc;
            }

            public int getMusicSize() {
                return musicSize;
            }

            public void setMusicSize(int musicSize) {
                this.musicSize = musicSize;
            }

            public int getAlbumSize() {
                return albumSize;
            }

            public void setAlbumSize(int albumSize) {
                this.albumSize = albumSize;
            }

            public int getPicId() {
                return picId;
            }

            public void setPicId(int picId) {
                this.picId = picId;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getImg1v1Url() {
                return img1v1Url;
            }

            public void setImg1v1Url(String img1v1Url) {
                this.img1v1Url = img1v1Url;
            }

            public String getTrans() {
                return trans;
            }

            public void setTrans(String trans) {
                this.trans = trans;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg1v1Id_str() {
                return img1v1Id_str;
            }

            public void setImg1v1Id_str(String img1v1Id_str) {
                this.img1v1Id_str = img1v1Id_str;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }
        }
    }

    public static class SongsBean {
        /**
         * rtUrls : []
         * ar : [{"id":11127,"name":"Beyond"}]
         * al : {"id":34209,"name":"海阔天空","picUrl":"https://p1.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg","pic_str":"102254581395219","pic":102254581395219}
         * st : 3
         * djId : 0
         * no : 1
         * fee : 8
         * v : 32
         * mv : 376199
         * cd : 1
         * rtype : 0
         * rurl : null
         * pst : 0
         * t : 0
         * alia : []
         * pop : 100
         * rt : 600902000004240302
         * mst : 9
         * cp : 7002
         * crbt : null
         * cf :
         * dt : 326000
         * h : {"br":320000,"fid":0,"size":13042459,"vd":0}
         * l : {"br":128000,"fid":0,"size":5217009,"vd":1324}
         * rtUrl : null
         * ftype : 0
         * a : null
         * m : {"br":192000,"fid":0,"size":7825492,"vd":2310}
         * name : 海阔天空
         * id : 347230
         * privilege : {"id":347230,"fee":8,"payed":0,"st":0,"pl":128000,"dl":0,"sp":7,"cp":1,"subp":1,"cs":false,"maxbr":999000,"fl":128000,"toast":false,"flag":0,"preSell":false,"playMaxbr":999000,"downloadMaxbr":999000}
         * eq : rock
         */

        private AlBean al;
        private int st;
        private int djId;
        private int no;
        private int fee;
        private int v;
        private int mv;
        private String cd;
        private int rtype;
        private Object rurl;
        private int pst;
        private int t;
        private int pop;
        private String rt;
        private int mst;
        private int cp;
        private Object crbt;
        private String cf;
        private int dt;
        private HBean h;
        private LBean l;
        private Object rtUrl;
        private int ftype;
        private Object a;
        private MBean m;
        private String name;
        private int id;
        private PrivilegeBean privilege;
        private String eq;
        private List<?> rtUrls;
        private List<ArBean> ar;
        private List<?> alia;

        public AlBean getAl() {
            return al;
        }

        public void setAl(AlBean al) {
            this.al = al;
        }

        public int getSt() {
            return st;
        }

        public void setSt(int st) {
            this.st = st;
        }

        public int getDjId() {
            return djId;
        }

        public void setDjId(int djId) {
            this.djId = djId;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getFee() {
            return fee;
        }

        public void setFee(int fee) {
            this.fee = fee;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        public int getMv() {
            return mv;
        }

        public void setMv(int mv) {
            this.mv = mv;
        }

        public String getCd() {
            return cd;
        }

        public void setCd(String cd) {
            this.cd = cd;
        }

        public int getRtype() {
            return rtype;
        }

        public void setRtype(int rtype) {
            this.rtype = rtype;
        }

        public Object getRurl() {
            return rurl;
        }

        public void setRurl(Object rurl) {
            this.rurl = rurl;
        }

        public int getPst() {
            return pst;
        }

        public void setPst(int pst) {
            this.pst = pst;
        }

        public int getT() {
            return t;
        }

        public void setT(int t) {
            this.t = t;
        }

        public int getPop() {
            return pop;
        }

        public void setPop(int pop) {
            this.pop = pop;
        }

        public String getRt() {
            return rt;
        }

        public void setRt(String rt) {
            this.rt = rt;
        }

        public int getMst() {
            return mst;
        }

        public void setMst(int mst) {
            this.mst = mst;
        }

        public int getCp() {
            return cp;
        }

        public void setCp(int cp) {
            this.cp = cp;
        }

        public Object getCrbt() {
            return crbt;
        }

        public void setCrbt(Object crbt) {
            this.crbt = crbt;
        }

        public String getCf() {
            return cf;
        }

        public void setCf(String cf) {
            this.cf = cf;
        }

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public HBean getH() {
            return h;
        }

        public void setH(HBean h) {
            this.h = h;
        }

        public LBean getL() {
            return l;
        }

        public void setL(LBean l) {
            this.l = l;
        }

        public Object getRtUrl() {
            return rtUrl;
        }

        public void setRtUrl(Object rtUrl) {
            this.rtUrl = rtUrl;
        }

        public int getFtype() {
            return ftype;
        }

        public void setFtype(int ftype) {
            this.ftype = ftype;
        }

        public Object getA() {
            return a;
        }

        public void setA(Object a) {
            this.a = a;
        }

        public MBean getM() {
            return m;
        }

        public void setM(MBean m) {
            this.m = m;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public PrivilegeBean getPrivilege() {
            return privilege;
        }

        public void setPrivilege(PrivilegeBean privilege) {
            this.privilege = privilege;
        }

        public String getEq() {
            return eq;
        }

        public void setEq(String eq) {
            this.eq = eq;
        }

        public List<?> getRtUrls() {
            return rtUrls;
        }

        public void setRtUrls(List<?> rtUrls) {
            this.rtUrls = rtUrls;
        }

        public List<ArBean> getAr() {
            return ar;
        }

        public void setAr(List<ArBean> ar) {
            this.ar = ar;
        }

        public List<?> getAlia() {
            return alia;
        }

        public void setAlia(List<?> alia) {
            this.alia = alia;
        }

        public static class AlBean {
            /**
             * id : 34209
             * name : 海阔天空
             * picUrl : https://p1.music.126.net/QHw-RuMwfQkmgtiyRpGs0Q==/102254581395219.jpg
             * pic_str : 102254581395219
             * pic : 102254581395219
             */

            private int id;
            private String name;
            private String picUrl;
            private String pic_str;
            private long pic;

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

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getPic_str() {
                return pic_str;
            }

            public void setPic_str(String pic_str) {
                this.pic_str = pic_str;
            }

            public long getPic() {
                return pic;
            }

            public void setPic(long pic) {
                this.pic = pic;
            }
        }

        public static class HBean {
            /**
             * br : 320000
             * fid : 0
             * size : 13042459
             * vd : 0
             */

            private int br;
            private int fid;
            private int size;
            private int vd;

            public int getBr() {
                return br;
            }

            public void setBr(int br) {
                this.br = br;
            }

            public int getFid() {
                return fid;
            }

            public void setFid(int fid) {
                this.fid = fid;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getVd() {
                return vd;
            }

            public void setVd(int vd) {
                this.vd = vd;
            }
        }

        public static class LBean {
            /**
             * br : 128000
             * fid : 0
             * size : 5217009
             * vd : 1324
             */

            private int br;
            private int fid;
            private int size;
            private int vd;

            public int getBr() {
                return br;
            }

            public void setBr(int br) {
                this.br = br;
            }

            public int getFid() {
                return fid;
            }

            public void setFid(int fid) {
                this.fid = fid;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getVd() {
                return vd;
            }

            public void setVd(int vd) {
                this.vd = vd;
            }
        }

        public static class MBean {
            /**
             * br : 192000
             * fid : 0
             * size : 7825492
             * vd : 2310
             */

            private int br;
            private int fid;
            private int size;
            private int vd;

            public int getBr() {
                return br;
            }

            public void setBr(int br) {
                this.br = br;
            }

            public int getFid() {
                return fid;
            }

            public void setFid(int fid) {
                this.fid = fid;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public int getVd() {
                return vd;
            }

            public void setVd(int vd) {
                this.vd = vd;
            }
        }

        public static class PrivilegeBean {
            /**
             * id : 347230
             * fee : 8
             * payed : 0
             * st : 0
             * pl : 128000
             * dl : 0
             * sp : 7
             * cp : 1
             * subp : 1
             * cs : false
             * maxbr : 999000
             * fl : 128000
             * toast : false
             * flag : 0
             * preSell : false
             * playMaxbr : 999000
             * downloadMaxbr : 999000
             */

            private int id;
            private int fee;
            private int payed;
            private int st;
            private int pl;
            private int dl;
            private int sp;
            private int cp;
            private int subp;
            private boolean cs;
            private int maxbr;
            private int fl;
            private boolean toast;
            private int flag;
            private boolean preSell;
            private int playMaxbr;
            private int downloadMaxbr;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public int getPayed() {
                return payed;
            }

            public void setPayed(int payed) {
                this.payed = payed;
            }

            public int getSt() {
                return st;
            }

            public void setSt(int st) {
                this.st = st;
            }

            public int getPl() {
                return pl;
            }

            public void setPl(int pl) {
                this.pl = pl;
            }

            public int getDl() {
                return dl;
            }

            public void setDl(int dl) {
                this.dl = dl;
            }

            public int getSp() {
                return sp;
            }

            public void setSp(int sp) {
                this.sp = sp;
            }

            public int getCp() {
                return cp;
            }

            public void setCp(int cp) {
                this.cp = cp;
            }

            public int getSubp() {
                return subp;
            }

            public void setSubp(int subp) {
                this.subp = subp;
            }

            public boolean isCs() {
                return cs;
            }

            public void setCs(boolean cs) {
                this.cs = cs;
            }

            public int getMaxbr() {
                return maxbr;
            }

            public void setMaxbr(int maxbr) {
                this.maxbr = maxbr;
            }

            public int getFl() {
                return fl;
            }

            public void setFl(int fl) {
                this.fl = fl;
            }

            public boolean isToast() {
                return toast;
            }

            public void setToast(boolean toast) {
                this.toast = toast;
            }

            public int getFlag() {
                return flag;
            }

            public void setFlag(int flag) {
                this.flag = flag;
            }

            public boolean isPreSell() {
                return preSell;
            }

            public void setPreSell(boolean preSell) {
                this.preSell = preSell;
            }

            public int getPlayMaxbr() {
                return playMaxbr;
            }

            public void setPlayMaxbr(int playMaxbr) {
                this.playMaxbr = playMaxbr;
            }

            public int getDownloadMaxbr() {
                return downloadMaxbr;
            }

            public void setDownloadMaxbr(int downloadMaxbr) {
                this.downloadMaxbr = downloadMaxbr;
            }
        }

        public static class ArBean {
            /**
             * id : 11127
             * name : Beyond
             */

            private int id;
            private String name;

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
        }
    }
}
