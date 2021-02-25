package com.cognizant.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	//@Bean ///without it bean wont work default name is method name
	@Bean(name="cog1")
	public BeanA getBeanA() {
		System.out.println("inside BeanA");
		BeanA bean = new BeanA();
		bean.setName("Aashish");
		return bean;
		
	}
	
	@Bean
	public BeanB getBeanB() {
		System.out.println("inside beanB");
		BeanB bean = new BeanB("Solanky");
		
		return bean;
		
	}
	
	@Bean(name="mywork", initMethod="workInit", destroyMethod="workDestroy")
	@Scope("singleton")
	public Work getWork() {
		return new Work();
		
	}
	

}
