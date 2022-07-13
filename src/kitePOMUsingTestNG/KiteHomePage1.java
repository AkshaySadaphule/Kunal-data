package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1
{
	//1
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	//2
		
	public KiteHomePage1 (WebDriver driver) 
	{
		PageFactory.initElements(driver , this);
	}
	
	//3 
	
//	public void validateUserId(String expectedUserId) 
//	{
//		String expectedUserName = expectedUserId;
//		String actualUserName = userName.getText();
//		
//		if(expectedUserName.equals(actualUserName)) 
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
//	}
	public String getActualUserName() 
	{
		String actualUserName = userName.getText();
		return actualUserName ;
		
	}

	public void logOut() throws InterruptedException 
	{
		userName.click();
		Thread.sleep(1000);
		logOutButton.click();
		
	}
}


