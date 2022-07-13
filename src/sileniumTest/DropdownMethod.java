package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethod {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.id("cars"));
		Thread.sleep(500);
		
		Select s= new Select(dropdown);
		
		//System.out.println("Is it multiple ="+s.isMultiple());
		
		s.selectByIndex(3);
		Thread.sleep(500);
		
		s.selectByValue("saab");
		Thread.sleep(500);
		
		s.selectByVisibleText("Opel");
		
	//	s.deselectAll();
		
		s.deselectByIndex(2);
		Thread.sleep(500);
		s.deselectByValue("Audi");
		Thread.sleep(500);

	}

}
