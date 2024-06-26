package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class UpdateTest {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.update(new Employee(108,"bhragav",35000.00));
		
		System.out.println("Updated Successfully");
	}

}
