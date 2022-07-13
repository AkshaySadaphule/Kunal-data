package sileniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SS1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String s1 = RandomString.make(4);
		
		File ss1 = new File("C:\\Silenium\\ScreenShots\\akshay"+s1+".jpg"); //String to create multiple ss
		FileHandler.copy(ss, ss1);
		
		
	}

}
