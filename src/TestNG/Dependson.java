package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependson {
  @Test(dependsOnMethods = {"z"})
  public void a() 
  {
	  Reporter.log("a is running",true);
  }
  @Test(dependsOnMethods = {"a"}, priority = -3)
  public void b() 
  {
	  Reporter.log("b is running ",true);
  }
  @Test
  public void z() 
  {
	  Reporter.log("z is running",true);
  }
  
}
