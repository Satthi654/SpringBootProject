package com.saggraha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
	
	private static Palindrome pal;
	
	@BeforeAll
	public static void init() {
		System.err.println("Executing Before all test cases");
		pal  = new Palindrome();
		
	}
	
	@BeforeEach
	public  void initEach() {
		System.out.println("Executed Before Each Method Before Each Test Case");
	}
	
	@Test
	public void isPalindromeTest1() {
		System.err.println("Test Case One Executed");
		boolean actual = pal.isPalindrome("GADAG");
		assertTrue(actual);
		
	}
	
	@Test
	public void isPalindromeTest2() {
		System.err.println("Test Case Two Executed");
		boolean actual = pal.isPalindrome("madam");
		assertTrue(actual);
		
	}
	
	@Test
	public void isPalindromeTest3() {
		System.err.println("Test case Three Executed");
		boolean actual = pal.isPalindrome("Hello");
		assertFalse(actual);
	}
	
	@Test
	public void isPalindromeTest4() {
		System.err.println("Test case Four Executed");
		boolean actual = pal.isPalindrome("MADAM");
		assertTrue(actual);
	}
	
	@Test
	public void isPalindromeTest5() {
		System.err.println("Test case Five Executed");
		boolean actual = pal.isPalindrome("RaceCar");
		assertFalse(actual);
	}
	
	@Test
	public void isPalindromeTest6() {
		System.err.println("Test case Six Executed");
		boolean actual = pal.isPalindrome("pop");
		assertTrue(actual);
	}
	
	@AfterEach
	public  void destroyEach() {
		System.out.println("Executed After Each Method After Each Test Case");
	}
	
	@AfterAll
	public static void destroy() {
		pal=null;
		System.err.println("Executing After all test cases");
	}
}
