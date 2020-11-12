package com.alex.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author lishenglin
 */
@EnableEurekaServer
@SpringBootApplication
public class AlexServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexServerApplication.class, args);
    }


    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            //加这句是为了访问eureka控制台和/actuator时能做安全控制
            super.configure(http);
            http.csrf().disable();
        }
    }
}
