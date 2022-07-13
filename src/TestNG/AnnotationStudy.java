package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUsrname() 
  {
	  Reporter.log("Username validated",true);
  }
  @Test
  public void validateDashboard() 
  {
	  Reporter.log("Dashboard validate ",true);
  }
  @BeforeMethod
  public void loginTokiteApp() 
  {
	  Reporter.log("login success",true);
  }
  @AfterMethod
  public void logoutFromKiteApp() 
  {
	  Reporter.log("logged out", true);
  }
  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("launching browser ",true);
  }
  @AfterClass
  public void close() 
  {
	  Reporter.log("closing browser", true);
  }
}
