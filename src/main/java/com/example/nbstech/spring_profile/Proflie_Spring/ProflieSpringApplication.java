package com.example.nbstech.spring_profile.Proflie_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ProflieSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProflieSpringApplication.class, args);
	}

}
