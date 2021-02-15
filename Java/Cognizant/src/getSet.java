class parentGetSet{
	private String name="Aashish";
	//getter
	public String getname() {
		return name;
	}
	//setter
	public void setname(String f_name) {
		this.name=f_name;
	}
	
}
public class getSet extends parentGetSet {
public static void main(String[] args) {
	getSet obj1 = new getSet();
	//System.out.println(obj1.name);//wont work because it is private
	System.out.println(obj1.getname());
	obj1.setname("Solanky");
	System.out.println(obj1.getname());
	
}

}
