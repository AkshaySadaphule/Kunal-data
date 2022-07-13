package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteBase.BaseProperty;
import KiteUtility.UtilityProp;
import kitePOMUsingTestNG.KiteHomePage1;
import kitePOMUsingTestNG.KiteLoginPage1;
import kitePOMUsingTestNG.KitePinPage1;

@Listeners(KiteTest.Listeners.class)
public class ValidateUserIDUsingProperty extends BaseProperty {
 KiteHomePage1 Home;
 KiteLoginPage1 LOGIN ;
 KitePinPage1 PIN;
 //String TCID = "1234";
	
 
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		openBroweser();
		LOGIN = new KiteLoginPage1(driver);
		Home = new KiteHomePage1(driver);
		PIN = new KitePinPage1(driver);
		
		
	}
	@BeforeMethod
	public void loginUser() throws IOException 
	{
		LOGIN.sendUserName(UtilityProp.readDataFromProp("UN"));
		LOGIN.sendPassword(UtilityProp.readDataFromProp("PWD"));
		LOGIN.clickOnLoginPage();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		PIN.sendPin(UtilityProp.readDataFromProp("PIN"));
		PIN.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	@Test
	public void ValidateUserid() throws IOException 
	{
		Assert.fail();
		Assert.assertEquals(Home.getActualUserName(), UtilityProp.readDataFromProp("UN"));
		//UtilityProp.captureSreenShot(driver, TCID);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
    }
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		Home.logOut();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	@AfterClass
	public void close() 
	{
		driver.close();
	}
	
}
