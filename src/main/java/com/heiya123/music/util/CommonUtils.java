package com.heiya123.music.util;

public class CommonUtils {
    private final static String[] AGENT = {"Android", "iPhone", "iPod", "iPad", "Windows Phone", "MQQBrowser"}; //定义移动端请求的所有可能类型


    /**
     * 判断User-Agent 是不是来自于手机
     *
     * @param ua
     * @return
     */
    public static boolean checkAgentIsMobile(String ua) {
        boolean flag = false;
        if (!ua.contains("Windows NT") || (ua.contains("Windows NT") && ua.contains("compatible; MSIE 9.0;"))) {
            // 排除 苹果桌面系统
            if (!ua.contains("Windows NT") && !ua.contains("Macintosh")) {
                for (String item : AGENT) {
                    if (ua.contains(item)) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    /**
     * JSONP转JSON
     *
     * @param str
     * @return
     */
    public static String jsonp2Json(String str) {
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            String string = stringBuilder.reverse().toString();
            int i = str.indexOf("{");
            int j = string.indexOf("}");
            return i != -1 && j != -1 && i < str.length() - j ? str.substring(i, str.length() - j) : null;
        }
        return null;
    }
}
