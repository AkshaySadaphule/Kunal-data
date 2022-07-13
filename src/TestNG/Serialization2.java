package TestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serialization2 {
  @Test
  public void FirstClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");		
	  WebDriver driver = new ChromeDriver();	
	  driver.get("https://www.google.co.in/");
  }
  
}
