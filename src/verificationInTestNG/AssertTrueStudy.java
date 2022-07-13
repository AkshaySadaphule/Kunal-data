package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void MyMethod() 
  {
	  boolean a = false ;
	  boolean b = false ;
	  
//	  Assert.assertTrue(a , "Tc is failed if value is FALSE");
//	  Reporter.log("Tc is passed when value is true",true);
	  
	  
	  Assert.assertFalse(a , "Tc is failed if value is true");
	  Reporter.log("Tc is passed if value is False", true);
  }
}
