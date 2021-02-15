package com.cognizant.practice;


public class swapNumbers {
	void swap(float first,float second) {
		
		System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        
        float temporary = first;

        
        first = second;

        
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
	}

}
