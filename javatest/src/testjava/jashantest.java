package testjava;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class jashantest extends launchBrowser {
	static String url = "http://www.facebook.com";
	public static void main(String[] args) throws InterruptedException 
	{
		launchBrowser olb = new launchBrowser();
		olb.jashanbrowser(url);
		signUp();
		selectcommand();
		closebrowser();
	}
	public static void signUp()
	{
	driver.findElement(By.id("u_0_2")).sendKeys("test");
	driver.findElement(By.id("u_0_4")).sendKeys("1234567890");
	driver.findElement(By.id("u_0_m")).click();
	
	}
	public static void selectcommand() throws InterruptedException{
		
		Select osel= new Select(driver.findElement(By.id("day")));
		osel.selectByIndex(0);
		Select osel1= new Select(driver.findElement(By.id("month")));
		osel1.selectByValue("3");
		Select osel2= new Select(driver.findElement(By.id("year")));
		osel2.selectByVisibleText("2017");
		driver.findElement(By.id("u_0_i")).click();
		Thread.sleep(5000);
		
	}
}
