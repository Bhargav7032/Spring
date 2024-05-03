package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.CustomerDao;
import com.ciq.entity.Customer;

@Service
public class CustomerServiceImpl  implements CustomerService{
	@Autowired
	private CustomerDao customerDao;

	public void save(Customer customer) {
		System.out.println("CustomerService save method :");
		customerDao.save(customer);
		
	}

}
