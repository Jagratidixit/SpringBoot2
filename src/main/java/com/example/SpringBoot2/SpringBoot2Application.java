package com.example.SpringBoot2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2Application {
	private static final Logger logger = LoggerFactory.getLogger(SpringBoot2Application.class);

	public static void main(String[] args) {
		logger.info("Starting Spring Boot Application...");
		SpringApplication.run(SpringBoot2Application.class, args);
		logger.info("Application Started Successfully.");
	}
}
