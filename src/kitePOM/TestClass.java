package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		KiteLoginPage login = new KiteLoginPage(driver);
		
		
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginPage();
		
		Thread.sleep(2000);
		
		KitePinPage pin = new KitePinPage(driver);
		pin.sendPin();
		pin.ClickOnContinueButton();


		Thread.sleep(2000);
		
		KiteHomePage home = new KiteHomePage(driver);
		home.validateUsername();
		home.logOut();
		
		driver.close();
		
	}

}
