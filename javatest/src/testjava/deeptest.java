package testjava;

public class deeptest extends kuldeepclasstest {

	public static void main(String[] args) {
		kuldeepclasstest odt= new deeptest();
		odt.mobile();
		odt.test();
		
		

	}
	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		//System.out.println("override");
		super.mobile();
		System.out.println("??");
	}
	@Override
	public void dekstop() {
		// TODO Auto-generated method stub
		System.out.println("override");
	}
	public void testmobile(){
		System.out.println("method name is testmobile and class name is deeptest");
	}
	public void testdekstop(){
		System.out.println("method name is testdesktop and class name is deeptest");
	}
	
	
}
