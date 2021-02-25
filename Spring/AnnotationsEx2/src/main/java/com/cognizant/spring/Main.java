package com.cognizant.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	BeanA bean1 = context.getBean(BeanA.class);
	System.out.println(bean1);
	
	//BeanA bean2 = (BeanA) context.getBean("getBeanA");//wont work cuz now we gave another bean name to it cog1
	//System.out.println(bean2);
	BeanA bean5 = (BeanA) context.getBean("cog1");
	System.out.println(bean5);
	
	BeanB bean3 = context.getBean(BeanB.class);
	System.out.println(bean3);
	
	BeanB bean4 = (BeanB) context.getBean("getBeanB");
	System.out.println(bean4);
	
	Work work = (Work) context.getBean("mywork");
	System.out.println(work);
	System.out.println(work.hashCode());
	
	
	}
}
