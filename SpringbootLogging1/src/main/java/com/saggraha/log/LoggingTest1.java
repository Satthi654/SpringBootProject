package com.saggraha.log;

import org.springframework.stereotype.Service;

@Service
public class LoggingTest1 {
	
	public void testOneMethod() {
		System.out.println("testOneMethod Stared");
		int a=10;
		LoggingTest2 l2=new LoggingTest2();
		l2.testTwoMethod();
		LoggingTest3 l3=new LoggingTest3();
		l3.testThreeMethod();
		System.out.println("testOneMethod Ended");
	}
}
