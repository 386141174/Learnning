package com.springcloud.provide.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ProvideController {


    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String prot;

    final static String TEST_CONSUMER = "http://SPRINGCLOUD-CONSUMER";

    public static void main(String[] args) {
        ProvideController provideController = new ProvideController();
        provideController.test();
    }

    @GetMapping("testProvider")
    public void test() {
//        return new TestCommon(1,"成功",restTemplate.getForObject(TEST_CONSUMER + "testConsumer",String.class));
//        String s = restTemplate.getForObject(TEST_CONSUMER+"/testConsumer",String.class);
        System.out.println("a1" + prot);
//        return s;
    }
}

