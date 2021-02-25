package com.cognizant.spring.bank;

import java.lang.reflect.Method;


import org.springframework.aop.MethodBeforeAdvice;

public class TrackBankOperations implements MethodBeforeAdvice{
	
	public void before(Method method, Object[] args, Object target) throws Throwable{
		System.out.println("======before execution of \""+method.getName()+"\" with " +args.length+ "\"parameters by  "+target.getClass()+" instance");
		
	}
	
	
}
