package exceldata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File myfile=new File("G:\\selenium\\sheet1.xlsx");
	String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(value);
	String value1 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(value1);
	
	}

}
