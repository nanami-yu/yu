package com.nanami.yu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: yu
 * @description: 欢迎
 * @author: nanami
 * @create: 2020-05-09 14:05
 **/

@RestController
public class HelloController {

    @PostMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
