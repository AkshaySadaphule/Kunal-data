package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerPOPUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(500);
		
		driver.findElement(By.id("alertButton")).click();
		
		
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();

	}

}
