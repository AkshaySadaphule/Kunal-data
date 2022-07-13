package KiteTest;

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
import org.testng.annotations.Test;

import KiteBase.Base;
import KiteUtility.Utility;
import kitePOMUsingTestNG.KiteHomePage1;
import kitePOMUsingTestNG.KiteLoginPage1;
import kitePOMUsingTestNG.KitePinPage1;

public class ValidateKiteUserId extends Base {
	 //WebDriver driver;
	 KiteLoginPage1 login;
	 KitePinPage1 pin;
	 KiteHomePage1 home;
	 String TCID = "999";
		
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException 
	{
		openBrowser();
		login= new KiteLoginPage1(driver);
		pin = new KitePinPage1(driver);
		home = new KiteHomePage1(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	{
		login.sendUserName(Utility.readDataFromExcel(5, 0));
		login.sendPassword(Utility.readDataFromExcel(5, 1));
		login.clickOnLoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(5, 2));
		pin.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	  public void ValidateUserName() throws EncryptedDocumentException, IOException 
	  {
		
		Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(5, 0), "Actual and expecetd are not matching");
		Utility.captureSreenShot(driver, TCID);
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
		
		Reporter.log("closing browser",true);
		driver.close();
	}
}
