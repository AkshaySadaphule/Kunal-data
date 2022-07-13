package excelSheetHandelling;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Silenium\\Excel sheet\\akshay.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int rowcount = mySheet.getLastRowNum();
		System.out.println("Total number of rows are "+rowcount);
		
		short TotaNoOfcolumns = mySheet.getRow(rowcount).getLastCellNum();
		
	//	System.out.println(TotaNoOfcolumns);
		
		int columncount = TotaNoOfcolumns -1;
		
		System.out.println("Total number of columns"+columncount);

		
	//	System.out.println(mySheet.getRow(1).getCell(0).getCellStyle());
		
		for(int i =0; i<=rowcount; i++) 
		{
			for(int j = 0 ; j<=columncount; j++) 
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType dataType = myCell.getCellType();
				
				if(dataType==CellType.STRING) 
				{
					String value = myCell.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(dataType==CellType.NUMERIC) 
				{
					double Value = myCell.getNumericCellValue();
					System.out.print(Value+" ");
					
				}
				else if(dataType==CellType.BLANK)
				{
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value);
				}
				
				
			}
			System.out.println();
		}
		
		
	}
}
