import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {

	public static void main(String[] a) throws FileNotFoundException, IOException {
		readexcel();

	}

	public static void readexcel() throws IOException {
		File file = new File("C:\\Users\\Acer\\Desktop\\jashan.xls");
		if(!file.exists()){
			file.createNewFile();
		}
		FileReader fr = null;
		fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String st;
		while ((st = br.readLine()) != null) 
		{
			System.out.println(st);
		}

	}
}
