class fatherSuperKeyWord{
	protected int a=3;
}



public class SuperKeyWord extends fatherSuperKeyWord{
	
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
