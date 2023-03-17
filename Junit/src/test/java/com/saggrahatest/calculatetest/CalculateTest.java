package com.saggrahatest.calculatetest;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.saggraha.calculate.Calculate;

public class CalculateTest {
	
	private static Calculate cal;

		@BeforeClass
		public static void init() {
			 cal=new Calculate();
			 System.out.println("*****init executed******");
		}

	@Test
	public void performAdditionTest() {
		Integer actualResult = cal.performAddition(10, 20);
		Integer expectedResult =30;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void performSubtractionTest() {
		Integer actualResult = cal.performSubtraction(10, 20);
		Integer expectedResult=-10;
		assertEquals(actualResult, expectedResult);
	}

		@AfterClass
		public static void destroy() {
			cal=null;
			System.out.println("*****destroy executed******");
		}

}
