package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
	@Test
	  public void NewClass()
	  
	  {
		  String a = null;
		  String b = "abc";
		  
		  SoftAssert ss = new SoftAssert ();
		  
		  ss.assertEquals(a, b, "Tc is failed if value is not equal");
		  //Reporter.log("Tc is passed if value is equal");
		  
		  ss.assertNotNull(a , "tc is failed if value is null");
		  
		  
	  }
}
