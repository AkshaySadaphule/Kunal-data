package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1500);
		
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		//checkbox1.click();
		boolean result = checkbox1.isSelected();
		
		
		/*System.out.println(result);
		
		checkbox1.click();
		boolean result1 = checkbox1.isSelected();
		System.out.println(result1);*/
		
		if(result==true) 
		{
			System.out.println("Thank you for selecting , have a good day");
		}
		else 
		{
			driver.findElement(By.id("checkBoxOption1")).click();
			System.out.println("This box is selecetd now , thank you");
			
		}
		

	}

}
