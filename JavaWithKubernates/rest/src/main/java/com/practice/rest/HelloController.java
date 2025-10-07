package com.practice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/s")
    public String sayHello() {
        System.out.println("Printing hello");
        return "Hello World!";
    }
}
