package com.saggraha.binding;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private Integer empid;
	private String empName;
	private String empDept;
	private Double empSal;
	
	public void testMethod() {
		System.out.println("Employee Method Started");
		int a=10;
		System.out.println("Employee Method Ended");
	}
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal
				+ "]";
	}
	
	
}
