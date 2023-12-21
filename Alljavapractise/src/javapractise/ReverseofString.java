package javapractise;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Today is Sunny Day";
		String rname="";
		
		for(int i=0; i>name.length()-1; i--) {
			rname=rname+i;
			System.out.println("Reverse of the string is :" +rname);
		}

	}

}
