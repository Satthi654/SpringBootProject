package com.saggraha.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest2 {
	Logger logger =LoggerFactory.getLogger(LoggingTest2.class);
	public void testTwoMethod() {
		logger.info("testTwoMethod Stared");
		int a=10;
		logger.info("testTwoMethod Ended");
	}
}
