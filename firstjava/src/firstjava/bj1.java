package firstjava;

public class bj1 {
	int i=0, j=0;
	void function1() {
		i=i+1;
		j=j+1;
		//function2();
		System.out.println("Inside function1()");
	}
		void function2() {
			System.out.println(i);
			System.out.println(j);
			System.out.println("Inside function2()");
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bj1 O = new bj1();
		O.function1();
		O.j=115;
		System.out.println("End of Main Method");

	}

}
