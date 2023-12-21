package fi;

public class Greatestofthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 25;
		int num2=33;
		int num3=45;
		
		if(num1>num2)
			if(num1>num3) {
				System.out.println("First Number is the Bigger Number among all the numbers");
			}
		if(num2>num1)
			if(num2>num3) {
				System.out.println("Second Number is the Bigger Number among all the numbers");
			}
		if(num3>num1)
			if(num3>num2) {
				System.out.println("Third Number is the Bigger Number among all the numbers");
			}

	}

}
