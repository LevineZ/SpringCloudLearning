package com.configClient.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoController.class);

    @Value("${info.profile}")
    String info;

    @Value("${test.profile}")
    String test;

    @RequestMapping(value = "/info")
    public String info() {
        LOGGER.info("github配置信息" + info);
        return info;
    }

}