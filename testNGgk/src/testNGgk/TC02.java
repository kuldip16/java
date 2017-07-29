package testNGgk;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TC02
{
	@BeforeTest()
	public void beforet() {
		System.out.println("Before test");
	}
	@AfterTest()
	public void aftert() {
		System.out.println("After test");
	}
	@AfterSuite ()
	public void afters() {
		System.out.println("After suite");
	}
	
	@BeforeSuite ()
	public void befores() {
		System.out.println("Before suite");
	}
	@BeforeMethod()
	public void beforem() {
		System.out.println("before method");
	}

	@AfterMethod()
	public void afterm() {
		System.out.println("after method");
	}
	@BeforeClass()
	public void beforec() {
		System.out.println("before class");
	}
	@AfterClass()
	public void afterc() {
		System.out.println("after class");
	}

	
}
