package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Silenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Welcome");
		

		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//*[@id=\"a\"]")).click();
		
		driver.switchTo().defaultContent();
		WebElement ss = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/label/span"));
		System.out.println(ss.getText());
		
		driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		
		Select q = new Select(animal);
		q.selectByVisibleText("Big Baby Cat");
		
		
	}

}
