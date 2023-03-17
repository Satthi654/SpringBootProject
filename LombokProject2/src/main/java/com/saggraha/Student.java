package com.saggraha;

import lombok.ToString;

@ToString
public class Student {
	private Integer studentId;
	private String studentName;
	private  Double studentFee;
	
	private Student(Integer studentId, String studentName, Double studentFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
	}	
	
	public static Student std;
	public static Student handleStudent(Integer sid, String sname,Double sfee) {
		if(std==null)
		{
			return std=new Student(sid,sname,sfee);
		}
		else
		{
			return std;
		}
	}
	
}
