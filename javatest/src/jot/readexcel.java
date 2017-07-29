package jot;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcel {
public static void main(String[] args) throws BiffException, IOException 
	
	{
	File file = new File("C:\\Users\\Acer\\Desktop\\jashan.xls");
	Workbook owb= Workbook.getWorkbook(file);
	Sheet sht = owb.getSheet(0);
	int rows = sht.getRows();
	int clmns = sht.getColumns();
	String input[][] = new String [rows][clmns];
	for(int i = 0;i<rows ;i++)
	{
		for(int j = 0; j<clmns ;j++)
		{
			Cell cell = sht.getCell(j,i);
			input[i][j] = cell.getContents();
					System.out.println(input[i][j]);
		}
		
	}
	
	}
}
