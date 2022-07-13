package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
		
		Select s = new Select(dropDown);
		Thread.sleep(1000);
		
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);
		
		System.out.println(s.isMultiple());

	}

}
