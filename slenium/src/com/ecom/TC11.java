package com.ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.win32.WinBase.SYSTEMTIME;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;;

public class TC11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String Url = "https://www.facebook.com/";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Acer\\Downloads\\Compressed\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		System.out.println("launch browser");
//		driver.findElement(By.xpath("//input [@id='email']")).sendKeys(System.currentTimeMillis()+"@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input [@id='pass']")).sendKeys("kuldeep");
//		driver.findElement(By.id("u_0_q")).click();
		driver.findElement(By.id("u_0_1")).sendKeys("sumeet");
		driver.findElement(By.id("u_0_1")).sendKeys(Keys.TAB);
		driver.findElement(By.id("u_0_3")).sendKeys("goyal");
		driver.findElement(By.id("u_0_6")).sendKeys("9780223223");
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
		//driver.findElement(By.xpath("//input[@id='u_0_g']")).click();
		WebElement t = driver.findElement(By.xpath("//input[@id='u_0_g']"));
		if(t.isSelected()){
			System.out.println("male checkbox is selected going to select the female checkbox");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).click();
		}
		else
		{
		System.out.println("no check box is selected and going to select the male checkbox");	
		driver.findElement(By.xpath("//input[@id='u_0_h']")).click();
		}
		driver.findElement(By.id("u_0_l")).click();
		System.out.println("checkbox swappppp");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
	
		