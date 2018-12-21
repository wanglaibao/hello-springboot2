package com.laibao.springboot2.simplehelloapp.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloApp")
public class HelloWorldController {

    @GetMapping("/sayHello")
    public String greeting(@RequestParam(value = "name", required = false) String name) {
        if (StringUtils.isBlank(name)) {
            return "hello, world";
        }else {
            return "hello,nice to meet you " + name;
        }
    }
}
