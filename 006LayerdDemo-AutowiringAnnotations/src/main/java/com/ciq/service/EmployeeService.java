package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDAO;
import com.ciq.entity.Employee;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	

	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}



	public void save(Employee employee) {
		System.out.println("Employee Service Save method: ");
		employeeDAO.save(employee);
	}

}