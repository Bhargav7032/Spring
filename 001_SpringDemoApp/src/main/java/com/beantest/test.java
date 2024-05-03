package com.beantest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.HelloWorldbean;

public class test {

	public static void main(String[] args) {
		
//	ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
//	HelloWorldbean helloWorldbean=(HelloWorldbean) ac.getBean("HelloWorldbean");
//	helloWorldbean.SayHelloworld("BhargavRam");
	
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
	
	HelloWorldbean helloWorldbean=(HelloWorldbean) applicationContext.getBean("HelloWorldbean");
	
	helloWorldbean.Sayhai("Jai Balayyaaaa");
		
		
	}

}
