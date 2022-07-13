package excelSheetHandelling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Need to create object of file class
		
		File myFile = new File("C:\\Silenium\\Excel sheet\\Book1.xlsx");
		
		//To read the string type value 
		
		String city = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(city);
		
		double number = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		
		System.out.println(number);
		
		String chart = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(chart);
		
		boolean boo = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(boo);
	}
	

}
