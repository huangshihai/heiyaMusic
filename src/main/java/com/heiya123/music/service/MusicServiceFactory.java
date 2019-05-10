package com.heiya123.music.service;

import com.heiya123.music.musicEnum.MusicType;
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
  private Map<String, MusicService> serviceMap;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }

  public MusicService getService(MusicType type) {
    if (serviceMap == null) {
      synchronized (MusicServiceFactory.class) {
        if (serviceMap == null) {
          serviceMap = applicationContext.getBeansOfType(MusicService.class);
        }
      }
    }
    return serviceMap.get(type.getName());
  }
}
