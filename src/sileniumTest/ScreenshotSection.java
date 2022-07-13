package sileniumTest;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSection {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement section = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div"));
		
		File src = section.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Silenium\\ScreenShots\\section.png");
		
	
		FileHandler.copy(src, dest);

	    

	}

}
