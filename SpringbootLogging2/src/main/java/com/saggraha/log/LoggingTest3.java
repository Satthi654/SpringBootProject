package com.saggraha.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest3 {
	Logger logger =LoggerFactory.getLogger(LoggingTest3.class);
	public void testThreeMethod() {
		logger.info("testThreeMethod Stared");
		int a=10;
		logger.info("testThreeMethod Ended");
	}
}
