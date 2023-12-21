package javapractise;

public class Meanof5numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {25,256,198,3336,523};
		int sum=0;
		for(int mean: numbers) {
			sum=sum+mean;
		}
		double mean1= (double) sum/3;
		System.out.println("Mean of the given numbers is :" +mean1);
	}
	


}
