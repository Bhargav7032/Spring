package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	
	public void save(Employee employee) {
		System.out.println("Employee service Save Method:");
		employeeDAO.save(employee);
	}

	
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	
	public void deleteById(Integer eid) {
		employeeDAO.deleteById(eid);
	}

	
	public Employee findById(Integer eid) {
		return employeeDAO.findById(eid);
	}

	
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
