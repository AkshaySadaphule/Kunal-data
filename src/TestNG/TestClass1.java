package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
	@Test(groups = "sanity")
	  public void a() 
	  {
		  Reporter.log("A is running", true);
	  }
	  @Test(groups = "regression")
	  public void b() 
	  {
		  
		  Reporter.log("b is running", true);
	  }
	  @Test(groups = "sanity")
	  public void c() 
	  {
		  Reporter.log("c is running", true);
	  }
}
