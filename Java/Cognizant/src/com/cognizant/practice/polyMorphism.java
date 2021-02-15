package com.cognizant.practice;
//trying multiple inheritance and polymorphism
class dog {
	void sound1() {
		System.out.println("Dog sound from dog class");
	}
}

class cat extends dog{
	void sound() {
		System.out.println("Cat Sound from cat class");
	}
}

class bird extends cat {
	void sound() {
		System.out.println("Bird Sound from bird class");
	}
}

public class polyMorphism extends bird{

	public static void main(String[] args) {
		polyMorphism obj1 = new polyMorphism();
		obj1.sound();
		
		bird bird =new bird();
		bird.sound();
		
		cat cat= new cat();
		cat.sound();// same method name requires object of that class;
		
		obj1.sound1(); // different name method
		
		
		

	}

}
