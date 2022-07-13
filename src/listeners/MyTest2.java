package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listeners.class)

public class MyTest2 {
  @Test
  public void MyMethod4() 
  {
	  Reporter.log("My method4 is running ", true);
  }
  @Test
  public void MyMethod5() 
  {
	  Assert.fail();
	  Reporter.log("My method5 is running ", true);
  }
  @Test(dependsOnMethods = {"MyMethod5"})
  public void MyMethod6() 
  {
	  Reporter.log("My method6 is running ", true);
  }
}
