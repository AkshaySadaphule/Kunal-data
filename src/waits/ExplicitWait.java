package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		WebElement m1 = driver.findElement(By.xpath("//div[@class='popup']"));
		
		wait.until(ExpectedConditions.visibilityOf(m1));
		
		// Normal Scrolling
		
//		JavascriptExecutor e = (JavascriptExecutor)driver;
//		e.executeAsyncScript("window.scrollBy(90,1000)");
		
		//scrollong to view

		
//		WebElement m1 = driver.findElement(By.xpath("//div[@class='popup']"));
//		JavascriptExecutor e = (JavascriptExecutor)driver;
//		e.executeScript("arguments[0].scrollIntoView(true)",m1);
	}

}
