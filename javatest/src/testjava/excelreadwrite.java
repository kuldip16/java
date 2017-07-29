package testjava; 
import java.io.BufferedReader;  
 import java.io.BufferedWriter;  
 import java.io.File;  
 import java.io.FileNotFoundException;  
 import java.io.FileReader;  
 import java.io.FileWriter;  
 import java.io.IOException;  
 public class excelreadwrite {  
	File file = new File("C:\\Users\\Acer\\Desktop\\jashan.xls");   
   public static void main(String[] a) throws FileNotFoundException, IOException {  
	   excelreadwrite wr= new excelreadwrite();
	   wr.writeexcel();
	   wr.readexcel();
    
   } 
   public void writeexcel(){
	   try {  
	       
	       // if file doesnt exists, then create it  
	       if (!file.exists()) {  
	         file.createNewFile();  
	       }  
	       // Write text on txt file.  
	       FileWriter fw = new FileWriter(file, true);  
	       BufferedWriter bw = new BufferedWriter(fw);  
	       String[] country = "India#China#United States#joti#kuldeep#amit#ashwani".split("#");
			int rt = country.length;
			System.out.println("length of input string " + rt);
			for (int i = 0; i < rt; i++)
			{
			bw.write(country[i]);
			bw.newLine();
			}
	       bw.close();  
	     } catch (IOException e) {  
	       e.printStackTrace();  
	     }  
   }
   
   public void readexcel () {
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
 } 