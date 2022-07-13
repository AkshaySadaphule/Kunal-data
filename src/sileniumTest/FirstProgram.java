package sileniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@name='radio'][4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='radio'][3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='radio'][2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='radio'][1]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		driver.findElement(By.xpath("//a[text()='HOME ']")).click();
		
		driver.findElement(By.xpath("//a[@rel='noopener noreferrer']")).click();
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		driver.findElement(By.xpath("//option[@value='option3']")).click();
		
		//driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		
	}

}