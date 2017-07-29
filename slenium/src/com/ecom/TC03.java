package com.ecom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC03 {
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before Method");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("Before Test");
	}
	@AfterClass
	public void Afterclass(){
		System.out.println("After class");
	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void Aftersuite(){
		System.out.println("After suite");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("After Method");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("After Test");
	}
	
	@Test
	public void testone(){
		System.out.println("first Test");
	}
	@Test
	public void testtwo(){
		System.out.println("Second Test");
	}
}
