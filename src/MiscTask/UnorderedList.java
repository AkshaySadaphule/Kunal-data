package MiscTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		
		List<WebElement> results = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
		
		System.out.println(results.size());
		
		for(WebElement r:results) 
		{
			System.out.println(r.getText());
		}
		
		for(WebElement seresults:results) 
		{
			String actualText = seresults.getText();
			String expecetdText = "honda amaze";
			
			if(actualText.equals(expecetdText)) 
			{
				seresults.click();
				break;
			}
		}
			driver.findElement(By.linkText("Images")).click();
			

			
	}

}
