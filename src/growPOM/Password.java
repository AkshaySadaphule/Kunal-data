package growPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password 
{
	@FindBy(id = "login_password1")private WebElement password;
	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")private WebElement submit2;
	
	public Password(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ppassword() 
	{
		password.sendKeys("Jarvis@V12");
	}
	
//	public void continueButton() 
//	{
//		continu.click();
//	}
	public void submit1Button2() 
	{
		submit2.click();
	}

}
