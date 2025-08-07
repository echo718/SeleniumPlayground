package Testcases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test start");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test Skipped");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
	}

}
