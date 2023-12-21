package fi;

class Employee{
	private String name;
	private int id;
	private double salary;
	
	
	public void setstring(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
	public String getname() {
		return name;
	}
	
	public int getid() {
		return id;
		
	}
	
	public double getsalary() {
		return salary;
	}
	
}

public class Encapsulatin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj = new Employee();
		obj.setstring("Srikanth Buggala");
		obj.setid(0);
		obj.setsalary(50000);
		
		System.out.println("Employee Name is :" +obj.getname());
		System.out.println("Employee Id is :" +obj.getid());
		System.out.println("Employee Salary is :" +obj.getsalary());
		
		if(obj.getid()>0 && obj.getsalary()>0) {
			System.out.println("Salary and id was not negative numbers");
		}
		else {
			System.out.println("Salary and id was negative numbers");
		}

	}

}
