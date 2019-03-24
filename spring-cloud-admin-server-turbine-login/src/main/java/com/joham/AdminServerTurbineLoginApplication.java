package com.joham;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author joham
 */
@SpringBootApplication
@EnableTurbine
@EnableAdminServer
@EnableHystrixDashboard
@EnableHystrix
public class AdminServerTurbineLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerTurbineLoginApplication.class, args);
    }
}
