package com.ciq.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ciq.dao.EmployeeDao;
import com.ciq.entity.Employee;

public class EmployeeService {
	@Autowired
	public EmployeeDao employeeDao;
	
	public void save(Employee employee) {
		System.out.println("EmployeeService save Method:");
		employeeDao.save(employee);
	}
	

}
