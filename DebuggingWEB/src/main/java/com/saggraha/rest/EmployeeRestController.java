package com.saggraha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saggraha.binding.Employee;
import com.saggraha.service.EmployeeService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/getEmployee")
	public Employee getEmployeeServiceData() {
		System.out.println("EmployeeRestController Method Started");
		employeeService.getEmployeeData();
		System.out.println("EmployeeRestController Method Ended");
		return employeeService.getEmployeeData();
	}
}
