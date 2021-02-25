class fatherSuperKeyWord{
	protected int a=3;
}

class childSuper extends fatherSuperKeyWord{
	protected int a =6;
	void superkey()
	{
		System.out.println("Inside first child class");
	}
}

public class SuperKeyWord extends childSuper{
	
	int a=4;
	void father()
	{
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		SuperKeyWord sp = new SuperKeyWord();
		sp.father();
		

	}

}
