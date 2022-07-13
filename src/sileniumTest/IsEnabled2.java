package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		
		WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		//getOTPButton.click();
		//boolean result = getOTPButton.isEnabled();
		//System.out.println("Result is "+result);
		
		 driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
		//Thread.sleep(1000);
		
		boolean result1 = getOTPButton.isEnabled();
		//System.out.println("Result is "+result1);
		
		//getOTPButton.click();
		
		if(result1==true) 
		{
			
			System.out.println(" Thank you, welcome to application ");
		}
		else 
		{
			driver.findElement(By.id("mobileNumber")).sendKeys("9999999999");
			Thread.sleep(1000);
			getOTPButton.click();
			System.out.println("Thank you for selecting");
			
		}
		
		
	}

}
