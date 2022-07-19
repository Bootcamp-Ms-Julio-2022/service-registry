package com.nttdata.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryBc072022Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryBc072022Application.class, args);
    }

}
