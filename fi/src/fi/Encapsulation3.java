package fi;
class Temperature{
	private double celsius;
	
	public void setcelsius(double celsius) {
		this.celsius= celsius;
	}
	
	public double getcelsius() {
		return celsius;
	}
	
	public double getFahrenheit() {
		return (celsius*9)/32;
	}
	
}
public class Encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature obj = new Temperature();
		obj.setcelsius(45);
		System.out.println("Initial Temperature is :" +obj.getcelsius());
		System.out.println("Fahrenheit Temperature is :" +obj.getFahrenheit());
		if(obj.getFahrenheit()>20) {
			System.out.println("The is Temperature is More Hot Than Yesterday");
		}
		else {
			 System.out.println("The Temperature is Moderate For Today");
		}

	}

}
