package com.cognizant.practice;
import java.util.Scanner;

class parentFibonacci{
	public void fibonacciMethod() {
		{    
			 @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the number you want in series more than 2");
			 int count= sc.nextInt();
			 int n1=0,n2=1,n3,i;   
			 System.out.print(n1+" "+n2); 
			    
			 for(i=2;i<count;++i)    
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }   
			 System.out.println("============================================");
			  
			}
	}

}
