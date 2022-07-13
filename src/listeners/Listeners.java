package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener  
{
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case passed successfully",true);
		Reporter.log("Name of test method completed success is "+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case failed please check again",true);
		
		Reporter.log("Name of test method failed is "+result.getName(),true);
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test case skipped , please check dependet method",true);
	
		Reporter.log("Name of test method skipped is "+result.getName(),true);
	}


		

	

}
