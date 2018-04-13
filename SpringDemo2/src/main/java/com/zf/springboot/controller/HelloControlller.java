package com.zf.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zf
 * @描述:
 * @创建: 2018/4/13-16:36;
 * @版本: V1.0
 **/
@RestController
public class HelloControlller {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
