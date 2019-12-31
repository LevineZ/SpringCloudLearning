package com.feign.controller;


import com.feign.service.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestClient testClient;

    /**
     * 实现一个加法操作
     * @return
     */
    @GetMapping("/add")
    public Integer add() {
        return testClient.add(10, 20);
    }
}