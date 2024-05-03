package com.ciq.dao;

import com.ciq.entity.Employee;

public class EmployeeDao {
	
	public void save(Employee  employee) {
		System.out.println("Employee Data Stored into DataBase:"+employee);
	}

}
