package com.ciq.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ciq.controller.StudentController;
import com.ciq.controller.config.SpringConfig;
import com.ciq.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
	
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringConfig.class);
		StudentController studentController=(StudentController) applicationContext.getBean("studentController");
		studentController.save(new Student(101, "BhargavRam", 22000.00, "Skml"));
		
		
	}

}
