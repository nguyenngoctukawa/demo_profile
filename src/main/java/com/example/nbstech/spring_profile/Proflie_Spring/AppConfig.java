package com.example.nbstech.spring_profile.Proflie_Spring;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class AppConfig {
    @PostConstruct
    public void print(){
        System.out.println("spring profiles ");
    }
}
