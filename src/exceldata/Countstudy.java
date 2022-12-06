package exceldata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Countstudy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	File myfile=new File("G:\\selenium\\sheet0.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	int rowno1 = mysheet.getLastRowNum();
	System.out.println(rowno1);
	int rowcount = rowno1+1;
	System.out.println(rowcount);

	}

}
