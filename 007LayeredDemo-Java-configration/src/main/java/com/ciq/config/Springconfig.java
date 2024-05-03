package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ciq.Service.EmployeeService;
import com.ciq.controller.Employeecontroller;
import com.ciq.dao.EmployeeDao;

@Configuration
public class Springconfig {
	
	@Bean
	public Employeecontroller employeecontroller() {
		return new Employeecontroller();
		
	}
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
	@Bean
	public  EmployeeDao employeeDao() {
		return new EmployeeDao();
		
	
}

}
