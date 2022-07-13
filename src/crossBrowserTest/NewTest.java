package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  		WebDriver driver=null;
	  
	  
	  		System.setProperty("webdriver.gecko.driver", "C:\\Silenium\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.get("https://www.facebook.com/");
  }
}