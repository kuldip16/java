package com.ecom;
import org.openqa.selenium.Alert;  
 import org.openqa.selenium.By;  
 import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.firefox.FirefoxDriver;  
 public class pop {  
   public static void main(String[] a) throws InterruptedException {  
     // Initialize Web driver   
     WebDriver driver = new FirefoxDriver();  
     //Maximize browser window   
     driver.manage().window().maximize();  
     //Go to Page   
     driver.get("file:///E:/Javascript%20Popup.html");  
      //===========Alerts ======    
     //click on button  
     driver.findElement(By.xpath("html/body/fieldset[1]/button")).click();  
     //handle to the open alert.  
     Alert alert = driver.switchTo().alert();  
     //get the text which is present on th Alert.  
     System.out.println(alert.getText());  
     Thread.sleep(3000);  
     //Click on OK button.  
     alert.accept();  
     //===========Confirmation Popups======    
     //click on button  
     driver.findElement(By.xpath("html/body/fieldset[2]/button")).click();  
     //handle to the open confirmation popup.  
     Alert Confirm = driver.switchTo().alert();  
     Thread.sleep(3000);  
     //click on Cancel button.  
     Confirm.dismiss();  
     //===========Prompt Popups======  
     //click on button  
     driver.findElement(By.xpath("html/body/fieldset[3]/button")).click();  
     //handle to the open prompt popup.  
     Alert Prompt = driver.switchTo().alert();  
     //pass the text to the prompt popup  
     Prompt.sendKeys("Prompt Box");  
     Thread.sleep(3000);  
     //Click on OK button.  
     Prompt.accept();  
     //close browser  
     driver.quit();  
   }  
 }  
