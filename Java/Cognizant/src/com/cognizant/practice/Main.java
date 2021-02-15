package com.cognizant.practice;

import java.util.Scanner;

public class Main extends parentFibonacci {

	public static void main(String[] args) {

		Main obj = new Main();
		evenNumber eN = new evenNumber();
		oddNumber oN = new oddNumber();
		swapNumbers sN = new swapNumbers();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Welcome to XYZ World");
			System.out.println("Press the number to execute the operation");
			System.out.println(
					"1. Check a Number is even or not \n2. Check a Number is odd or not \n3. Fibonacci Series\n4. Swap 2 Numbers \n5. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				eN.even();
				break;
			case 2:
				System.out.println("Enter the number to check");
				int odd = sc.nextInt();
				oN.odd(odd);
				break;
			case 3:
				obj.fibonacciMethod();
				break;
			case 4:
				System.out.println("Enter the First Number:");
				float first = sc.nextFloat();
				System.out.println("Enter the Second Number:");
				float second = sc.nextFloat();
				sN.swap(first, second);
				System.out.println("============================================");
				break;
			case 5:
				System.out.println("GoodBye, Have a Nice Day Ahead");
				System.out.println("============================================");
				return;

			default:
				System.out.println("Invalid Choice");

			}
		}
	}

}
