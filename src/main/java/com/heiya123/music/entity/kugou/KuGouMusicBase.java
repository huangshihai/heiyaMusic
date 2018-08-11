package com.heiya123.music.entity.kugou;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class KuGouMusicBase implements Serializable {

    private DataBean data;
    private int error_code;
    private int status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataBean {

        private int allowerr;
        private int chinesecount;
        private int correctionforce;
        private String correctionsubject;
        private String correctiontip;
        private int correctiontype;
        private int istag;
        private int istagresult;
        private int page;
        private int pagesize;
        private int searchfull;
        private int subjecttype;
        private String tab;
        private int total;
        private List<AggregationBean> aggregation;
        private List<ListsBean> lists;

        public int getAllowerr() {
            return allowerr;
        }

        public void setAllowerr(int allowerr) {
            this.allowerr = allowerr;
        }

        public int getChinesecount() {
            return chinesecount;
        }

        public void setChinesecount(int chinesecount) {
            this.chinesecount = chinesecount;
        }

        public int getCorrectionforce() {
            return correctionforce;
        }

        public void setCorrectionforce(int correctionforce) {
            this.correctionforce = correctionforce;
        }

        public String getCorrectionsubject() {
            return correctionsubject;
        }

        public void setCorrectionsubject(String correctionsubject) {
            this.correctionsubject = correctionsubject;
        }

        public String getCorrectiontip() {
            return correctiontip;
        }

        public void setCorrectiontip(String correctiontip) {
            this.correctiontip = correctiontip;
        }

        public int getCorrectiontype() {
            return correctiontype;
        }

        public void setCorrectiontype(int correctiontype) {
            this.correctiontype = correctiontype;
        }

        public int getIstag() {
            return istag;
        }

        public void setIstag(int istag) {
            this.istag = istag;
        }

        public int getIstagresult() {
            return istagresult;
        }

        public void setIstagresult(int istagresult) {
            this.istagresult = istagresult;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getSearchfull() {
            return searchfull;
        }

        public void setSearchfull(int searchfull) {
            this.searchfull = searchfull;
        }

        public int getSubjecttype() {
            return subjecttype;
        }

        public void setSubjecttype(int subjecttype) {
            this.subjecttype = subjecttype;
        }

        public String getTab() {
            return tab;
        }

        public void setTab(String tab) {
            this.tab = tab;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<AggregationBean> getAggregation() {
            return aggregation;
        }

        public void setAggregation(List<AggregationBean> aggregation) {
            this.aggregation = aggregation;
        }

        public List<ListsBean> getLists() {
            return lists;
        }

        public void setLists(List<ListsBean> lists) {
            this.lists = lists;
        }

        public static class AggregationBean {

            private int count;
            private String key;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }
        }

        public static class ListsBean {

            private int A320Privilege;
            private int ASQPrivilege;
            private int Accompany;
            private String AlbumID;
            private String AlbumName;
            private int AlbumPrivilege;
            private int AudioCdn;
            private int Audioid;
            private String Auxiliary;
            private int Bitrate;
            private int Duration;
            private String ExtName;
            private int FailProcess;
            private String FileHash;
            private String FileName;
            private int FileSize;
            private int FoldType;
            private int HQBitrate;
            private int HQDuration;
            private String HQExtName;
            private int HQFailProcess;
            private String HQFileHash;
            private int HQFileSize;
            private int HQPayType;
            private int HQPkgPrice;
            private int HQPrice;
            private int HQPrivilege;
            private int HasAlbum;
            private int HiFiQuality;
            private String ID;
            private int IsOriginal;
            private int M4aSize;
            private String MixSongID;
            private String MvHash;
            private int MvTrac;
            private int MvType;
            private int OldCpy;
            private String OriOtherName;
            private String OriSongName;
            private String OtherName;
            private int OwnerCount;
            private int PayType;
            private int PkgPrice;
            private int Price;
            private int Privilege;
            private int Publish;
            private int PublishAge;
            private int QualityLevel;
            private int ResBitrate;
            private int ResDuration;
            private String ResFileHash;
            private int ResFileSize;
            private int SQBitrate;
            private int SQDuration;
            private String SQExtName;
            private int SQFailProcess;
            private String SQFileHash;
            private int SQFileSize;
            private int SQPayType;
            private int SQPkgPrice;
            private int SQPrice;
            private int SQPrivilege;
            private int Scid;
            private String SingerName;
            private String SongLabel;
            private String SongName;
            private String Source;
            private int SourceID;
            private int SuperBitrate;
            private int SuperDuration;
            private String SuperExtName;
            private String SuperFileHash;
            private int SuperFileSize;
            private String TopicRemark;
            private String TopicUrl;
            private String Type;
            private int mvTotal;
            private TransParamBean trans_param;
            private List<Integer> SingerId;

            public int getA320Privilege() {
                return A320Privilege;
            }

            public void setA320Privilege(int A320Privilege) {
                this.A320Privilege = A320Privilege;
            }

            public int getASQPrivilege() {
                return ASQPrivilege;
            }

            public void setASQPrivilege(int ASQPrivilege) {
                this.ASQPrivilege = ASQPrivilege;
            }

            public int getAccompany() {
                return Accompany;
            }

            public void setAccompany(int Accompany) {
                this.Accompany = Accompany;
            }

            public String getAlbumID() {
                return AlbumID;
            }

            public void setAlbumID(String AlbumID) {
                this.AlbumID = AlbumID;
            }

            public String getAlbumName() {
                return AlbumName;
            }

            public void setAlbumName(String AlbumName) {
                this.AlbumName = AlbumName;
            }

            public int getAlbumPrivilege() {
                return AlbumPrivilege;
            }

            public void setAlbumPrivilege(int AlbumPrivilege) {
                this.AlbumPrivilege = AlbumPrivilege;
            }

            public int getAudioCdn() {
                return AudioCdn;
            }

            public void setAudioCdn(int AudioCdn) {
                this.AudioCdn = AudioCdn;
            }

            public int getAudioid() {
                return Audioid;
            }

            public void setAudioid(int Audioid) {
                this.Audioid = Audioid;
            }

            public String getAuxiliary() {
                return Auxiliary;
            }

            public void setAuxiliary(String Auxiliary) {
                this.Auxiliary = Auxiliary;
            }

            public int getBitrate() {
                return Bitrate;
            }

            public void setBitrate(int Bitrate) {
                this.Bitrate = Bitrate;
            }

            public int getDuration() {
                return Duration;
            }

            public void setDuration(int Duration) {
                this.Duration = Duration;
            }

            public String getExtName() {
                return ExtName;
            }

            public void setExtName(String ExtName) {
                this.ExtName = ExtName;
            }

            public int getFailProcess() {
                return FailProcess;
            }

            public void setFailProcess(int FailProcess) {
                this.FailProcess = FailProcess;
            }

            public String getFileHash() {
                return FileHash;
            }

            public void setFileHash(String FileHash) {
                this.FileHash = FileHash;
            }

            public String getFileName() {
                return FileName;
            }

            public void setFileName(String FileName) {
                this.FileName = FileName;
            }

            public int getFileSize() {
                return FileSize;
            }

            public void setFileSize(int FileSize) {
                this.FileSize = FileSize;
            }

            public int getFoldType() {
                return FoldType;
            }

            public void setFoldType(int FoldType) {
                this.FoldType = FoldType;
            }

            public int getHQBitrate() {
                return HQBitrate;
            }

            public void setHQBitrate(int HQBitrate) {
                this.HQBitrate = HQBitrate;
            }

            public int getHQDuration() {
                return HQDuration;
            }

            public void setHQDuration(int HQDuration) {
                this.HQDuration = HQDuration;
            }

            public String getHQExtName() {
                return HQExtName;
            }

            public void setHQExtName(String HQExtName) {
                this.HQExtName = HQExtName;
            }

            public int getHQFailProcess() {
                return HQFailProcess;
            }

            public void setHQFailProcess(int HQFailProcess) {
                this.HQFailProcess = HQFailProcess;
            }

            public String getHQFileHash() {
                return HQFileHash;
            }

            public void setHQFileHash(String HQFileHash) {
                this.HQFileHash = HQFileHash;
            }

            public int getHQFileSize() {
                return HQFileSize;
            }

            public void setHQFileSize(int HQFileSize) {
                this.HQFileSize = HQFileSize;
            }

            public int getHQPayType() {
                return HQPayType;
            }

            public void setHQPayType(int HQPayType) {
                this.HQPayType = HQPayType;
            }

            public int getHQPkgPrice() {
                return HQPkgPrice;
            }

            public void setHQPkgPrice(int HQPkgPrice) {
                this.HQPkgPrice = HQPkgPrice;
            }

            public int getHQPrice() {
                return HQPrice;
            }

            public void setHQPrice(int HQPrice) {
                this.HQPrice = HQPrice;
            }

            public int getHQPrivilege() {
                return HQPrivilege;
            }

            public void setHQPrivilege(int HQPrivilege) {
                this.HQPrivilege = HQPrivilege;
            }

            public int getHasAlbum() {
                return HasAlbum;
            }

            public void setHasAlbum(int HasAlbum) {
                this.HasAlbum = HasAlbum;
            }

            public int getHiFiQuality() {
                return HiFiQuality;
            }

            public void setHiFiQuality(int HiFiQuality) {
                this.HiFiQuality = HiFiQuality;
            }

            public String getID() {
                return ID;
            }

            public void setID(String ID) {
                this.ID = ID;
            }

            public int getIsOriginal() {
                return IsOriginal;
            }

            public void setIsOriginal(int IsOriginal) {
                this.IsOriginal = IsOriginal;
            }

            public int getM4aSize() {
                return M4aSize;
            }

            public void setM4aSize(int M4aSize) {
                this.M4aSize = M4aSize;
            }

            public String getMixSongID() {
                return MixSongID;
            }

            public void setMixSongID(String MixSongID) {
                this.MixSongID = MixSongID;
            }

            public String getMvHash() {
                return MvHash;
            }

            public void setMvHash(String MvHash) {
                this.MvHash = MvHash;
            }

            public int getMvTrac() {
                return MvTrac;
            }

            public void setMvTrac(int MvTrac) {
                this.MvTrac = MvTrac;
            }

            public int getMvType() {
                return MvType;
            }

            public void setMvType(int MvType) {
                this.MvType = MvType;
            }

            public int getOldCpy() {
                return OldCpy;
            }

            public void setOldCpy(int OldCpy) {
                this.OldCpy = OldCpy;
            }

            public String getOriOtherName() {
                return OriOtherName;
            }

            public void setOriOtherName(String OriOtherName) {
                this.OriOtherName = OriOtherName;
            }

            public String getOriSongName() {
                return OriSongName;
            }

            public void setOriSongName(String OriSongName) {
                this.OriSongName = OriSongName;
            }

            public String getOtherName() {
                return OtherName;
            }

            public void setOtherName(String OtherName) {
                this.OtherName = OtherName;
            }

            public int getOwnerCount() {
                return OwnerCount;
            }

            public void setOwnerCount(int OwnerCount) {
                this.OwnerCount = OwnerCount;
            }

            public int getPayType() {
                return PayType;
            }

            public void setPayType(int PayType) {
                this.PayType = PayType;
            }

            public int getPkgPrice() {
                return PkgPrice;
            }

            public void setPkgPrice(int PkgPrice) {
                this.PkgPrice = PkgPrice;
            }

            public int getPrice() {
                return Price;
            }

            public void setPrice(int Price) {
                this.Price = Price;
            }

            public int getPrivilege() {
                return Privilege;
            }

            public void setPrivilege(int Privilege) {
                this.Privilege = Privilege;
            }

            public int getPublish() {
                return Publish;
            }

            public void setPublish(int Publish) {
                this.Publish = Publish;
            }

            public int getPublishAge() {
                return PublishAge;
            }

            public void setPublishAge(int PublishAge) {
                this.PublishAge = PublishAge;
            }

            public int getQualityLevel() {
                return QualityLevel;
            }

            public void setQualityLevel(int QualityLevel) {
                this.QualityLevel = QualityLevel;
            }

            public int getResBitrate() {
                return ResBitrate;
            }

            public void setResBitrate(int ResBitrate) {
                this.ResBitrate = ResBitrate;
            }

            public int getResDuration() {
                return ResDuration;
            }

            public void setResDuration(int ResDuration) {
                this.ResDuration = ResDuration;
            }

            public String getResFileHash() {
                return ResFileHash;
            }

            public void setResFileHash(String ResFileHash) {
                this.ResFileHash = ResFileHash;
            }

            public int getResFileSize() {
                return ResFileSize;
            }

            public void setResFileSize(int ResFileSize) {
                this.ResFileSize = ResFileSize;
            }

            public int getSQBitrate() {
                return SQBitrate;
            }

            public void setSQBitrate(int SQBitrate) {
                this.SQBitrate = SQBitrate;
            }

            public int getSQDuration() {
                return SQDuration;
            }

            public void setSQDuration(int SQDuration) {
                this.SQDuration = SQDuration;
            }

            public String getSQExtName() {
                return SQExtName;
            }

            public void setSQExtName(String SQExtName) {
                this.SQExtName = SQExtName;
            }

            public int getSQFailProcess() {
                return SQFailProcess;
            }

            public void setSQFailProcess(int SQFailProcess) {
                this.SQFailProcess = SQFailProcess;
            }

            public String getSQFileHash() {
                return SQFileHash;
            }

            public void setSQFileHash(String SQFileHash) {
                this.SQFileHash = SQFileHash;
            }

            public int getSQFileSize() {
                return SQFileSize;
            }

            public void setSQFileSize(int SQFileSize) {
                this.SQFileSize = SQFileSize;
            }

            public int getSQPayType() {
                return SQPayType;
            }

            public void setSQPayType(int SQPayType) {
                this.SQPayType = SQPayType;
            }

            public int getSQPkgPrice() {
                return SQPkgPrice;
            }

            public void setSQPkgPrice(int SQPkgPrice) {
                this.SQPkgPrice = SQPkgPrice;
            }

            public int getSQPrice() {
                return SQPrice;
            }

            public void setSQPrice(int SQPrice) {
                this.SQPrice = SQPrice;
            }

            public int getSQPrivilege() {
                return SQPrivilege;
            }

            public void setSQPrivilege(int SQPrivilege) {
                this.SQPrivilege = SQPrivilege;
            }

            public int getScid() {
                return Scid;
            }

            public void setScid(int Scid) {
                this.Scid = Scid;
            }

            public String getSingerName() {
                return SingerName;
            }

            public void setSingerName(String SingerName) {
                this.SingerName = SingerName;
            }

            public String getSongLabel() {
                return SongLabel;
            }

            public void setSongLabel(String SongLabel) {
                this.SongLabel = SongLabel;
            }

            public String getSongName() {
                return SongName;
            }

            public void setSongName(String SongName) {
                this.SongName = SongName;
            }

            public String getSource() {
                return Source;
            }

            public void setSource(String Source) {
                this.Source = Source;
            }

            public int getSourceID() {
                return SourceID;
            }

            public void setSourceID(int SourceID) {
                this.SourceID = SourceID;
            }

            public int getSuperBitrate() {
                return SuperBitrate;
            }

            public void setSuperBitrate(int SuperBitrate) {
                this.SuperBitrate = SuperBitrate;
            }

            public int getSuperDuration() {
                return SuperDuration;
            }

            public void setSuperDuration(int SuperDuration) {
                this.SuperDuration = SuperDuration;
            }

            public String getSuperExtName() {
                return SuperExtName;
            }

            public void setSuperExtName(String SuperExtName) {
                this.SuperExtName = SuperExtName;
            }

            public String getSuperFileHash() {
                return SuperFileHash;
            }

            public void setSuperFileHash(String SuperFileHash) {
                this.SuperFileHash = SuperFileHash;
            }

            public int getSuperFileSize() {
                return SuperFileSize;
            }

            public void setSuperFileSize(int SuperFileSize) {
                this.SuperFileSize = SuperFileSize;
            }

            public String getTopicRemark() {
                return TopicRemark;
            }

            public void setTopicRemark(String TopicRemark) {
                this.TopicRemark = TopicRemark;
            }

            public String getTopicUrl() {
                return TopicUrl;
            }

            public void setTopicUrl(String TopicUrl) {
                this.TopicUrl = TopicUrl;
            }

            public String getType() {
                return Type;
            }

            public void setType(String Type) {
                this.Type = Type;
            }

            public int getMvTotal() {
                return mvTotal;
            }

            public void setMvTotal(int mvTotal) {
                this.mvTotal = mvTotal;
            }

            public TransParamBean getTrans_param() {
                return trans_param;
            }

            public void setTrans_param(TransParamBean trans_param) {
                this.trans_param = trans_param;
            }

            public List<Integer> getSingerId() {
                return SingerId;
            }

            public void setSingerId(List<Integer> SingerId) {
                this.SingerId = SingerId;
            }

            public static class TransParamBean {

                private int musicpack_advance;
                private int pay_block_tpl;

                public int getMusicpack_advance() {
                    return musicpack_advance;
                }

                public void setMusicpack_advance(int musicpack_advance) {
                    this.musicpack_advance = musicpack_advance;
                }

                public int getPay_block_tpl() {
                    return pay_block_tpl;
                }

                public void setPay_block_tpl(int pay_block_tpl) {
                    this.pay_block_tpl = pay_block_tpl;
                }
            }
        }
    }
}
