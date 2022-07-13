package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html" );
		//find user name and set username
		WebElement txtbx_username =
				driver.findElement(By.id("user_login"));
		
	txtbx_username.sendKeys("username");
	
	//password is set
	driver.findElement(By.id("user_password")).sendKeys("password");
	
	driver.findElement(By.id("submit")).click();
	
	

	}

}
