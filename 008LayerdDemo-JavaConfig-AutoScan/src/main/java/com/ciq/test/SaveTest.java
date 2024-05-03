package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.CustomerConfig;
import com.ciq.controller.CustomerController;

import com.ciq.entity.Customer;

public class SaveTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerController customerController=(CustomerController) applicationContext.getBean("customerController");
		customerController.save(new Customer(103, "Bhargav", "Car") );

	}

}
