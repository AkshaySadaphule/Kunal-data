package MiscTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandel3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//List<WebElement> tablehead = driver.findElements(By.id("//table[@id='product']//tbody//tr//th"));
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
//		int rowcount = tablehead.size();
//		System.out.println(rowcount);
		
		for(WebElement r:columns) 
		{
			System.out.println(r.getText());
		}

	}

}
