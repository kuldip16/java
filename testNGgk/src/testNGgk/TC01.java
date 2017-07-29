package testNGgk;


import org.testng.annotations.Test;

public class TC01 extends TC02 {
	
	@Test
	public void test1() {
		System.out.println(" method Test 1");
	}

	@Test
	public void test2() {
		System.out.println(" method Test 2");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("method Test 3");
	}

	@Test(enabled = false)
	public void test4() {
		System.out.println(" methodTest 4");
	}

}
