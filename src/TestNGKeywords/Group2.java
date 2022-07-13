package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group2 {
	@Test (groups = "Regression")
	  public void tc1()
	  {
		  Reporter.log("a method is running ",true);
	  }
	  @Test (groups = "sanity")
	  public void tc2() 
	  {
		  Reporter.log("b method is running ",true);
	  }
	  @Test (groups = "Regression")
	  public void tc3() 
	  {
		  Reporter.log("c method is running ",true);
	  }
}
