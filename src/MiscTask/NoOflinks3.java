package MiscTask;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOflinks3 {

	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.instagram.com/");
//		Thread.sleep(2000);
//		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		
//		Iterator<WebElement> it = links.iterator();
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next().getText());
//		}
//
		
System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getText());
		}
		
		

	}


}
