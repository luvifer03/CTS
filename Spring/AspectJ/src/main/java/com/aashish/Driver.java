package com.aashish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aashish.spring.NumsOperations;

public class Driver {
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		NumsOperations nums = (NumsOperations) context.getBean("nums");
		
		nums.add(50, 20);
		System.out.println("------------------");
		nums.sub(50, 20);
		
	}

}
