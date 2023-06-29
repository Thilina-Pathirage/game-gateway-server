package com.example.gamegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GameGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameGatewayApplication.class, args);
    }

}
