package fi;
class person{
	private String name;
	private int age;
	
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
		
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	
	
}
public class Encapsulatio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj = new person();
		obj.setname("Srikanth");
		obj.setage(27);
		System.out.println(obj.getname());
		System.out.println(obj.getage());
		if(obj.getage()>18) {
			System.out.println("Srikanth is Eligible for Votercard");
		}
		else
		{
			System.out.println("Srikanth is Not Eligible for Votercard");
		}

	}

}
