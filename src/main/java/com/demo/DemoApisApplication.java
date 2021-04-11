package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.demo.entity")
public class DemoApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApisApplication.class, args);
		System.out.println("I am Running");
	}

}
