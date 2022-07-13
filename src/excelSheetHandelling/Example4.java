package excelSheetHandelling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Silenium\\Excel sheet\\NewData.xlsx");
		Sheet ref = WorkbookFactory.create(myfile).getSheet("Sheet1");

		int Rocount = ref.getLastRowNum();
		short allcolumn = ref.getRow(Rocount).getLastCellNum();
		int Cocount = allcolumn-1;
		
		System.out.println("Total no of rows ="+Rocount);
		System.out.println("Total no of columns ="+ Cocount);
		
		for(int i =0; i<=Rocount; i++)
		{
			for(int j =0 ; j<=Cocount; j++) 
			{
				Cell cell = ref.getRow(i).getCell(j);
				switch (cell.getCellType()) 
				{
				case STRING:
					String value = cell.getStringCellValue();
					System.out.print(value+" ");
					break;
					
				case NUMERIC:
					double value1 = cell.getNumericCellValue();
					System.out.print(value1+" ");
					break;	
					
				case BOOLEAN:
					boolean value2 = cell.getBooleanCellValue();
					System.out.print(value2+" ");
					break;
						
				case BLANK:
					System.out.print("   ");
					break;
				}
				
			}
			System.out.println();
		}
		
	}

}
