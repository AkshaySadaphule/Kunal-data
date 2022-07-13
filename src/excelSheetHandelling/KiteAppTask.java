package excelSheetHandelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTask {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		
		WebElement userid = driver.findElement(By.id("userid"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginid = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		Thread.sleep(500);
		password.sendKeys("Dhana1111");
		Thread.sleep(500);
		loginid.click();
		Thread.sleep(500);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		Thread.sleep(500);
		enter.click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String Actualusername = username.getText();
		String Expectedusername = "ELR321";
		
		if(Actualusername.equals(Expectedusername)) 
		{
			System.out.println("userId is matched test passed");
		}
		else 
		{
			System.out.println("Test is failed");
		}
		
		username.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
