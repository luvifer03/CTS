
 class testing1{
	 void display1() {
		 System.out.println("This is inside class testing1- method display1()");
	 }
	 
	 static void display2() {
		 System.out.println("THis is static method display2() inside class testing1");
	 }
 }

 
 class Practice1 {
	  int x =10;
	  static  final int y=10;
	  static int z=5;
	  
	  void display() {
		  System.out.println("This is display method");
	  }
	  //static method and method overloading
	  static void display(int n) {
		  System.out.println("This is static display method");
	  }
	public static void main(String[] args) {  
		
		Practice1 obj1 =new Practice1();
		Practice1 obj2 =new Practice1();
		System.out.println("The value of x before modifying="+obj1.x);
		obj1.x=40;
		obj2.x=30;
		
		
		
		System.out.println("The value of x after modifying= " +obj1.x);//40
		System.out.println("The value of y final variable="+y);//10
		System.out.println("The value of x with another object="+obj2.x);//30
		System.out.println(z);//static variable can be called without using a object
		
		obj1.display();
		display(4);
		
		testing1 test1=new testing1();//testing to access another class
		test1.display1();
		testing1.display2();
		
		Welcome wel=new Welcome();// testing to access from another file
		System.out.println(wel.a);
	
		
		
		
		

	}

}
