package devops;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listner implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("exec started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("tc success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
	}
}
