package com.saggraha.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.saggraha.Palindrome;

public class PalindromeTest {
	
	private static Palindrome pal;
	
	@BeforeAll
	public static void init() {
		System.err.println("Executed init BEFORE ALL test cases");
		pal = new Palindrome();
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("Excecuted initEach Before EACH Test Case");
	}
	
	private static int count=0;
	
	@ParameterizedTest
	@ValueSource(strings = {"RACECAR","MADAM","HELLO","SATHISH","NOON","BYE","RADAR"})
	public void isPalindromeTest1(String str) {
		count = count+1;
		boolean actual = pal.isPalindrome(str);
		System.err.println(count+" =====>> "+str);
		assertTrue(actual);
		
	}
	
	@AfterEach
	public void destroyEach() {
		System.out.println("Executed destroyEach After EACH Test Case");		
	}
	
	@AfterAll
	public static void destroy() {
		System.err.println("Executed destroy AFTER ALL test cases");
	}

}
