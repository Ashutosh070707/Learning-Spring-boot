package com.ashutosh.learningSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashutosh.learningSpringboot"})
public class LearningSpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearningSpringbootApplication.class, args);
		context.close();
	}
}

