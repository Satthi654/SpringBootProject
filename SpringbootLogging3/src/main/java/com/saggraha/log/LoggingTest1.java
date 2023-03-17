package com.saggraha.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingTest1 {
	
	Logger logger=LoggerFactory.getLogger(LoggingTest1.class);
	public void testOneMethod() {
		logger.info("testOneMethod Stared");
		int a=10;
		LoggingTest2 l2=new LoggingTest2();
		l2.testTwoMethod();
		LoggingTest3 l3=new LoggingTest3();
		l3.testThreeMethod();
		logger.info("testOneMethod Ended");
	}
}
