package com.skillwise.skillwiseeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SkillwiseeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillwiseeurekaApplication.class, args);
    }

}
