package com.ciq.dao;


import org.springframework.stereotype.Repository;

import com.ciq.entity.Employee;
@Repository
public class EmployeeDAO {
	

	public void save(Employee employee) {
		System.out.println("Employee DAO Save method : Employee Saved into DB "+employee);
	}

}