package com.ribbon.controller;

import com.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TestService testService;

    @GetMapping(value = "/add")
    public String add() {
        return restTemplate.getForEntity("http://LEVINE/add?a=10&b=20", String.class).getBody();
    }

    @GetMapping(value = "add1")
    public String add1() {
        return testService.addService();
    }
}
