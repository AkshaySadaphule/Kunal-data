package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite2 {
	@Test
	  public void x() 
	  {	Assert.fail();
		  Reporter.log("A is running", true);
	  }
	  @Test
	  public void y() 
	  {
		  
		  Reporter.log("b is running", true);
	  }
	  @Test
	  public void z() 
	  {
		  Reporter.log("c is running", true);
	  }
}
