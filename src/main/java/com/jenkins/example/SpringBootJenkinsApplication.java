package com.jenkins.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}
	
	@GetMapping(value="/hello-test")
	public String helloWorld()
	{
		return "hello world";
	}

}
