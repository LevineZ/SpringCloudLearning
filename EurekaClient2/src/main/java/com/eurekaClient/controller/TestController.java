package com.eurekaClient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Qualifier("discoveryClient")
    @Autowired
    DiscoveryClient client;

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        List<String> instance = client.getServices();//.getLocalServiceInstance();
        System.out.println(instance);
        Integer r=a+b;
        return r;
//        JSONObject json = new JSONObject();
//        json.put("SpringCloud", 1);
//        return json.toString();
    }

}