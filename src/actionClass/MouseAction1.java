package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		//create object of action class
		Actions act = new Actions(driver);
		
		//identify element where actions to be perform
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//1st method

//		act.moveToElement(rightClickButton).perform();
//		act.contextClick().perform();
		
		//2nd method 
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//3rd way

		//act.contextClick(rightClickButton).perform();
		
//		WebElement seleniumbutton = driver.findElement(By.linkText("Selenium"));
//		act.click(seleniumbutton).perform();
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclickbutton).perform();
	}

}
