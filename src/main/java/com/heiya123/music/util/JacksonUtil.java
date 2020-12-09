package com.heiya123.music.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class JacksonUtil {

  private static final Logger log = LoggerFactory.getLogger(JacksonUtil.class);

  private static final ObjectMapper MAPPER;

  static {
    MAPPER = new ObjectMapper();
    MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
  }

  private JacksonUtil() {
  }

  public static ObjectMapper get() {
//    ObjectMapper mapper = new ObjectMapper();
//    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//    mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
//    return mapper;
    return MAPPER;
  }

  public static <T> T read(String src, Class<T> clazz) {
    if (StringUtils.isEmpty(src)) {
      return null;
    }
    try {
      return get().readValue(src, clazz);
    } catch (Exception e) {
      log.error("jackson.error: {} 解析错误!", src);
      throw new RuntimeException(e);
    }
  }

  public static <T> T read(String src, JavaType javaType) {
    if (StringUtils.isEmpty(src)) {
      return null;
    }
    try {
      return get().readValue(src, javaType);
    } catch (Exception e) {
      log.error("jackson.error: {} 解析错误!", src);
      throw new RuntimeException(e);
    }
  }

  public static <T> T read(String src, TypeReference<T> javaType) {
    if (StringUtils.isEmpty(src)) {
      return null;
    }
    try {
      return get().readValue(src, javaType);
    } catch (Exception e) {
      log.error("jackson.error: {} 解析错误!", src);
      throw new RuntimeException(e);
    }
  }

  public static String write(Object value) {
    try {
      return get().writeValueAsString(value);
    } catch (JsonProcessingException e) {
      log.error("jackson.error: {} 解析错误!", value);
      throw new RuntimeException(e);
    }
  }

  /**
   * 转化为list
   *
   * @param src
   * @param clazz list面的对象
   * @return
   */
  public static <T> List<T> readList(String src, Class<T> clazz) {
    return read(src, getType(ArrayList.class, clazz));
  }

  /**
   * 转化为map
   *
   * @param src
   * @param key   key 的class
   * @param value value 的class
   * @return
   */
  public static <T, H> Map<T, H> readMap(String src, Class<T> key, Class<H> value) {
    return read(src, getType(HashMap.class, key, value));
  }


  public static JavaType getType(Class<?> collectionClass, Class<?>... elementClasses) {
    return get().getTypeFactory().constructParametricType(collectionClass, elementClasses);
  }

}
