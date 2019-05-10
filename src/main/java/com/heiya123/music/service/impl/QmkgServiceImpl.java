package com.heiya123.music.service.impl;

import com.alibaba.fastjson.JSON;
import com.heiya123.music.config.KegeConfig;
import com.heiya123.music.constant.MusicConstant;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicService;
import com.heiya123.music.util.CommonUtils;
import com.heiya123.music.util.OkHttpUtils;
import com.heiya123.music.vo.MusicSheet;
import com.heiya123.music.vo.MusicSheet.ItemBean;
import com.heiya123.music.vo.qmkg.QmkgLyric;
import com.heiya123.music.vo.qmkg.QmkgMusic;
import com.heiya123.music.vo.qmkg.QmkgMusic.DataBean.UgclistBean;
import com.heiya123.music.vo.qmkg.QmkgProperties;
import com.heiya123.music.vo.qmkg.QmkgUrl;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("QmkgMusic")
public class QmkgServiceImpl implements MusicService {

  @Autowired
  private KegeConfig kegeConfig;

  @Override
  public String getMusicUrl(String id) {
    String url = String.format(MusicConstant.QMKG_URL, id);
    String rsp = OkHttpUtils.getRequest(url, null);
    String regex = "window.__DATA__ = ([\\s\\S]*?(?=</script>))</script>";
    Matcher matcher = Pattern.compile(regex).matcher(rsp);
    if (matcher.find()) {
      QmkgUrl qmkgUrl = JSON.parseObject(CommonUtils.jsonp2Json(matcher.group(1)), QmkgUrl.class);
      return qmkgUrl.getDetail().getPlayurl();
    }
    return null;
  }

  @Override
  public String getLyric(String id) {
    String url = String.format(MusicConstant.QMKG_LYRIC, id, System.currentTimeMillis());
    QmkgLyric qmkgLyric = OkHttpUtils.getRequest(url, null, null, QmkgLyric.class);
    if (qmkgLyric != null && qmkgLyric.getData() != null) {
      return qmkgLyric.getData().getLyric();
    }
    return "";
  }


  @Override
  public Object getPlayList(String id) {
    MusicSheet musicSheet = new MusicSheet();
    QmkgProperties qmkgProperties = kegeConfig.getUserAttr().get(id);
    musicSheet.setName(qmkgProperties.getTitle());
    musicSheet.setCover(qmkgProperties.getCover());
    QmkgMusic kegeMusic = getKgMusicList(id, 1);
    if (kegeMusic.getCode() == 0 && kegeMusic.getData() != null) {
      int total = kegeMusic.getData().getUgc_total_count();
      int count = total % 8 == 0 ? total / 8 : (total / 8) + 1;
      for (int i = 1; i <= count; i++) {
        QmkgMusic kgMusicList = getKgMusicList(id, i);
        if (kgMusicList != null && kgMusicList.getCode() == 0 && kgMusicList.getData() != null
            && kgMusicList.getData().getUgclist().size() > 0) {
          List<QmkgMusic.DataBean.UgclistBean> ugclist = kgMusicList.getData().getUgclist();
          for (UgclistBean anUgclist : ugclist) {
            ItemBean item = new ItemBean();
            item.setId(anUgclist.getShareid());
            item.setName(anUgclist.getTitle());
            item.setPic(anUgclist.getAvatar());
            item.setArtist(qmkgProperties.getSinger());
            item.setType(MusicType.QMKG);
            item.setUrl_id(anUgclist.getKsong_mid());
            item.setLyric_id(anUgclist.getKsong_mid());
            item.setAlbum(qmkgProperties.getAlbum());
            musicSheet.getItem().add(item);
          }
        }
      }
    }
    return musicSheet;
  }

  @Override
  public Object getUserPlayList(String id) {
    List<String> list = new ArrayList<>();
    kegeConfig.getUserAttr().forEach((k, v) -> {
      list.add("kg-" + k);
    });
    return list;
  }

  private QmkgMusic getKgMusicList(String id, int index) {
    String url =
        "http://node.kg.qq.com/cgi/fcgi-bin/kg_ugc_get_homepage?jsonpcallback=callback_4&g_tk=5381&outcharset=utf-8&format=jsonp&type=get_ugc&start="
            + index + "&num=8&touin=&share_uid=" + id + "&g_tk_openkey=1191280939&_=" + System
            .currentTimeMillis();
    return OkHttpUtils.getRequest(url, null, null, QmkgMusic.class);
  }
}
