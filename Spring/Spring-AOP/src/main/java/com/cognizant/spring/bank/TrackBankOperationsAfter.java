package com.cognizant.spring.bank;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class TrackBankOperationsAfter implements AfterReturningAdvice {
public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable{
		System.out.println("========after execution of \"" +method.getName()+"\" with \""+args.length+"\" parameters");
	}


}
