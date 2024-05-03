package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.entity.Employee;
import com.ciq.service.EmployeeService;
@Controller("employeeController")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public void save(Employee employee) {
		System.out.println("Employee Controller Save Method");
		employeeService.save(employee);
	}

}