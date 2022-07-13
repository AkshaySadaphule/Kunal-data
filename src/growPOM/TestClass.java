package growPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		
		Thread.sleep(2000);
		
		LoginPage log = new LoginPage(driver);
		log.register();
		Thread.sleep(2000);
		
		Login2 lo = new Login2(driver);	
		lo.username();
		Thread.sleep(2000);
		lo.continueButton();
		Thread.sleep(2000);
		lo.submit1Button();
		Thread.sleep(2000);
		
		Password p = new Password(driver);
		p.ppassword();
		Thread.sleep(1000);
		p.submit1Button2();

	}

}
