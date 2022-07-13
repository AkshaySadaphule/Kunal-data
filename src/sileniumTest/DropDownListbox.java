package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(500);
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		
		for(int i =4 ; i<=24 ; i++) 
		{
			s.selectByIndex(i);
			//Thread.sleep(100);
			
		}
		for(int i =24; i>=5 ; i--)
		{
			s.selectByIndex(i);
			//Thread.sleep(100);
		}
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		for(int i =2 ; i<=10 ; i++) 
		{
			s1.selectByIndex(i);
			//Thread.sleep(100);
			
		}
		

	}

}
