package testjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowser {
	static WebDriver driver;
	static String url = "http://www.google.com";
	public static void main(String[] args) throws InterruptedException 
	{
		
		jashanbrowser(url);
		driver.findElement(By.id("lst-ib")).sendKeys("jashan");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).clear();
		Thread.sleep(5000);
		closebrowser();
	
	}
	public static void jashanbrowser(String url)
	{
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Acer\\Downloads\\jar files\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	public static void closebrowser(){
		driver.close();
	}
}

