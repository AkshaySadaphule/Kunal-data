package MiscTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderedList2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("disney");
		Thread.sleep(1000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		System.out.println(elements.size());
		
		for(WebElement e:elements) 
		{
			//System.out.println(e.getText());
			String actual = e.getText();
			String expected = "disney movies";
			
			if(actual.equals(expected)) 
			{
				e.click();
				break;
			}
			
		}
		
		driver.findElement(By.linkText("Images")).click();

	}

}
