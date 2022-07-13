package kitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(KiteTest.Listeners.class)
public class ValidateKiteAppUserName {
 WebDriver driver;
 Sheet mySheet;
 KiteLoginPage1 login;
 KitePinPage1 pin;
 KiteHomePage1 home;
	
@BeforeClass
public void LaunchBrowser() throws EncryptedDocumentException, IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	File myfile = new File("C:\\Silenium\\Excel sheet\\KiteData.xlsx");
	mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	
	login = new KiteLoginPage1(driver);
	pin = new KitePinPage1(driver);
	home = new KiteHomePage1(driver);
	
}
@BeforeMethod
public void loginToKiteApp() 
{
	String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
	String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
	String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
	
	login.sendUserName(UN);
	Reporter.log("sending username",true);
	login.sendPassword(PWD);
	Reporter.log("sending password",true);
	login.clickOnLoginPage();
	Reporter.log("clicking on login button",true);
	
	pin.sendPin(PIN);
	Reporter.log("sending pin",true);
	pin.ClickOnContinueButton();
	Reporter.log("clicking on continue button",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
@Test
  public void ValidateUserName() 
  {
	Assert.fail();
	String expecetdUN = mySheet.getRow(5).getCell(0).getStringCellValue();
	String actualUN = home.getActualUserName();
	Reporter.log("Validating user name ", true);
	Assert.assertEquals(actualUN, expecetdUN , "Actual and expected UN are not matching tc failed");
	Reporter.log("Actual and expecetd matched tc passed", true);
	
  }
@AfterMethod
public void logOutFromKiteApp() throws InterruptedException 
{
	home.logOut();
	Reporter.log("logging out",true);
}
@AfterClass
public void closeBrowser() throws InterruptedException 
{
	Thread.sleep(2000);
	Reporter.log("closing browser",true);
	driver.close();
	
}
}
