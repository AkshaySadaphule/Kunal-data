package kitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1
{
	//1.Data Members
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password")private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;

	//2. constructor

	public KiteLoginPage1 (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void sendUserName(String Userdetail)
	{
		userName.sendKeys(Userdetail);
	}
	
	public void sendPassword(String PASS) 
	{
		password.sendKeys(PASS);
		
	}
	public void clickOnLoginPage() 
	{
		loginButton.click();
	}
}
