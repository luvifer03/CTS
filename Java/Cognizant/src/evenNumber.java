import java.util.*;

public class evenNumber {

	public static void main(String[] args) {
		
		evenNumber obj = new evenNumber();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or not:  ");
		int num = sc.nextInt();
		
		obj.even(num);
		
		
		

	}

	private void even(int num) {
		// TODO Auto-generated method stub
		if(num%2 == 0) {
			System.out.println(num+ " is a even number");
		}
		else {
			System.out.println(num+ " is not a even number");
		}
		
	}

}
