package growPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

	
		@FindBy(xpath = "(//div[@class='dropdown__trigger '] )[1]")private WebElement dropdown;
		
		@FindBy(xpath = "(//div[@class='settingItem valign-wrapper'])[5]")private WebElement logout;
	

}
