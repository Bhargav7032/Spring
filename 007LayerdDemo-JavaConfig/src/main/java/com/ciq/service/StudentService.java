package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.ciq.dao.StudentDao;
import com.ciq.entity.Student;

public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
 public void save(Student student) {
	 System.out.println("StudentService save Method :");
	 studentDao.save(student);
 }
	

}
