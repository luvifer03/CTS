package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Product p1 = (Product)context.getBean("product");
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		Product p2 = (Product)context.getBean("product");
		System.out.println(p2);
		System.out.println(p2.hashCode());
		
		((ConfigurableApplicationContext)context).close();
		
	}

}