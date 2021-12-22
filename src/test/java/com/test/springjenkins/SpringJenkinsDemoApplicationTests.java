package com.test.springjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {
	public static	Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	@Test
	void contextLoads() {
		logger.info("test case executing .........");
		logger.info("test case executing 2nd time.........");
assertEquals(true, true	);
	}

}
