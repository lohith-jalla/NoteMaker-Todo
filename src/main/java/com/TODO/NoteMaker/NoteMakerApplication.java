package com.TODO.NoteMaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.TODO.NoteMaker")
@EntityScan(basePackages = "com.TODO.NoteMaker")
@SpringBootApplication
public class NoteMakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteMakerApplication.class, args);
	}

}
