package com.heiya123.music.vo.xiami;

import java.io.Serializable;
import java.util.List;

public class XiaMiMusicBase implements Serializable {
	private static final long serialVersionUID = 1364575362L;
	private Data data;
	private String message;
	private String request_id;
	private long state;

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequest_id() {
		return this.request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public long getState() {
		return this.state;
	}

	public void setState(long state) {
		this.state = state;
	}

	public static class Data implements Serializable {
		private static final long serialVersionUID = 1364575362L;
		private long next;
		private long previous;
		private long total;
		private List<Songs> songs;

		public long getNext() {
			return this.next;
		}

		public void setNext(long next) {
			this.next = next;
		}

		public long getPrevious() {
			return this.previous;
		}

		public void setPrevious(long previous) {
			this.previous = previous;
		}

		public long getTotal() {
			return this.total;
		}

		public void setTotal(long total) {
			this.total = total;
		}

		public List<Songs> getSongs() {
			return this.songs;
		}

		public void setSongs(List<Songs> songs) {
			this.songs = songs;
		}

		public static class Songs implements Serializable {
			private static final long serialVersionUID = 1538387277L;
			private long demo;
			private long artist_id;
			private String album_name;
			private String album_logo;
			private String artist_logo;
			private List<Purview_roles> purview_roles;
			private String artist_name;
			private long need_pay_flag;
			private String singer;
			private long album_id;
			private long song_id;
			private String listen_file;
			private String lyric;
			private long play_counts;
			private long is_play;
			private String song_name;

			public long getDemo() {
				return this.demo;
			}

			public void setDemo(long demo) {
				this.demo = demo;
			}

			public long getArtist_id() {
				return this.artist_id;
			}

			public void setArtist_id(long artist_id) {
				this.artist_id = artist_id;
			}

			public String getAlbum_name() {
				return this.album_name;
			}

			public void setAlbum_name(String album_name) {
				this.album_name = album_name;
			}

			public String getAlbum_logo() {
				return this.album_logo;
			}

			public void setAlbum_logo(String album_logo) {
				this.album_logo = album_logo;
			}

			public String getArtist_logo() {
				return this.artist_logo;
			}

			public void setArtist_logo(String artist_logo) {
				this.artist_logo = artist_logo;
			}

			public List<Purview_roles> getPurview_roles() {
				return this.purview_roles;
			}

			public void setPurview_roles(List<Purview_roles> purview_roles) {
				this.purview_roles = purview_roles;
			}

			public String getArtist_name() {
				return this.artist_name;
			}

			public void setArtist_name(String artist_name) {
				this.artist_name = artist_name;
			}

			public long getNeed_pay_flag() {
				return this.need_pay_flag;
			}

			public void setNeed_pay_flag(long need_pay_flag) {
				this.need_pay_flag = need_pay_flag;
			}

			public String getSinger() {
				return this.singer;
			}

			public void setSinger(String singer) {
				this.singer = singer;
			}

			public long getAlbum_id() {
				return this.album_id;
			}

			public void setAlbum_id(long album_id) {
				this.album_id = album_id;
			}

			public long getSong_id() {
				return this.song_id;
			}

			public void setSong_id(long song_id) {
				this.song_id = song_id;
			}

			public String getListen_file() {
				return this.listen_file;
			}

			public void setListen_file(String listen_file) {
				this.listen_file = listen_file;
			}

			public String getLyric() {
				return this.lyric;
			}

			public void setLyric(String lyric) {
				this.lyric = lyric;
			}

			public long getPlay_counts() {
				return this.play_counts;
			}

			public void setPlay_counts(long play_counts) {
				this.play_counts = play_counts;
			}

			public long getIs_play() {
				return this.is_play;
			}

			public void setIs_play(long is_play) {
				this.is_play = is_play;
			}

			public String getSong_name() {
				return this.song_name;
			}

			public void setSong_name(String song_name) {
				this.song_name = song_name;
			}

			public static class Purview_roles implements Serializable {
				private static final long serialVersionUID = 1538387277L;
				private List<Operation_list> operation_list;
				private String quality;

				public List<Operation_list> getOperation_list() {
					return this.operation_list;
				}

				public void setOperation_list(List<Operation_list> operation_list) {
					this.operation_list = operation_list;
				}

				public String getQuality() {
					return this.quality;
				}

				public void setQuality(String quality) {
					this.quality = quality;
				}

				public static class Operation_list implements Serializable {
					private static final long serialVersionUID = 1538387277L;
					private long purpose;
					private long upgrade_role;

					public long getPurpose() {
						return this.purpose;
					}

					public void setPurpose(long purpose) {
						this.purpose = purpose;
					}

					public long getUpgrade_role() {
						return this.upgrade_role;
					}

					public void setUpgrade_role(long upgrade_role) {
						this.upgrade_role = upgrade_role;
					}
				}
			}
		}
	}
}
