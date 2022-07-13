package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//h2[text()='Facebook helps']")).clear();
		
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		//xpath by text contains
		
		
		driver.findElement(By.xpath("//button[contains(@value ,'1')]"));
		//xpath by attributes
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
	}

}
