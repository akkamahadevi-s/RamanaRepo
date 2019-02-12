package com.springdemo.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringdemoApplication {
	
	@RequestMapping("/")
	public String helloMethod() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}
}