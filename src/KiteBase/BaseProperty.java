package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import KiteUtility.Utility;
import KiteUtility.UtilityProp;

public class BaseProperty 
{
	protected static WebDriver driver ;
	public void openBroweser() throws IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		
		driver.get(UtilityProp.readDataFromProp("URL"));
		Reporter.log("launching browser ", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
