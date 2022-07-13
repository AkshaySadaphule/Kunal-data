package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listeners.class)

public class MyTest {
  @Test
  public void MyMethod1() 
  {
	  Reporter.log("My method1 is running ", true);
  }
  @Test
  public void MyMethod2() 
  {
	  Assert.fail();
	  Reporter.log("My method2 is running ", true);
  }
  @Test(dependsOnMethods = {"MyMethod2"})
  public void MyMethod3() 
  {
	  Reporter.log("My method3 is running ", true);
  }
}
