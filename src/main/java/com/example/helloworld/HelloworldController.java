package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/")
    public String getWelcomeText() {
        return "HI Hello";
    }
    @GetMapping("/name")
    public String getName() {
        return "sreedhar";
    }
}