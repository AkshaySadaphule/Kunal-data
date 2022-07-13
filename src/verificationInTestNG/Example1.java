package verificationInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Example1 {
	WebDriver driver;

  
  @FindBy(xpath = "//h2[contains(text(),'Facebook helps')]") private WebElement facebook;
  
  
  public void MyMethod() 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
	
  }
}
