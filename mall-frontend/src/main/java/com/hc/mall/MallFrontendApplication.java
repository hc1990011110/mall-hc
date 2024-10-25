package com.hc.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallFrontendApplication.class, args);
    }

}
