package com.heiya123.music.common;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.http.HttpHeaders;

public class RequestHeaders {

  public static HttpHeaders NETEASE_HEADERS = new HttpHeaders();
  public static HttpHeaders TENCENT_HEADERS = new HttpHeaders();
  public static HttpHeaders KUGOU_HEADERS = new HttpHeaders();
  public static HttpHeaders XIAMI_HEADERS = new HttpHeaders();
  public static HttpHeaders BAIDU_HEADERS = new HttpHeaders();
  private static final String[] userAgentList = {
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36",
      "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1",
      "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1",
      "Mozilla/5.0 (Linux; Android 5.0; SM-G900P Build/LRX21T) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Mobile Safari/537.36",
      "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Mobile Safari/537.36",
      "Mozilla/5.0 (Linux; Android 5.1.1; Nexus 6 Build/LYZ28E) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Mobile Safari/537.36",
      "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_2 like Mac OS X) AppleWebKit/603.2.4 (KHTML, like Gecko) Mobile/14F89;GameHelper",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_5) AppleWebKit/603.2.4 (KHTML, like Gecko) Version/10.1.1 Safari/603.2.4",
      "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A300 Safari/602.1",
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:46.0) Gecko/20100101 Firefox/46.0",
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:46.0) Gecko/20100101 Firefox/46.0",
      "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)",
      "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/4.0)",
      "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)",
      "Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0)",
      "Mozilla/5.0 (Windows NT 6.3; Win64, x64; Trident/7.0; rv:11.0) like Gecko",
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/13.10586",
      "Mozilla/5.0 (iPad; CPU OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A300 Safari/602.1"
  };


  static {
    //设置网易云音乐的请求头
    NETEASE_HEADERS.add("Accept", "*/*");
    NETEASE_HEADERS.add("Accept-Language", "zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4");
    NETEASE_HEADERS.add("Content-Type", "application/x-www-form-urlencoded");
    NETEASE_HEADERS.add("Host", "music.163.com");
    NETEASE_HEADERS.add("Origin", "http://music.163.com");
    NETEASE_HEADERS.add("Referer", "http://music.163.com");
    NETEASE_HEADERS.add("User-Agent", randomUserAgent());

    //设置QQ音乐的请求头
    TENCENT_HEADERS.add("User-Agent", randomUserAgent());
    TENCENT_HEADERS.add("Referer", "https://y.qq.com/");
    TENCENT_HEADERS.add("Cookie",
        "tvfe_boss_uuid=c3db0dcc4d677c60; pac_uid=1_2728578956; qq_slist_autoplay=on; ts_refer=ADTAGh5_playsong; RK=pKOOKi2f1O; pgv_pvi=8927113216; o_cookie=2728578956; pgv_pvid=5107924810; ptui_loginuin=2728578956; ptcz=897c17d7e17ae9009e018ebf3f818355147a3a26c6c67a63ae949e24758baa2d; pt2gguin=o2728578956; pgv_si=s5715204096; qqmusic_fromtag=66; yplayer_open=1; ts_last=y.qq.com/portal/player.html; ts_uid=996779984; yq_index=0");

    //设置酷狗音乐的请求头
    KUGOU_HEADERS.add("User-Agent", randomUserAgent());
    KUGOU_HEADERS.add("Referer", "http://www.kugou.com/");
    KUGOU_HEADERS.add("Cookie", "_WCMID=123456789");

    //设置虾米音乐的请求头
    XIAMI_HEADERS.add("User-Agent", randomUserAgent());
    XIAMI_HEADERS.add("Referer", "http://h.xiami.com/");
    XIAMI_HEADERS.add("Cookie",
        "user_from=2;XMPLAYER_addSongsToggler=0;XMPLAYER_isOpen=0;_xiamitoken=123456789;");

    //设置百度音乐的请求头
    BAIDU_HEADERS.add("User-Agent", randomUserAgent());
    BAIDU_HEADERS.add("Referer", "http://music.baidu.com/");
  }

  public static String getNeteaseCookie() {
    String jsessionid = RandomStringUtils
        .random(176, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKMNOPQRSTUVWXYZ\\/+") + ":"
        + System.currentTimeMillis();
    String nuid = RandomStringUtils.random(32, "0123456789abcdefghijklmnopqrstuvwxyz");
    return "JSESSIONID-WYYY=" + jsessionid + "; _iuqxldmzr_=32; _ntes_nnid=" + nuid + "," + System
        .currentTimeMillis() + "; _ntes_nuid=" + nuid;
  }

  public static String randomUserAgent() {
    return userAgentList[(int) (Math.random() * userAgentList.length)];
  }
}
