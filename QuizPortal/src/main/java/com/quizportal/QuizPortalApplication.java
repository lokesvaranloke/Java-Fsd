package com.quizportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.quizportal.entity")
@EnableJpaRepositories("com.quizportal.repository")
public class QuizPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizPortalApplication.class, args);
	}

}
