package com.example.nbstech.spring_profile.Proflie_Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${Spring.messager}")
    private String messager;

    @GetMapping("/messager")
    public String hello(){
        return messager;
    }
}
