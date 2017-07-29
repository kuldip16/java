package jot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotplus {
	WebDriver driver;
	String url = "http://www.google.com/";
	public static void main(String[] args)
	{
		screenshotplus sp = new screenshotplus();
		sp.lanchbrowser();
		sp.screenshot();
		
		
	}
	public void screenshot(){
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File destfile = new File("c:\\tmp\\screenshot.png");
		    try 
		{
			FileUtils.copyFile(src,destfile );
		} 
		    catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public void lanchbrowser()
	{
		
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
				

	}


