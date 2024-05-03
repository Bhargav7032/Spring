package com.ciq.dao;

import org.springframework.stereotype.Repository;

import com.ciq.entity.Customer;

@Repository
public class CustomerImpl  implements CustomerDao {

	public void save(Customer customer) {
		System.out.println("Customer Stored into Db:"+customer);
		
	}

}
