package com.heiya123.music.controller;


import com.alibaba.fastjson.JSON;
import com.heiya123.music.entity.vo.SearchRequestVo;
import com.heiya123.music.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MusicController {
    @Autowired
    private QQMusicService qqMusicService;
    @Autowired
    private NeteaseMusicService neteaseMusicService;
    @Autowired
    private KuGouMusicService kuGouMusicService;
    @Autowired
    private XiaMiMusicService xiaMiMusicService;
    @Autowired
    private KgService kgService;
    private static Logger logger = LoggerFactory.getLogger(MusicController.class);

    /**
     * 查找歌曲
     *
     * @param reqVo
     * @return
     */
    @PostMapping("/searchMusic")
    public String searchMusic(SearchRequestVo reqVo) {
        String musics = null;
        switch (reqVo.getSource()) {
            case "tencent":
                musics = JSON.toJSONString(qqMusicService.findMusicByPage(reqVo));
                break;
            case "netease":
                musics = JSON.toJSONString(neteaseMusicService.findMusicByPage(reqVo));
                break;
            case "kugou":
                musics = JSON.toJSONString(kuGouMusicService.findMusicByPage(reqVo));
                break;
            case "xiami":
                musics = JSON.toJSONString(xiaMiMusicService.findMusicByPage(reqVo));
                break;
            default:
                break;
        }
        return reqVo.getCallback() + "(" + musics + ")";
    }

    /**
     * 歌单
     *
     * @param id
     * @param callback
     * @return
     */
    @PostMapping("/playList")
    public String playList(String id, String callback) {
        String playList = null;
        if ("9005288001".equals(id)) {
            playList = kgService.playList("619f94812d2e328e32");
        } else if ("9005288002".equals(id)) {
            playList = kgService.playList("63999887222f3f8235");
        } else {
            playList = neteaseMusicService.playList(id);
        }
        return callback + "(" + playList + ")";

    }

    /**
     * 用户歌单
     *
     * @param uid
     * @param callback
     * @return
     */
    @PostMapping("/userList")
    public String userList(String uid, String callback) {
        String playList = neteaseMusicService.userList(uid);
        return callback + "(" + playList + ")";

    }

    /**
     * 音乐链接
     *
     * @param source
     * @param id
     * @param callback
     * @return
     */
    @PostMapping("/loadMusicUrl")
    public String loadMusicUrl(String source, String id, String callback) {
        Map<String, String> map = new HashMap<>();
        switch (source) {
            case "tencent":
                map.put("url", qqMusicService.loadMusicUrl(id));
                map.put("br", "320");
                break;
            case "netease":
                map.put("url", neteaseMusicService.loadMusicUrl(id));
                map.put("br", "320");
                break;
            case "kugou":
                map.put("url", kuGouMusicService.loadMusicUrl(id));
                map.put("br", "128");
                break;
            case "xiami":
                map.put("url", xiaMiMusicService.loadMusicUrl(id));
                map.put("br", "128");
                break;
            case "qmkg":
                map.put("url", kgService.loadMusicUrl(id));
                map.put("br", "128");
                break;
            default:
                break;
        }
        return callback + "(" + JSON.toJSONString(map) + ")";
    }

    /**
     * 封面图片
     *
     * @param source
     * @param id
     * @param callback
     * @return
     */
    @PostMapping("/loadPic")
    public String loadPic(String source, String id, String callback) {
        Map<String, String> map = new HashMap<>();
        switch (source) {
            case "tencent":
                map.put("url", qqMusicService.loadPic(id));
                break;
            case "netease":
                map.put("url", neteaseMusicService.loadPic(id));
                break;
            case "kugou":
                map.put("url", kuGouMusicService.loadPic(id));
                break;
            case "xiami":
                map.put("url", xiaMiMusicService.loadPic(id));
                break;
            default:
                break;
        }
        return callback + "(" + JSON.toJSONString(map) + ")";
    }

    /**
     * 歌词
     *
     * @param source
     * @param id
     * @param callback
     * @return
     */
    @PostMapping("/loadLrc")
    public String loadLrc(String source, String id, String callback) {
        Map<String, String> map = new HashMap<>();
        switch (source) {
            case "tencent":
                map.put("lyric", qqMusicService.loadLyric(id));
                map.put("tlyric", "");
                break;
            case "netease":
                map.put("lyric", neteaseMusicService.loadLyric(id));
                map.put("tlyric", "");
                break;
            case "kugou":
                map.put("lyric", kuGouMusicService.loadLyric(id));
                map.put("tlyric", "");
                break;
            case "xiami":
                map.put("lyric", "");
                map.put("tlyric", "");
                break;
            case "qmkg":
                map.put("lyric", kgService.loadLyric(id));
                map.put("tlyric", "");
                break;
            default:
                break;
        }
        return callback + "(" + JSON.toJSONString(map) + ")";
    }

}
