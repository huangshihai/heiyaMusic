package com.heiya123.music.util;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * 网络请求工具类
 */
@Slf4j
public class HttpUtils {

  private static final RestTemplate httpClient = new RestTemplate();

  /**
   * get方法
   *
   * @param reqUrl  URL
   * @param headers 请求头参数
   */
  public static String getRequest(String reqUrl, HttpHeaders headers) {
    return getRequest(reqUrl, headers, null);
  }

  /**
   * get方法
   *
   * @param reqUrl  URL
   * @param headers 请求头参数
   * @param params  请求参数
   */
  public static String getRequest(String reqUrl, HttpHeaders headers, Map<String, String> params) {
    HttpEntity<MultiValueMap<String, String>> requestEntity = getHttpEntity(headers, params);
    ResponseEntity<String> resEntity = httpClient
        .exchange(reqUrl, HttpMethod.GET, requestEntity, String.class);
    return resEntity.getBody();
  }

  /**
   * get方法获取实体bean
   *
   * @param reqUrl   UR连接
   * @param headers  请求头参数
   * @param params   请求参数
   * @param rspClass 实体类 执行命令获取指定结构 rspClass : 所需转出的结构，例：UserBean.class
   */
  public static <T> T getRequest(String reqUrl, HttpHeaders headers,
      Map<String, String> params, Class<T> rspClass) {
    String rsp = getRequest(reqUrl, headers, params);
    return JacksonUtil.read(rsp, rspClass);
  }

  /**
   * post
   *
   * @param reqUrl  UR连接
   * @param headers 请求头参数
   * @param params  请求参数
   */
  public static String postRequest(String reqUrl, HttpHeaders headers,
      Map<String, String> params) {
    HttpEntity<MultiValueMap<String, String>> requestEntity = getHttpEntity(headers, params);
    ResponseEntity<String> resEntity = httpClient
        .exchange(reqUrl, HttpMethod.POST, requestEntity, String.class);
    return resEntity.getBody();
  }

  /**
   * post方法获取实体bean
   *
   * @param reqUrl   UR连接
   * @param headers  请求头参数
   * @param params   请求参数
   * @param rspClass 实体类 执行命令获取指定结构 rspClass : 所需转出的结构，例：UserBean.class
   */
  public static <T> T postRequest(String reqUrl, HttpHeaders headers,
      Map<String, String> params, Class<T> rspClass) {
    String rsp = postRequest(reqUrl, headers, params);
    return JacksonUtil.read(rsp, rspClass);
  }

  private static HttpEntity<MultiValueMap<String, String>> getHttpEntity(HttpHeaders headers,
      Map<String, String> params) {
    MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
    if (!CollectionUtils.isEmpty(params)) {
      body.setAll(params);
    }
    return new HttpEntity<>(body, headers);
  }
}
