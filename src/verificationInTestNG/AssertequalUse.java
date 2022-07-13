package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertequalUse {
  @Test
  public void newclass() 
  {
	  String a = "pune1";
	  String b = "pune";
	  
	//  Assert.assertEquals(a, b, "Actual and expecetd are not equal");
	  
	  Assert.assertNotEquals(a, b,"Actual ane expecetd are aqual");
	  Reporter.log("TC is passed Actual and expeceted are not equal",true);
  }
}
