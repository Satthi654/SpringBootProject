package com.saggraha.test;

import org.springframework.stereotype.Service;

@Service
public class Testing {
	static {
		System.out.println("Static block executed successully..");
	}
	
	public void getData() {
		
		System.out.println("Get Data Function executed");
	}
}
