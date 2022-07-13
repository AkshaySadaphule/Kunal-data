package KitePOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {

	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop= new Properties();// craeted object of propertyClass
		
		FileInputStream myfile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\19 th march selenium\\MyProperty.properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		return value;
	
	}
	
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File dest = new File("C:\\Silenium\\ScreenShots\\myScreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	
	}
}
