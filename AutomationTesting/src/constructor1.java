
public class constructor1 
{
public void  constructor1(int i){
	System.out.println("paramet same class name and method");
}

public void  constructor1()
{
	System.out.println("default same class name and method");
}
	public static void main(String[] args) {
		constructor1 ct = new constructor1();
		ct.constructor1(5);
		ct.constructor1();
		
		

	}

}
