package com.emsi.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.emsi.quiz.entity")
public class AppQuizBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppQuizBackendApplication.class, args);
	}

}
