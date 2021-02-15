import java.util.Scanner;  // Import the Scanner class

class Placement {
  public static void main(String[] args) {
    Scanner myNumber = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter no of placements in cse:");

    int cse = myNumber.nextInt();  // Read user input
    
    System.out.println("Enter no of placements in ece:");

    int ece = myNumber.nextInt();  // Read user input
    
    System.out.println("Enter no of placements in mech:");

    int mech = myNumber.nextInt();  // Read user input
    
    if(cse>ece) {
    	if(cse>mech) {
    		System.out.println("CSE");
    	}
    }
    if(ece>cse) {
    	if(ece>mech) {
    		System.out.println("ECE");
    	}
    }
    else {
    	System.out.println("MECH");
    }
    if(cse<0 ||ece<0 ||mech <0) {
    	System.out.println("Invalid Input");
    	
    }
    
  }
}