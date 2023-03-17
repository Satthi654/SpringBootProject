package com.saggraha;

public class Testing {
		public static void main(String[] args) {
			Student std = Student.handleStudent(101, "Sathish", 100.00);
			
			System.out.println(std);
			
			Student student = Student.handleStudent(102, "Test", 7.0);
			System.out.println(student);
		}
}
