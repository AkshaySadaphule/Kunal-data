package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.findElement(By.name("checkBoxOption1")).click();
		
		//get text method
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText());
		
		// 2 
		WebElement element = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		System.out.println(element.getText());
		
		//3 
		
		String text = element.getText();
		System.out.println(text);
	}

}
