package com.github.hadesfranklyn.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	//https://spring.io/guides/topicals/spring-boot-docker/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
