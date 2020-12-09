package com.heiya123.music.util;

import javax.servlet.http.HttpServletRequest;
import org.springframework.util.StringUtils;

/**
 * @author: huangsh
 * @date: 2020-12-19 14:08:36
 */
public class RequestUtils {

  private final static String[] AGENT = {"Android", "iPhone", "iPod", "iPad", "Windows Phone",
      "MQQBrowser"}; //定义移动端请求的所有可能类型

  /**
   * 获取访问者IP
   * <p>
   * 在一般情况下使用Request.getRemoteAddr()即可，但是经过nginx等反向代理软件后，这个方法会失效。
   * <p>
   * 本方法先从Header中获取X-Real-IP，如果不存在再从X-Forwarded-For获得第一个IP(用,分割)， 如果还不存在则调用Request
   * .getRemoteAddr()。
   */
  public static String getIpAddr(HttpServletRequest request) {
    String ip = request.getHeader("X-Real-IP");
    if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
      return ip;
    }
    ip = request.getHeader("X-Forwarded-For");
    if (!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
      // 多次反向代理后会有多个IP值，第一个为真实IP。
      String[] split = ip.split(",");
      return split[0];
    } else {
      return request.getRemoteAddr();
    }
  }


  /**
   * 判断User-Agent 是不是来自于手机
   *
   * @param ua
   * @return
   */
  public static boolean checkAgentIsMobile(String ua) {
    boolean flag = false;
    if (!ua.contains("Windows NT") || (ua.contains("Windows NT") && ua
        .contains("compatible; MSIE 9.0;"))) {
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
}
