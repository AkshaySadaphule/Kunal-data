package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId);
		
		System.out.println("==========================================");
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(3000);
		
     	Set<String> allPageId = driver.getWindowHandles(); // Arraylist ready
		Iterator<String> it = allPageId.iterator();
		
		
//		while(it.hasNext()) 
//		{
//			System.out.println(it.next());
//		}
		
	    String mainPageID = it.next();
	    String childpageid = it.next();
	    System.out.println(childpageid);
	    
	    driver.switchTo().window(childpageid); //changing focus from main page to child page
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
	
		driver.switchTo().window(mainPageID);
			
		WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		System.out.println(myElement.getText());
		
		
		

	}

}
