package com.gawesh.demo_spring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping
    public String greeting(){
        return "<h1> Welcome to game changing framework, Spring Boot! </h1>";
    }
}
