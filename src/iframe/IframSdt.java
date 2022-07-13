package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframSdt {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//First frame
		
		driver.switchTo().frame("packageListFrame"); // Name of the frame
		Thread.sleep(500);
		
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//2 nd frame
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
		
		
	}

}
