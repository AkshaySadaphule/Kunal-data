package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Zerodha 
{
	WebDriver driver;
  @Test
  public void ValidateUser() 
  {
	  WebElement text = driver.findElement(By.xpath("//span[@class='user-id']"));
	  String actualId = text.getText();
	  String expecetdId = "ELR3211";
	  if(actualId.equals(expecetdId)) 
	  {
		 Reporter.log("User id is valid test case passed ",true);
	  }
	  else 
	  {
		 Reporter.log("user id invalid test case failed ", true);
		  Assert.fail();
	  }
  }
  @BeforeMethod
  public void LoginPage() 
  {
	  driver.findElement(By.id("userid")).sendKeys("ELR321");
	  driver.findElement(By.id("password")).sendKeys("Dhana1111");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
  }
  
  @BeforeMethod
  public void PinPage() 
  {
	  driver.findElement(By.id("pin")).sendKeys("982278");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @AfterMethod
  public void logoutPage() 
  {
	  driver.findElement(By.xpath("//span[@class='user-id']")).click();
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
  }

  @BeforeClass
  public void OpenBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");		
	  driver = new ChromeDriver();	
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
  }

  @AfterClass
  public void CloseBrowser() 
  {
	  driver.close();
  }

  
}
