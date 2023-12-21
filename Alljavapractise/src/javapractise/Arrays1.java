package javapractise;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dailytemperatures = {35,42,29,43,41,42};
		int sum=0;
		
		for(int temp: dailytemperatures) {
			sum=sum+temp;
		}
		double average =(double) sum/dailytemperatures.length;
		
		System.out.println("Average Temperatures of this week is :" +average);

	}

}
