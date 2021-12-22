package com.test.springjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.slf4j.*;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

public static	Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	@PostConstruct
	public void init() {
		logger.info("application started.....");
	}

	public static void main(String[] args) {
		logger.info("application executed.....");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
