package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite1 {
  @Test
  public void a() 
  {
	  Reporter.log("A is running", true);
  }
  @Test
  public void b() 
  {
	  //Assert.fail();
	  Reporter.log("b is running", true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("c is running", true);
  }
}
