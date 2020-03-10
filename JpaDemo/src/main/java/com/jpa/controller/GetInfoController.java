package com.jpa.controller;

import com.jpa.dao.BookDao;
import com.jpa.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GetInfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetInfoController.class);

    @Autowired
    BookDao bookDao;

    @PostMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getInfo(HttpServletRequest request) {
        JSONObject json = new JSONObject();
        json.put("code", 0);
        return bookDao.findAll().toString();
    }

    @PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String update(HttpServletRequest request, @RequestBody Book book) {
        JSONObject json = new JSONObject();
        json.put("code", 0);
        bookDao.updateBook3(book.getName(), book.getAuther());
        return json.toString();
    }
}