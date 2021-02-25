package com.cognizant.spring;

public class Work {
	
	public Work() {
		System.out.println("inside work constructor");
	}
	
	public void workInit() {
		System.out.println("initializing work");
	}
	
	public void workDestroy() {
		System.out.println("Destroying work");
	}
	
	public void doWork() {
		System.out.println("Working on project");
	}
}
