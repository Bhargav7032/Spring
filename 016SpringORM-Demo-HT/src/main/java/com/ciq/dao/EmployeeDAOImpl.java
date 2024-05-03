package com.ciq.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.dto.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Employee employee) {
		hibernateTemplate.save(employee);
		
	}

	
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
	}

	
	public void deleteById(Integer eid) {
		Employee employee  = new Employee();
		employee.setEid(eid);
		hibernateTemplate.delete(employee);
	}

	
	public Employee findById(Integer eid) {
		return hibernateTemplate.get(Employee.class, eid);
	}

	
	public List<Employee> findAll() {
		return hibernateTemplate.loadAll(Employee.class);
	}

}
