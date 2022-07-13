package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		// Normal Scrolling
		
//		JavascriptExecutor e = (JavascriptExecutor)driver;
//		e.executeAsyncScript("window.scrollBy(90,1000)");
		
		//scrollong to view

		
		WebElement m1 = driver.findElement(By.xpath("//div[@class='popup']"));
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("arguments[0].scrollIntoView(true)",m1);
	}

}
