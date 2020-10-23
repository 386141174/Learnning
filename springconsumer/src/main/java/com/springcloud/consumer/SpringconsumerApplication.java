package com.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringconsumerApplication.class, args);
    }

}
