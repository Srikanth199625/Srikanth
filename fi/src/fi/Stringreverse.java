package fi;
class string{
	private String a;
	private String b;
	
	public void seta(String a) {
		this.a=a;
		
	}
	public void setb(String b) {
		this.b=b;
		
	}
	public String geta() {
		return a;
		
	}
	public String getb() {
		return b;
		
	}
}

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		string obj = new string();
		obj.seta("Sun Rises in the East");
		obj.setb("");
		
		for(int i=0; i>obj.geta().length()-1; i--) {
	
			System.out.println("Reverse of the String is :" +obj.getb());
		}

	}

}
