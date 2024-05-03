package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.ciq.entity.Student;
import com.ciq.service.StudentService;


public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	public void save(Student student) {
		System.out.println("StudentController save Method:");
		studentService.save(student);
		
	}
}
