package com.gawesh.demo.microservicedemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/app/helloworld")
    public Response getGreeting() {

        Response response = new Response();
        response.setCode("200");
        response.setMessage("this is sample message");
        return response;

    }

}
