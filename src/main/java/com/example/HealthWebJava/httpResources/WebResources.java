package com.example.HealthWebJava.httpResources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebResources {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}