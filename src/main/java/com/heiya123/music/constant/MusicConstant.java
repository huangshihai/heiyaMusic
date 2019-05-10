package com.heiya123.music.constant;

/**
 * @author huangsh
 * @date 2019/5/10
 */
public final class MusicConstant {

  private MusicConstant() {
  }

  public static final String QQMUSIC_SEARCH = "http://soso.music.qq.com/fcgi-bin/search_cp?aggr=0&catZhida=0&lossless=1&sem=1&w=%s&n=%d&t=0&p=%d&remoteplace=sizer.yqqlist.song&g_tk=5381&loginUin=0&hostUin=0&format=jsonp&inCharset=GB2312&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0";

  public static final String QQMUSIC_REQ_URL = "http://c.y.qq.com/base/fcgi-bin/fcg_music_express_mobile3.fcg?g_tk=0&loginUin=%s&hostUin=0&format=json&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0&cid=205361747&uin=%s&songmid=003a1tne1nSz1Y&filename=C400003a1tne1nSz1Y.m4a&guid=%s";

  public static final String QQMUSIC_URL = "http://streamoc.music.tc.qq.com/M500%s.mp3?vkey=%s&guid=1234567890&uin=1008611&fromtag=8";

  public static final String QQMUSIC_PIC = "http://i.gtimg.cn/music/photo/mid_album_500/%s/%s/%s.jpg";

  public static final String QQMUSIC_LYRIC = "http://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric.fcg?format=json&nobase64=1&songtype=0&callback=c&songmid=%s";

  public static final String NETNASEMUSIC_SEARCH = "http://music.163.com/api/search/pc";

  public static final String NETNASEMUSIC_URL = "http://music.163.com/weapi/song/enhance/player/url?csrf_token=";

  public static final String NETNASEMUSIC_PIC = "http://music.163.com/api/song/detail/?%s&ids=[%s]";

  public static final String NETNASEMUSIC_LYRIC = "https://music.163.com/api/song/lyric?os=pc&id=%s&lv=-1&kv=-1&tv=-1";

  public static final String NETNASEMUSIC_PLAY_LIST = "http://music.163.com/api/v3/playlist/detail?n=1000&id=%s";

  public static final String NETNASEMUSIC_USER_PLAY_LIST = "http://music.163.com/api/user/playlist/?offset=0&uid=%s&limit=50";

  public static final String KUGOUMUSIC_SEARCH = "http://songsearch.kugou.com/song_search_v2?keyword=%s&page=%d&pagesize=%d";

  public static final String KUGOUMUSIC_URL = "http://trackercdnbj.kugou.com/i/v2/?cmd=23&pid=1&behavior=download&hash=%s&key=%s";

  public static final String KUGOUMUSIC_PIC = "http://tools.mobile.kugou.com/api/v1/singer_header/get_by_hash?hash=%s&size=150&format=json";

  public static final String KUGOUMUSIC_LYRIC = "http://m.kugou.com/app/i/krc.php?cmd=100&timelength=999999&hash=%s";

  public static final String XIAMIMUSIC_SEARCH = "http://api.xiami.com/web?v=2.0&app_key=1&key=%s&page=%d&limit=%d&r=search/songs";

  public static final String QMKG_LYRIC = "http://node.kg.qq.com/cgi/fcgi-bin/fcg_lyric?jsonpCallback=callback_1&g_tk=5381&outCharset=utf-8&format=jsonp&ksongmid=%s&g_tk_openkey=1191280939&_=%s";
  public static final String QMKG_URL = "http://node.kg.qq.com/play?s=%s&g_f=personal";


}
