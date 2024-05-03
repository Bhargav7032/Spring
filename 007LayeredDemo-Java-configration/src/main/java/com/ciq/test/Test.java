package com.ciq.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.Springconfig;
import com.ciq.controller.Employeecontroller;
import com.ciq.entity.Employee;


public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Springconfig.class);
		Employeecontroller employeecontroller=(Employeecontroller) applicationContext.getBean("employeecontroller");
		employeecontroller.save(new Employee(102, "Bhargav", 20000.00));
	}

}
