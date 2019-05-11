package com.heiya123.music.service.impl;


import com.alibaba.fastjson.JSON;
import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.constant.MusicConstant;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicService;
import com.heiya123.music.util.NeteaseEncryption;
import com.heiya123.music.util.OkHttpUtils;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import com.heiya123.music.vo.netease.NeteaseMusicBase;
import com.heiya123.music.vo.netease.NeteaseMusicBase.ResultBean.SongsBean;
import com.heiya123.music.vo.netease.NeteaseMusicBase.ResultBean.SongsBean.ArtistsBean;
import com.heiya123.music.vo.netease.NeteaseMusicLyr;
import com.heiya123.music.vo.netease.NeteaseMusicPic;
import com.heiya123.music.vo.netease.NeteaseMusicUrl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service("NeteaseMusic")
public class NeteaseMusicServiceImpl implements MusicService {


  /**
   * 分页获取歌曲
   */
  @Override
  public List<Music> getMusics(MusicReqVo req) {
    ArrayList<Music> list = new ArrayList<>();
    Map<String, String> params = new HashMap<String, String>();
    params.put("s", req.getName());
    params.put("limit", req.getPageSize() + "");
    params.put("type", "1");
    params.put("offset", (req.getPageNo() - 1) * req.getPageSize() + "");
    NeteaseMusicBase neteaseMusicBase = OkHttpUtils
        .postRequest(MusicConstant.NETNASEMUSIC_SEARCH, RequestHeaders.NETEASEHEADERS, params,
            NeteaseMusicBase.class);
    List<SongsBean> songs = neteaseMusicBase.getResult().getSongs();
    for (SongsBean song : songs) {
      Music music = new Music();
      music.setName(song.getName());
      StringBuilder artist = new StringBuilder();
      List<ArtistsBean> artists = song.getArtists();
      for (int i = 0; i < artists.size(); i++) {
        artist.append(artists.get(i).getName());
        if (i != artists.size() - 1) {
          artist.append("、");
        }
      }
      music.setArtist(artist.toString());
      music.setAlbum(song.getAlbum().getName());
      String songId = song.getDuration() + "";
      music.setPic_id(songId);
      music.setId(songId);
      music.setUrl_id(songId);
      music.setLyric_id(song.getId() + "");
      music.setType(MusicType.NETEASE);
      list.add(music);
    }
    return list;
  }

  /**
   * 加载歌单
   */
  @Override
  public Object getPlayList(String id) {
    String url = String.format(MusicConstant.NETNASEMUSIC_PLAY_LIST, id);
    return JSON.parse(OkHttpUtils.getRequest(url, RequestHeaders.NETEASEHEADERS));
  }

  /**
   * 加载用户歌单
   */
  @Override
  public Object getUserPlayList(String id) {
    String url = String.format(MusicConstant.NETNASEMUSIC_USER_PLAY_LIST, id);
    return JSON.parse(OkHttpUtils.getRequest(url, RequestHeaders.NETEASEHEADERS));
  }

  /**
   * 获取歌曲链接
   */
  @Override
  public String getMusicUrl(String id, String bit) {
    RequestHeaders.NETEASEHEADERS.put("User-Agent", RequestHeaders.randomUserAgent());
    RequestHeaders.NETEASEHEADERS.put("Cookie", RequestHeaders.getNeteaseCookie());
    Map<String, String> map = new HashMap<>();
    map.put("ids", "[" + id + "]");
    map.put("br", "320000");
    String data = JSON.toJSONString(map);
    Map<String, String> params = NeteaseEncryption.encrypt(data);
    NeteaseMusicUrl neteaseMusicUrl = OkHttpUtils
        .postRequest(MusicConstant.NETNASEMUSIC_URL, RequestHeaders.NETEASEHEADERS, params,
            NeteaseMusicUrl.class);
    if (neteaseMusicUrl.getCode() != -460) {
      return neteaseMusicUrl.getData().get(0).getUrl() == null ? ""
          : neteaseMusicUrl.getData().get(0).getUrl();
    }
    return "";
  }

  /**
   * 获取封面图片
   */
  @Override
  public String getPic(String id) {
    String url = String.format(MusicConstant.NETNASEMUSIC_PIC, id, id);
    NeteaseMusicPic neteaseMusicPic = OkHttpUtils
        .getRequest(url, RequestHeaders.NETEASEHEADERS, null, NeteaseMusicPic.class);
    return neteaseMusicPic.getSongs().get(0).getAlbum().getPicUrl();
  }

  /**
   * 获取歌词
   */
  @Override
  public String getLyric(String id) {
    String lrc = "";
    String url = String.format(MusicConstant.NETNASEMUSIC_LYRIC, id);
    NeteaseMusicLyr neteaseMusicLyr = OkHttpUtils
        .getRequest(url, RequestHeaders.NETEASEHEADERS, null, NeteaseMusicLyr.class);
    if (neteaseMusicLyr != null && neteaseMusicLyr.getLrc() != null) {
      lrc = neteaseMusicLyr.getLrc().getLyric();
    }
    return lrc;
  }

}
