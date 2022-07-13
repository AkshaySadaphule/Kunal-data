package KitePOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import KitePOM.UtilityProp;

public class BasePorp 
{
 protected static WebDriver driver;
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get(UtilityProp.readDataFromPropertyFile("URL"));
	}

}
