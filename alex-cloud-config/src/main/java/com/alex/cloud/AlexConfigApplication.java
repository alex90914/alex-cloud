package com.alex.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author alex
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class AlexConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexConfigApplication.class, args);
    }
}
