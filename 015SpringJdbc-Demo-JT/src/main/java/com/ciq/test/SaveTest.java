package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfiq;
import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class SaveTest {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiq.class);
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.save(new Employee(103,"revi",30000.00));
	}

}
