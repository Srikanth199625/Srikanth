package firstjava;

public class obj2 {
	int i =0, j=0;
	void function1() {
		int i=0;
		i=25;
		j=35;
		System.out.println("Inside function1()");
		System.out.println(i);
		System.out.println(j);
		System.out.println("end of void function1()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj2 O = new obj2();
		O.function1();
		System.out.println(O.i);
		System.out.println(O.j);

	}

}
