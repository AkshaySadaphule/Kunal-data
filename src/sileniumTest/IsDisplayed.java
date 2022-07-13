package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		hidebutton.click();
		Thread.sleep(1000);
		
		if(textbox.isDisplayed()) 
		{
			System.out.println("Thank you text box is displayed");
		}
		else 
		{
			
			System.out.println("Now you have clicked and its hided now");
		}

	}

}
