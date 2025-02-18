package com.formsklon.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/byname")
    public String requestMethodName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
    // http://localhost:8080/byname?name=Deniz

}
