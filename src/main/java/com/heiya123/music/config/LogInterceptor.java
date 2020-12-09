package com.heiya123.music.config;

import com.heiya123.music.util.JacksonUtil;
import com.heiya123.music.util.RequestUtils;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Log4j2
public class LogInterceptor implements HandlerInterceptor {

  private static final Logger LOGGER = LoggerFactory.getLogger(LogInterceptor.class);

  private static final String START_TIME = "_music_req_start_time";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
      Object handler) {

    String ipAddr = RequestUtils.getIpAddr(request);

    Map<String, String[]> parameterMap = request.getParameterMap();
    Enumeration<String> headerNames = request.getHeaderNames();
    Map<String, String> headers = new HashMap<>();
    while (headerNames.hasMoreElements()) {
      String element = headerNames.nextElement();
      headers.put(element, request.getHeader(element));
    }
    request.setAttribute(START_TIME, System.currentTimeMillis());
    MDC.put("REQ_ID", ThreadLocalRandom.current().nextInt() + "");

    LOGGER.info("ip:{}, url:{}, params:{},headers:{} ",
        ipAddr,
        request.getRequestURI(),
        JacksonUtil.write(parameterMap),
        JacksonUtil.write(headers));

    return true;
  }


  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    Object startTime = request.getAttribute(START_TIME);
    if (startTime != null) {
      Long cost = System.currentTimeMillis() - (Long) startTime;
      LOGGER.info("end-----请求:{},耗时:{}", request.getRequestURI(), cost);
    }

  }

}
