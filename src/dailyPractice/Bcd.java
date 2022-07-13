package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bcd {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
				
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
