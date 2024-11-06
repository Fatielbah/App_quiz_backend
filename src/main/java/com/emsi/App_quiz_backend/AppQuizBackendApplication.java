package com.emsi.App_quiz_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.emsi.entity")
public class AppQuizBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppQuizBackendApplication.class, args);
	}

}
