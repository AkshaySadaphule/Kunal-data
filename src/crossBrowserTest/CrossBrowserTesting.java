package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
public class CrossBrowserTesting {
@org.testng.annotations.Parameters("browserName")
  @Test
  public void myMethod(String name) throws InterruptedException 
  {
	  WebDriver driver=null;
	  
	  if(name.equals("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Silenium\\geckodriver.exe");
			 driver = new FirefoxDriver();
		  
	  }
	  else if(name.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		 driver = new ChromeDriver();

	  }
	  	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.close();
  }
}
