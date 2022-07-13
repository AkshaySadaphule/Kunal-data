package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.discoveryplus.in/");
	  Thread.sleep(20000);
	  
	  driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("mobileNumber")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
	  
	  
	}

}
