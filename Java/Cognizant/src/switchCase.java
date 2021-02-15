import java.util.*;

public class switchCase {
	//addition method
	void add(float first, float second) {
		System.out.println("The sum is =" +(first+second));
	}
	//subtraction method
	void sub(float first,float second) {
		System.out.println("The difference is="+ (first-second));
	}
	//multiplication method
	void mul(float first,float second) {
		System.out.println("The result is =" +(first*second));
	}
	//division method
	void div(float first,float second) {
		System.out.println("The result is =" +(first/second));
	}
	
	//method for line
	void line() {
		System.out.println("============================================");
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		switchCase obj1=new switchCase();
		
		
		while(true) {
		System.out.println("Welcome to Mathematics World");
		System.out.println("Press 1 for addition \nPress 2 for subtraction \nPress 3 for multiplication \nPress 4 for division \nPress 5 to exit");
		int choice = sc.nextInt();
		if(choice==5) {
			obj1.line();
			System.out.println("Thank you for using our application");
			return;
		}
		System.out.println("Enter the first number");
		float first =sc.nextFloat();
		System.out.println("Enter the second number");
		float second= sc.nextFloat();
		
		switch(choice) {
		case 1: 
			obj1.add(first,second);
			obj1.line();
			break;
		case 2:
			obj1.sub(first,second);
			obj1.line();
			break;
		case 3:
			obj1.mul(first,second);
			break;
			
		case 4: 
			obj1.div(first,second);
			break;
		case 5:
			return;
		default:
			break;
			
		}
			
		}
	}

}
