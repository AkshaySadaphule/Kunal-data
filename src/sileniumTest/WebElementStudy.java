package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Akshay");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
	
		
	}

}
