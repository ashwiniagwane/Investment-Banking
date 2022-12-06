package exceldata;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Countrowcolumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
	File myfile=new File("G:\\selenium\\sheet1.xlsx");
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	int rowno = mysheet.getLastRowNum();

        System.out.println(rowno);
        int count = rowno+1;
        System.out.println(count);
	
	
	
	}

}
