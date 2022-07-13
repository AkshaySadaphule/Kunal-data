package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(500);
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Silenium\\ScreenShots\\akshayxrbc.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	}

}
