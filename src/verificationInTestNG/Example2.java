package verificationInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example2 {
	WebDriver driver;
	SoftAssert sa;
	
  @Test
  public void newMethod() 
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	 sa = new SoftAssert();
	 
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	 
	 WebElement ID = driver.findElement(By.id("userid"));
	 ID.click();
	 sa.assertTrue(ID.isSelected(), "It is not selelcted test case is failed ");
	 Reporter.log("tc is passed text box is selecetd", true);
  }
}
