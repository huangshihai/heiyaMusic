package com.heiya123.music.common;

import java.util.HashMap;
import java.util.Map;

public class RequestHeaders {
    public static Map<String, String> neteaseHeaders = new HashMap<>();
    public static Map<String, String> tencentHeaders = new HashMap<>();
    public static Map<String, String> kugouHeaders = new HashMap<>();
    public static Map<String, String> xiamiHeaders = new HashMap<>();


    static {
        //设置网易云音乐的请求头
        neteaseHeaders.put("Origin", "http://music.163.com");
        neteaseHeaders.put("Referer", "http://music.163.com");
        neteaseHeaders.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        neteaseHeaders.put("Content-Type", "application/x-www-form-urlencoded");

        //设置QQ音乐的请求头
        tencentHeaders.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        tencentHeaders.put("Referer", "https://y.qq.com/portal/player.html");
        tencentHeaders.put("Cookie", "tvfe_boss_uuid=c3db0dcc4d677c60; pac_uid=1_2728578956; qq_slist_autoplay=on; ts_refer=ADTAGh5_playsong; RK=pKOOKi2f1O; pgv_pvi=8927113216; o_cookie=2728578956; pgv_pvid=5107924810; ptui_loginuin=2728578956; ptcz=897c17d7e17ae9009e018ebf3f818355147a3a26c6c67a63ae949e24758baa2d; pt2gguin=o2728578956; pgv_si=s5715204096; qqmusic_fromtag=66; yplayer_open=1; ts_last=y.qq.com/portal/player.html; ts_uid=996779984; yq_index=0");

        //设置酷狗音乐的请求头
        kugouHeaders.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        kugouHeaders.put("Referer", "http://www.kugou.com/webkugouplayer/flash/webKugou.swf");
        kugouHeaders.put("Cookie", "_WCMID=123456789");

        //设置虾米音乐的请求头
        xiamiHeaders.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36");
        xiamiHeaders.put("Referer", "http://h.xiami.com/");
        xiamiHeaders.put("Cookie", "user_from=2;XMPLAYER_addSongsToggler=0;XMPLAYER_isOpen=0;_xiamitoken=123456789;");
    }
}
