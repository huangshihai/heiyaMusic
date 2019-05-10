package com.heiya123.music.config;

import com.heiya123.music.vo.qmkg.QmkgProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix="qmkg")
public class KegeConfig {
    private Map<String, QmkgProperties> userAttr;

    public Map<String, QmkgProperties> getUserAttr() {
        return userAttr;
    }

    public void setUserAttr(Map<String, QmkgProperties> userAttr) {
        this.userAttr = userAttr;
    }
}
