package com.jpa.controller;

import com.alibaba.fastjson.JSONObject;
import com.jpa.dao.SmsDao;
import com.jpa.entity.Sms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/sms")
public class SmsController {
    public static final Logger LOGGER = LoggerFactory.getLogger(SmsController.class);

    @Autowired
    SmsDao smsDao;

    @PostMapping(value = "getSms", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getSms(HttpServletRequest request, @RequestBody Sms sms) {
        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("code", 0);
//        smsDao.save(sms);
//        jsonObject.put("data", sms.toString());
        return jsonObject.toString();
    }


}