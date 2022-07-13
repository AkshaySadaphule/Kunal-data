package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	    WebElement Emailid = driver.findElement(By.id("email"));
	    Emailid.sendKeys("9158430420"); 
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Satara@123");
		
	
		
	}

}
