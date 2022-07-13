package kitePOMwithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage1
{
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	
	public KitePinPage1 (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void sendPin(String pinn) 
	{
		PIN.sendKeys(pinn);
	}
	
	public void ClickOnContinueButton() 
	{
		continueButton.click();
	}

}
