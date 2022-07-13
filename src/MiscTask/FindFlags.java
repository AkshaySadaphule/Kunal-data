package MiscTask;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFlags {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("flags");
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getText());
		}
		
		System.out.println("=================underlist==============");
		
		for(WebElement ref:list) 
		{
			String actual = ref.getText();
			String expected = ref.getText();
			if(actual.equals(expected)) 
			{
				ref.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();
		List<WebElement> imglist = driver.findElements(By.tagName("img"));
		
		System.out.println(imglist.size());
	}

}
