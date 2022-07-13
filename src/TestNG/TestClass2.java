package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
	@Test(groups = "regression")
	  public void x() 
	  {
		  Reporter.log("A is running", true);
	  }
	  @Test(groups = "sanity")
	  public void y() 
	  {
		  
		  Reporter.log("b is running", true);
	  }
	  @Test(groups = "regression")
	  public void z() 
	  {
		  Reporter.log("c is running", true);
	  }
}
