package kitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public KitePinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void sendPin() 
	{
		PIN.sendKeys("982278");
	}
	
	public void ClickOnContinueButton() 
	{
		continueButton.click();
	}

}
