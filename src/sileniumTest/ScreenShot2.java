package sileniumTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {

	public static void main(String[] args) throws IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str = RandomString.make(3); // new method to take multiple Screen shots
		
		File dest = new File("C:\\Silenium\\ScreenShots\\Facebook"+str+".jpg");
		
		FileHandler.copy(source, dest);

	}

}
