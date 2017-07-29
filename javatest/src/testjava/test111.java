package testjava;

public class test111 extends brokenlinks{
	static String url= "http://www.yahoo.com";
	public static void main(String[] args) {
		brokenlinks bl= new test111();
		bl.launchbrowser(url);

	}
@Override
public void launchbrowser(String url) {
	
	super.launchbrowser(url);
}
}
