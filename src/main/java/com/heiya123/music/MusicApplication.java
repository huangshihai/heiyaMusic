package com.heiya123.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MusicApplication {

  public static void main(String[] args) {
    SpringApplication.run(MusicApplication.class, args);
  }

}
