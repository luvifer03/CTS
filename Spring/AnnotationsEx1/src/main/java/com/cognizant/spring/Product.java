package com.cognizant.spring;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope(scopeName= "prototype")
public class Product {
	//spring expression language(SEL)
	
	//@Value("101")
	//@Value("#{101+1}")//for providing expression
	@Value("#{T(java.lang.Integer).MAX_VALUE}")//T incidates the generics type
	private int productId;
	
	//@Value("Mobile")
	//@Value("#{'Mobile'.toUpperCase()}")
	@Value("#{new java.lang.String('Mixer')}")
	private String productName;
	
	private List<String> models;
	
	public Product() {
		System.out.println("---inside constructor");
	}
	
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", models=" + models + "]";
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("----user defined init method");
		
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("User defined destructor");
	}

	
	

}
