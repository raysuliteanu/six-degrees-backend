package org.kidoni.sixdegreesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class SixDegreesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SixDegreesApplication.class, args);
  }

}
