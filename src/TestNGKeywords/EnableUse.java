package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	@Test 
	  public void a()
	  {
		  Reporter.log("a method is running ",true);
	  }
	  @Test (enabled = false)
	  public void b() 
	  {
		  Reporter.log("b method is running ",true);
	  }
	  @Test 
	  public void c() 
	  {
		  Reporter.log("c method is running ",true);
	  }
	  
}
