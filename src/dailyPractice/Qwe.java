package dailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qwe {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver akshay = new ChromeDriver();
		
		akshay.get("https://www.facebook.com/"); 
		
		//akshay.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//note - attribute syntax = tagname[@attribute name = 'attribute value']
		
		//akshay.findElement(By.xpath("//button[@value='1']")).click();
		
		akshay.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		

	}

}
