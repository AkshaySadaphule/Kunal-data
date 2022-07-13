package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iwuvx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		String titel = driver.getTitle();
		System.out.println("Title is "+titel);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL IS "+url);

	}

}
