package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmployeeController;
import com.ciq.dto.Employee;

public class UpdateTest {
	
public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController employeeController =  (EmployeeController) applicationContext.getBean("employeeController");
		
		employeeController.update(new Employee(103, "BhargavRam", 35000.00));
		
		System.out.println("Updated Successfully");
	}


}
