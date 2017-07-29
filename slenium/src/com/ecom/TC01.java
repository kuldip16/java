package com.ecom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	WebDriver driver;
    String Url = "https://www.facebook.com/";
	@BeforeMethod
	public void openbrowser()
	{
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Downloads\\Compressed\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		System.out.println("launch browser");
	}

	@AfterMethod
	public void closebrowser() 
	{
		driver.quit();
		System.out.println("close the browser");
	}
	@Test
	public void fblogin() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input [@id='email']")).sendKeys(System.currentTimeMillis()+"@gmail.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ishan.mittal@webvirtue.com");
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("moebel123");
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ishan')]")).click();
		driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("hello Ishan ,this is just a test message");
		WebElement oele = driver.findElement(By.xpath("//button[@class='_1mf7 _4jy0 _4jy3 _4jy1 _51sy selected _42ft']"));
		oele.click();	
	}
	@Test(enabled=false)
    public void signup() throws InterruptedException{
		driver.findElement(By.id("u_0_1")).sendKeys("sumeet");
		driver.findElement(By.id("u_0_1")).sendKeys(Keys.TAB);
		driver.findElement(By.id("u_0_3")).sendKeys("goyal");
		driver.findElement(By.id("u_0_6")).sendKeys("9999999999");
		driver.findElement(By.id("u_0_d")).sendKeys("kuldeep16");
		WebElement oele = driver.findElement(By.id("day"));
		Select osel = new Select(oele);
		osel.selectByIndex(8);
		WebElement oele1 = driver.findElement(By.id("month"));
		Select osel1 = new Select(oele1);
		osel1.selectByVisibleText("Sept");;
		WebElement oele2 = driver.findElement(By.id("year"));
		Select osel2 = new Select(oele2);
		osel2.selectByVisibleText("1987");
		driver.findElement(By.xpath("//input[@id='u_0_g']")).click();
		WebElement t = driver.findElement(By.xpath("//input[@id='u_0_g']"));
		if(t.isDisplayed()){
			System.out.println("male checkbox is selected going to check it to female checkbox");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).click();
		}
		else
		{
		System.out.println("female check box is selected and going to check it to male checkbox");	
		driver.findElement(By.xpath("//input[@id='u_0_g']")).click();
		}
		driver.findElement(By.id("u_0_l")).click();
		System.out.println("checkbox swap");
		
		Thread.sleep(5000);
		
	}
}
	
		
		
		
		
		
		
		
