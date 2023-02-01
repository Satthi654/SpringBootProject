package com.saggraha.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.saggraha.binding.Employee;

public class EmployeeController extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
				System.out.println("***************************");
				
				String empid=request.getParameter("eid");
				String empname=request.getParameter("ename");
				String empsal=request.getParameter("esal");
				
				Integer eid = Integer.parseInt(empid);
				Double esal = Double.parseDouble(empsal);
				
				Employee employee=new Employee();
				employee.setEid(eid);
				employee.setEname(empname);
				employee.setEsal(esal);
				
				System.out.println(employee);
				
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				writer.println("<html><body bgcolor='yellow'><h2>");
				ObjectMapper mapper=new ObjectMapper();
				String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
				writer.println(json);
				
				writer.println("</h2></body></html>");
				
				
	}

}
