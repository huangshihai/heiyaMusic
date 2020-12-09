package com.heiya123.music.service;

import com.heiya123.music.musicEnum.MusicType;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author huangsh
 * @date 2019/5/10
 */
@Component
public class MusicServiceFactory implements ApplicationContextAware {

  private ApplicationContext applicationContext;
  private static Map<MusicType, MusicService> serviceMap;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
    this.init();
  }

  private void init() {
    Map<String, MusicService> beans = applicationContext.getBeansOfType(MusicService.class);
    serviceMap = new HashMap<>();
    for (MusicService service : beans.values()) {
      serviceMap.put(service.getType(), service);
    }
  }

  public static MusicService getService(MusicType type) {
    return serviceMap.get(type);
  }
}
