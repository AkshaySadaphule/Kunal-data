package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void MyStudy() 
  {
	  String a = null;
	  String b = "abc";
	  
//	  Assert.assertNull(a, "Tc is failed if value is not null");
//	   Reporter.log("Tc is passed if value is null" ,true);
	  
	  
	  
	  Assert.assertNotNull(b, "Tc is failed if value is null");
	  Reporter.log("Tc is paassed is is not null", true);
	  Assert.fail();
	  
  }
}
