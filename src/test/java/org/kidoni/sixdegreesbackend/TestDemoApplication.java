package org.kidoni.sixdegreesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(SixDegreesApplication::main).with(TestDemoApplication.class).run(args);
    }

}
