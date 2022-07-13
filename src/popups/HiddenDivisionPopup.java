package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // Hanedelling popup in here
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
