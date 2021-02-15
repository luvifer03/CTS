final class banks{
	void bankaccount() {
		System.out.println("this is bank account method");
	}
}

// this wont work
public class finaltest extends banks{

	public static void main(String[] args) {
		
		finaltest obj= new finaltest();
		obj.bankaccount();
		
	}

}
