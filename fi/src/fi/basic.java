package fi;

public class basic {
	int a=10;
	String s= "Srikanth";
	double d=23.1;
	void method1() {
		System.out.println("Method 1 is Called");
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obj.method1();
		
		//System.out.println(obj.a);
		//System.out.println(obj.s);
		//System.out.println(obj.d);	
		add(10,20);
		substraction(5000,20000);
	}

	public static void substraction(int i, int j) {
		// TODO Auto-generated method stub
		int h=i-j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(h);
	}

	public static void add(int i, int j) {
		// TODO Auto-generated method stub
		
		int m= i+j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(m);
	}
 void method2() {
	 basic obj=new basic();
	 int x=obj.a;
	 double y=obj.d;
	 int a=obj(x+x);
 }

private int obj(int a) {
	// TODO Auto-generated method stub
	return a;
}

}
