package com.heiya123.music.entity.kugou;

import java.io.Serializable;
import java.util.List;

public class KuGouMusicBase implements Serializable {
	private static final long serialVersionUID = 180591048L;
	private String error;
	private Data data;
	private long status;
	private long errcode;

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public long getStatus() {
		return this.status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public long getErrcode() {
		return this.errcode;
	}

	public void setErrcode(long errcode) {
		this.errcode = errcode;
	}

	public static class Data implements Serializable {
		private static final long serialVersionUID = 180591048L;
		private long timestamp;
		private long istagresult;
		private List<Aggregation> aggregation;
		private long total;
		private String tab;
		private long allowerr;
		private List<Info> info;
		private String correctiontip;
		private long forcecorrection;
		private long istag;
		private long correctiontype;

		public long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}

		public long getIstagresult() {
			return this.istagresult;
		}

		public void setIstagresult(long istagresult) {
			this.istagresult = istagresult;
		}

		public List<Aggregation> getAggregation() {
			return this.aggregation;
		}

		public void setAggregation(List<Aggregation> aggregation) {
			this.aggregation = aggregation;
		}

		public long getTotal() {
			return this.total;
		}

		public void setTotal(long total) {
			this.total = total;
		}

		public String getTab() {
			return this.tab;
		}

		public void setTab(String tab) {
			this.tab = tab;
		}

		public long getAllowerr() {
			return this.allowerr;
		}

		public void setAllowerr(long allowerr) {
			this.allowerr = allowerr;
		}

		public List<Info> getInfo() {
			return this.info;
		}

		public void setInfo(List<Info> info) {
			this.info = info;
		}

		public String getCorrectiontip() {
			return this.correctiontip;
		}

		public void setCorrectiontip(String correctiontip) {
			this.correctiontip = correctiontip;
		}

		public long getForcecorrection() {
			return this.forcecorrection;
		}

		public void setForcecorrection(long forcecorrection) {
			this.forcecorrection = forcecorrection;
		}

		public long getIstag() {
			return this.istag;
		}

		public void setIstag(long istag) {
			this.istag = istag;
		}

		public long getCorrectiontype() {
			return this.correctiontype;
		}

		public void setCorrectiontype(long correctiontype) {
			this.correctiontype = correctiontype;
		}

		public static class Info implements Serializable {
			private static final long serialVersionUID = 2093905793L;
			private long pkg_price_sq;
			private long bitrate;
			private String extname;
			private long accompany;
			private long sourceid;
			private long pkg_price_320;
			private String singername;
			private long price;
			private long m4afilesize;
			private long duration;
			private long fail_process_320;
			private long ownercount;
			private String mvhash;
			private String songname;
			private long feetype;
			private long fail_process;
			private long fail_process_sq;
			private long pkg_price;
			private long pay_type_320;
			private long sqprivilege;
			private long rp_publish;
			private long filesize;
			private String sqhash;
			private String othername;
			private String filename;
			private long audio_id;
			private String rp_type;
			private String album_name;
			private String album_id;
			private String hash;
			private String source;
			private long srctype;
			private long pay_type;
			private long sqfilesize;
			private long price_320;
			private long pay_type_sq;
			private String topic;
			private long privilege;
			private String topic_url;
			private List<Object> group;
			private long isnew;
			private long price_sq;

			public long getPkg_price_sq() {
				return this.pkg_price_sq;
			}

			public void setPkg_price_sq(long pkg_price_sq) {
				this.pkg_price_sq = pkg_price_sq;
			}

			public long getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(long bitrate) {
				this.bitrate = bitrate;
			}

			public String getExtname() {
				return this.extname;
			}

			public void setExtname(String extname) {
				this.extname = extname;
			}

			public long getAccompany() {
				return this.accompany;
			}

			public void setAccompany(long accompany) {
				this.accompany = accompany;
			}

			public long getSourceid() {
				return this.sourceid;
			}

			public void setSourceid(long sourceid) {
				this.sourceid = sourceid;
			}

			public long getPkg_price_320() {
				return this.pkg_price_320;
			}

			public void setPkg_price_320(long pkg_price_320) {
				this.pkg_price_320 = pkg_price_320;
			}

			public String getSingername() {
				return this.singername;
			}

			public void setSingername(String singername) {
				this.singername = singername;
			}

			public long getPrice() {
				return this.price;
			}

			public void setPrice(long price) {
				this.price = price;
			}

			public long getM4afilesize() {
				return this.m4afilesize;
			}

			public void setM4afilesize(long m4afilesize) {
				this.m4afilesize = m4afilesize;
			}

			public long getDuration() {
				return this.duration;
			}

			public void setDuration(long duration) {
				this.duration = duration;
			}

			public long getFail_process_320() {
				return this.fail_process_320;
			}

			public void setFail_process_320(long fail_process_320) {
				this.fail_process_320 = fail_process_320;
			}

			public long getOwnercount() {
				return this.ownercount;
			}

			public void setOwnercount(long ownercount) {
				this.ownercount = ownercount;
			}

			public String getMvhash() {
				return this.mvhash;
			}

			public void setMvhash(String mvhash) {
				this.mvhash = mvhash;
			}

			public String getSongname() {
				return this.songname;
			}

			public void setSongname(String songname) {
				this.songname = songname;
			}

			public long getFeetype() {
				return this.feetype;
			}

			public void setFeetype(long feetype) {
				this.feetype = feetype;
			}

			public long getFail_process() {
				return this.fail_process;
			}

			public void setFail_process(long fail_process) {
				this.fail_process = fail_process;
			}

			public long getFail_process_sq() {
				return this.fail_process_sq;
			}

			public void setFail_process_sq(long fail_process_sq) {
				this.fail_process_sq = fail_process_sq;
			}

			public long getPkg_price() {
				return this.pkg_price;
			}

			public void setPkg_price(long pkg_price) {
				this.pkg_price = pkg_price;
			}

			public long getPay_type_320() {
				return this.pay_type_320;
			}

			public void setPay_type_320(long pay_type_320) {
				this.pay_type_320 = pay_type_320;
			}

			public long getSqprivilege() {
				return this.sqprivilege;
			}

			public void setSqprivilege(long sqprivilege) {
				this.sqprivilege = sqprivilege;
			}

			public long getRp_publish() {
				return this.rp_publish;
			}

			public void setRp_publish(long rp_publish) {
				this.rp_publish = rp_publish;
			}

			public long getFilesize() {
				return this.filesize;
			}

			public void setFilesize(long filesize) {
				this.filesize = filesize;
			}

			public String getSqhash() {
				return this.sqhash;
			}

			public void setSqhash(String sqhash) {
				this.sqhash = sqhash;
			}

			public String getOthername() {
				return this.othername;
			}

			public void setOthername(String othername) {
				this.othername = othername;
			}

			public String getFilename() {
				return this.filename;
			}

			public void setFilename(String filename) {
				this.filename = filename;
			}

			public long getAudio_id() {
				return this.audio_id;
			}

			public void setAudio_id(long audio_id) {
				this.audio_id = audio_id;
			}

			public String getRp_type() {
				return this.rp_type;
			}

			public void setRp_type(String rp_type) {
				this.rp_type = rp_type;
			}

			public String getAlbum_name() {
				return this.album_name;
			}

			public void setAlbum_name(String album_name) {
				this.album_name = album_name;
			}

			public String getAlbum_id() {
				return this.album_id;
			}

			public void setAlbum_id(String album_id) {
				this.album_id = album_id;
			}

			public String getHash() {
				return this.hash;
			}

			public void setHash(String hash) {
				this.hash = hash;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public long getSrctype() {
				return this.srctype;
			}

			public void setSrctype(long srctype) {
				this.srctype = srctype;
			}

			public long getPay_type() {
				return this.pay_type;
			}

			public void setPay_type(long pay_type) {
				this.pay_type = pay_type;
			}

			public long getSqfilesize() {
				return this.sqfilesize;
			}

			public void setSqfilesize(long sqfilesize) {
				this.sqfilesize = sqfilesize;
			}

			public long getPrice_320() {
				return this.price_320;
			}

			public void setPrice_320(long price_320) {
				this.price_320 = price_320;
			}

			public long getPay_type_sq() {
				return this.pay_type_sq;
			}

			public void setPay_type_sq(long pay_type_sq) {
				this.pay_type_sq = pay_type_sq;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}

			public long getPrivilege() {
				return this.privilege;
			}

			public void setPrivilege(long privilege) {
				this.privilege = privilege;
			}

			public String getTopic_url() {
				return this.topic_url;
			}

			public void setTopic_url(String topic_url) {
				this.topic_url = topic_url;
			}

			public List<Object> getGroup() {
				return this.group;
			}

			public void setGroup(List<Object> group) {
				this.group = group;
			}

			public long getIsnew() {
				return this.isnew;
			}

			public void setIsnew(long isnew) {
				this.isnew = isnew;
			}

			public long getPrice_sq() {
				return this.price_sq;
			}

			public void setPrice_sq(long price_sq) {
				this.price_sq = price_sq;
			}

		}

		public static class Aggregation implements Serializable {
			private static final long serialVersionUID = 1267180758L;
			private String key;
			private long count;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public long getCount() {
				return this.count;
			}

			public void setCount(long count) {
				this.count = count;
			}
		}
	}
}
