package popups;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freejobalert.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='WB Police Wireless Operator Final Exam Admit Card']")).click();
		Thread.sleep(200);
		Set<String> allPageId = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(allPageId);
		
		driver.switchTo().window(al.get(1));
		Thread.sleep(200);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("police");
		Thread.sleep(200);
		
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		
		
		

	}

}
