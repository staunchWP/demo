package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HuRui
 * create on 2018/3/24 9:41
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "Hello World!!! staunch man 11111";
    }
}
