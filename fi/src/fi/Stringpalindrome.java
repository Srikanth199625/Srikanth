package fi;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "madam";
		String f="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			f=f+ s.charAt(i);
			//System.out.println(f);
			//System.out.println(s.charAt(i));
		}
		System.out.println("The value of f is: " +f);
		
		if(s==f) {
			System.out.println("The Given String is palindrome");
		}
		else {
			System.out.println("The Given String is not palindrome");
		}

	}

}
