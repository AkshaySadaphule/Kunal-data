package KiteTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.BaseProperty;
import KiteUtility.UtilityProp;

public class Listeners extends BaseProperty implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try {
			UtilityProp.captureSreenShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case is passed "+result.getName());
	}

}
