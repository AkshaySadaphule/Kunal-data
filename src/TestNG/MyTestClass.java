package TestNG;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void MyMehod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		System.out.println("hi this is akshay");
		
		Reporter.log("Hi this is akshay");
		Reporter.log("Hi this is akshay", true);
		
  }
  @Test
  
  public void test2() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
