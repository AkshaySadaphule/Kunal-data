package excelSheetHandelling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Silenium\\Excel sheet\\Book1.xlsx");
		
		Sheet cello = WorkbookFactory.create(myfile).getSheet("Sheet2");

		System.out.println("=========================================================");
		
		for (int i =0 ; i<=3 ; i++) 
		{
			for(int j =0 ; j<=2 ; j++) 
			{
				String value = cello.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
				
			}
			System.out.println();
		}
		System.out.println("=========================================================");
	}

}
