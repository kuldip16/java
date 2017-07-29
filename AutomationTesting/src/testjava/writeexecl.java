package testjava; 
import java.io.BufferedReader;  
 import java.io.BufferedWriter;  
 import java.io.File;  
 import java.io.FileNotFoundException;  
 import java.io.FileReader;  
 import java.io.FileWriter;  
 import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;  
 public class writeexecl {  
	File file = new File("C:\\Users\\Acer\\Desktop\\jashan.xls");   
	static WebDriver driver;
	static List<String> finalUrls = new ArrayList();
   public static void main(String[] a) throws FileNotFoundException, IOException {  
	   writeexecl wr= new writeexecl();
	   wr.launchbrowser();
	   wr.getlinks();
	   wr.writeexcel();
	   wr.readexcel();
   } 
   public void writeexcel(){
	   try {  
	       
	       // if file doesn't exists, then create it  
	       if (!file.exists()) {  
	         file.createNewFile();  
	       }  
	       // Write text on txt file.  
	       FileWriter fw = new FileWriter(file, true);  
	       
	       String[] stockArr = new String[finalUrls.size()];
		   stockArr = finalUrls.toArray(stockArr);
			
			fw.close();
	     } 
	   catch (IOException e) 
	   {  
	       e.printStackTrace();  
	     }  
   }
   
   public void readexcel ()
   {
	   // Read text from file.    
	     FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	     BufferedReader br = new BufferedReader(fr);  
	     String st;  
	     try {
			while ((st = br.readLine()) != null) {  
			   System.out.println(st);  
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
   }
   public void launchbrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   public void getlinks()
   {
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	for (WebElement ele : list)
	{
	if(ele.getAttribute("href") != null)
	   { 
	   String test = ele.getAttribute("href").trim();
	   finalUrls.add(test);
	   }
	
     } 
 } 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 