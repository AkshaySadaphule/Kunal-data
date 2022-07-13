package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement sourceElement = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement destinationelement = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceElement, destinationelement).perform();
	}

}
