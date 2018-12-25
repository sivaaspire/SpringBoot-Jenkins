package com.example.demo.jenkins;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	public static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		assertSame(true, true);
		logger.info("Test case executed...");
	}

}

