package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serialization {
  @Test
  public void FirstClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");		
	  WebDriver driver = new ChromeDriver();	
	  driver.get("https://kite.zerodha.com/");
	 // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
  }
  
}
