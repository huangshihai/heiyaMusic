package com.heiya123.music.config;

import com.heiya123.music.entity.kege.KegeProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix="qmkg")
public class KegeConfig {
    private Map<String, KegeProperties> userAttr;

    public Map<String, KegeProperties> getUserAttr() {
        return userAttr;
    }

    public void setUserAttr(Map<String, KegeProperties> userAttr) {
        this.userAttr = userAttr;
    }
}
