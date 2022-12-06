package exceldata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//how read sanket and find datatype
File myfile=new File("G:\\selenium\\sheet1.xlsx");
Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	Row myrow = mysheet.getRow(1);
	Cell mycell = myrow.getCell(2);
	CellType mycelltype = mycell.getCellType();
	System.out.println(mycelltype);
	String cellvalue = mycell.getStringCellValue();
	
	System.out.println(cellvalue);
	
	//how to read pratik and find datatype
	
	Sheet mysheet1 = WorkbookFactory.create(myfile).getSheet("sheet1");
	Row myrow1 = mysheet.getRow(1);
	Cell mycell1 = myrow1.getCell(1);
	CellType mycelltype1 = mycell1.getCellType();
	System.out.println(mycelltype1);
	String mycellvalue = mycell1.getStringCellValue();
	System.out.println(mycellvalue);
	
	
	
	}

}
