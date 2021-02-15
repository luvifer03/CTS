package com.cognizant.practice;
import java.util.Scanner;

public class evenNumber {
void even() {
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int num = sc.nextInt();
	
	if(num%2 == 0) {
		System.out.println(num+ " is a even number");
		System.out.println("============================================");
	}
	else {
		System.out.println(num+ " is not a even number");
		System.out.println("============================================");
	}
}
}
