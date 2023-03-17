package com.saggraha;

public class Palindrome {
	
	public boolean isPalindrome(String str) {
		
		int length = str.length();
		String reverse="";
		for(int i = length-1; i>=0; i=i-1)
		{
			
			reverse = reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
