package com.cht.ccbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @GetMapping(value = "/aaa")
    public String demo() {
        return "Spring Boot + Spring Security Configuration Demo";
    }

}