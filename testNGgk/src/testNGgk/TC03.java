package testNGgk;

import org.testng.annotations.Test;

public class TC03 extends TC02{
	@Test(priority = 1)
	public void test5() {
		System.out.println(" method Test 5");
	}

	@Test(priority = 1)
	public void test6() {
		System.out.println(" method Test 6");
	}

}
