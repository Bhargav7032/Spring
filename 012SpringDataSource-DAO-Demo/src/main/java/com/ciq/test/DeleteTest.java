package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class DeleteTest {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employeeController = (EmployeeController) applicationContext.getBean("employeeController");
		
      employeeController.deleteById(101);
		
		System.out.println("Deleted Successfully");
	
	}

}
