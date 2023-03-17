package com.saggraha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saggraha.binding.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private Employee emp;
	public Employee getEmployeeData() {
		System.out.println("EmployeeService Method Started");
		Employee employee=new Employee();
		employee.setEmpid(1001);
		employee.setEmpName("Sathishkumar D S");
		employee.setEmpDept("IT");
		employee.setEmpSal(70000.00);
		System.out.println("*************");
		emp.testMethod();
		System.out.println("EmployeeService Method Ended");
		return employee;
	}
}
