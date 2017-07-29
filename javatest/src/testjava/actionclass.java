package testjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class actionclass {

	public static void main(String[] args) {
		WebDriver deep = null;
		WebElement element = deep.findElement(By.id("nav_buero"));
		Actions oact = new Actions(deep);
        oact.moveToElement(element).build().perform();
        
	}

}
