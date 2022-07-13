package MiscTask;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		
		int totalNumberOfRows = rows.size();
		
		System.out.println("total no of rows "+totalNumberOfRows);

		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		
		int totalNumberOfcolumns = columns.size();
		
		System.out.println("total no of columns "+totalNumberOfcolumns);
		
		for(WebElement c:columns) 
		{
			System.out.print(c.getText()+" || ");
		}
		
		
		List<WebElement> allRowsData = driver.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement> it = allRowsData.iterator();
		while(it.hasNext()) 
		{
			System.out.print(it.next().getText()+"  ");
			System.out.println();
		}
	}

}
