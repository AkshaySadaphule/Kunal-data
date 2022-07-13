package verificationInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");		
	  WebDriver driver = new ChromeDriver();	
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  Thread.sleep(1000); 
	  
	  WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
//	  if(RadioButton.isSelected()) 
//	  {
//		  Reporter.log("Button is selected , test case is passed", true);
//	  }
//	  else 
//	  {
//		  Reporter.log("Button is not selecetd ",true);
//		  
//	  }
	  
	  Assert.assertTrue(RadioButton.isSelected(),"Button is not selected test case failed");
  }
}
