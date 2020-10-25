package com.springcloud.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class TestConsumer {


    private final String TEST_CONSUMER = "http://SPRINGCLOUD-PROVIDER";

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/testConsumer")
    public String testConsumer(){
//        RestTemplate restTemplate = new RestTemplate();
        String respond = restTemplate.getForObject(TEST_CONSUMER+"/testProvider",String.class);
        return "aaaaaa";
    }

    @GetMapping("/discovery/consumer")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String serviceName:services
             ) {
            System.out.println("************* service" + serviceName);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("springCloud-provider");
        for (ServiceInstance id:instances
             ) {
            System.out.println("************** id" + id.getServiceId() + "\t" +id.getHost()+ "\t"  + id.getPort()  + "\t" +id.getUri() + "\t" + id.getInstanceId());
        }

        return this.discoveryClient;
    }
}
