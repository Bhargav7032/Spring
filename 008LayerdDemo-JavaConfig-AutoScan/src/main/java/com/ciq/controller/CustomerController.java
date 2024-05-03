package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.entity.Customer;
import com.ciq.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public void save(Customer customer) {
		System.out.println("CustomerController save Db");
		customerService.save(customer);
	}
	
	
}
