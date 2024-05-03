package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.Service.EmployeeService;
import com.ciq.entity.Employee;

public class Employeecontroller {
	
	@Autowired
	public EmployeeService employeeService;

	public void save (Employee employee) {
		System.out.println("Employeecontroller save Method");
		employeeService.save(employee);
	}
}
