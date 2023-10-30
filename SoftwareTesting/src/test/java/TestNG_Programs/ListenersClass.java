package TestNG_Programs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{

	public void onStart(ITestContext result) {
		System.out.println("on Start method invoke...");
	}
	public void onFinish(ITestContext result) {
		System.out.println("on finished method invoke...");
	}
	public void onTestStart(ITestResult result) {
		System.out.println("name of Test method started..."+result.getName());

	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("name of Test method successfully executed..."+result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("name of Test method failed..."+result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("name of Test method skipped..."+result.getName());


	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
