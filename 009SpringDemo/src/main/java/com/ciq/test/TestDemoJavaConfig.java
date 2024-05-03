package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfig;
import com.ciq.service.CardService;
public class TestDemoJavaConfig {
	public static void main(String[] args) {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
	CardService card=(CardService) applicationContext.getBean("CardService");
    card.getCardDetails();

	}
}
