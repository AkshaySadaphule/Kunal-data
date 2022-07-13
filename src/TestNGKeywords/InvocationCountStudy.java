package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 3)
  public void a()
  {
	  Reporter.log("a method is running ",true);
  }
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method is running ",true);
  }
}
