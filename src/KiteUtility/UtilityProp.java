package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{
	public static String readDataFromProp(String key) throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream myFile = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\19 th march selenium\\MyProperty.properties");
		
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
	
	public static void captureSreenShot(WebDriver driver , String TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Silenium\\ScreenShots\\akki"+TCID+".png");
		FileHandler.copy(src, dest);
	}


}
