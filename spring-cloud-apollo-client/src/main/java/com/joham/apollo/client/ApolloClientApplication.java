package com.joham.apollo.client;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joham
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableApolloConfig
public class ApolloClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String hi() {
        return foo;
    }
}

