package com.ciq.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main (String []args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
	EmployeeBean employeeBean=(EmployeeBean) applicationContext.getBean("EmployeeBean");
	employeeBean.Display();
}
	
}
