package exceldata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Printrowcolumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		File myfile=new File("G:\\selenium\\sheet0.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
//for loop for rows
		for(int i=0;i<=1;i++)
		{
			String myrow = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(myrow+ " ");
		}
		System.out.println();
		
		
		//for row
		for(int i=0;i<=3;i++)
		{
			String mycell = mysheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(mycell+" ");
		}
		System.out.println();
		}
	
	
	
	
	
	
	}


