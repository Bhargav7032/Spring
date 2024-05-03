package com.ciq.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ciq.controller.StudentController;
import com.ciq.dao.StudentDao;
import com.ciq.service.StudentService;

@Configuration
public class SpringConfig {
	
	
	@Bean
	public StudentController studentController() {
		return new StudentController();
	}
	
	@Bean
	public StudentService studentService() {
		return new StudentService();
	}
	
	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
	}


