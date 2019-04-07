package com.joham.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @author joham
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class AuthServiceJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServiceJwtApplication.class, args);
    }
}

