package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void NewClass()
  
  {
	  String a = null;
	  String b = "abc";
	  
	  Assert.assertEquals(a, b , "Tc is failed if value are not aqual");
	  Reporter.log("Tc is passed when values are equal");
	  
	  Assert.assertNull(a, "tc is failed if not null");
	  Reporter.log("Tc is passed when value is null");
  }
}
