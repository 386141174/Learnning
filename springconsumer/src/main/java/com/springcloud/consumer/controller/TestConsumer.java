package com.springcloud.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class TestConsumer {


    private final String TEST_CONSUMER = "http://SPRINGCLOUD-PROVIDER";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/testConsumer")
    public String testConsumer(){
//        RestTemplate restTemplate = new RestTemplate();
        String respond = restTemplate.getForObject(TEST_CONSUMER+"/testProvider",String.class);
        return "aaaaaa";
    }
}
