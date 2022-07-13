package growPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 
{
	@FindBy(id = "login_email1")private WebElement userid;
	@FindBy(xpath = "(//span[@class='absolute-center'])[1]")private WebElement continu;
//	@FindBy(id = "login_password1")private WebElement password;
    @FindBy(xpath = "(//span[@class='absolute-center'])[1]")private WebElement submit1;
	
	
	public Login2(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username() 
	{
		userid.sendKeys("vskadam2000@gmail.com");
	}
	
	public void continueButton() 
	{
		continu.click();
	}
	public void submit1Button() 
	{
		submit1.click();
	}

}
