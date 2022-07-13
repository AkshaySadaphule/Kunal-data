package kitePOMwithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kitePOM.KiteHomePage;
import kitePOM.KiteLoginPage;
import kitePOM.KitePinPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		File myfile = new File("C:\\Silenium\\Excel sheet\\KiteData.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
	
		
		KiteLoginPage1 login = new KiteLoginPage1(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickOnLoginPage();
		
		Thread.sleep(2000);
		
		KitePinPage1 pin = new KitePinPage1(driver);
		pin.sendPin(PIN);
		pin.ClickOnContinueButton();


		Thread.sleep(2000);
		
		KiteHomePage1 home = new KiteHomePage1(driver);
		home.validateUserId(UN);
		home.logOut();
		
		driver.close();
		

	}

}
