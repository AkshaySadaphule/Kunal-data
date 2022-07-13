package excelSheetHandelling;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteWithExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(500);
	
	File myfile = new File("C:\\Silenium\\Excel sheet\\NewData.xlsx");
	Sheet ref = WorkbookFactory.create(myfile).getSheet("Sheet1");
	String un = ref.getRow(6).getCell(0).getStringCellValue();
	String pass = ref.getRow(6).getCell(1).getStringCellValue();
	String PN = ref.getRow(6).getCell(2).getStringCellValue();
	
	
	WebElement userid = driver.findElement(By.id("userid"));
	
	WebElement password = driver.findElement(By.id("password"));
	
	WebElement loginid = driver.findElement(By.xpath("//button[@type='submit']"));
	
	userid.sendKeys(un);
	Thread.sleep(500);
	password.sendKeys(pass);
	Thread.sleep(500);
	loginid.click();
	Thread.sleep(500);
	
	WebElement pin = driver.findElement(By.id("pin"));
	WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
	
	pin.sendKeys(PN);
	Thread.sleep(500);
	enter.click();
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
	
	String Actualusername = username.getText();
	String Expectedusername = un;
	
	if(Actualusername.equals(Expectedusername)) 
	{
		System.out.println("userId is matched test passed");
	}
	else 
	{
		System.out.println("Test is failed");
	}
	
	username.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//a[@target='_self']")).click();
	Thread.sleep(2000);
	driver.close();

	}

}
