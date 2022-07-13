package growPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "//span[text()='Login/Register']")private WebElement login;
//	@FindBy(id = "login_email1")private WebElement userid;
//	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")private WebElement continu;
//	@FindBy(id = "login_password1")private WebElement password;
//	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")private WebElement submit1;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void register() 
	{
		login.click();
	}
	
//	public void username() 
//	{
//		login.sendKeys("vskadam2000@gmail.com");
//	}
//	
//	public void continueButton() 
//	{
//		login.click();
//	}
//	public void submit1Button() 
//	{
//		login.click();
//	}
//	
}
