package jot;

public class datahiding12 {
static int i=46;
	public static void main(String[] args) {
		datahiding12 dh = new datahiding12();
		dh.method(i);
		dh.method();
		

	}
	void method(int i) 
	{
		i = 20;
		System.out.println("Value of int :" + i);
	
		System.out.println("Value of int with this keyword :" + this.i );
	}
 
	void method()
	{
		int i = 40;
		System.out.println("Value of int :" + i);
		System.out.println("Value of int with this keyword :" + this.i );
	}

}
