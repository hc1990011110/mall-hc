package com.hc.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallBackendApplication.class, args);
    }

}
