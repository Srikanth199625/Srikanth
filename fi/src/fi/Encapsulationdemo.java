package fi;

class employee{
	String name;
	private int salary;
	private int Mobilenumber;
	public void display() {
		System.out.println("Welcome");
		
	}
	
public void setsalary(int salary) {
	this.salary=salary;
}
public int getsalary() {
	return salary;
	
}
public void setmobilenumber(int Mobilenumber) {
	this.Mobilenumber=Mobilenumber;
}
public int getMobilenumber() {
	return Mobilenumber;
}
	
}

public class Encapsulationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj = new employee();
		obj.setsalary(20000);
		obj.setmobilenumber(916044043);
		System.out.println(obj.name="Srikanth");
		System.out.println(obj.getsalary());
		System.out.println(obj.getMobilenumber());
	}

}
