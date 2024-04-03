package org.generics;

import org.setup.Launch_setup;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends Launch_setup implements ITestListener{


	private static String getTestMethodName(ITestResult iTestReult)
	{
		return iTestReult.getMethod().getConstructorOrMethod().getName();
	}
	@Override
	public void onTestStart(ITestResult result) {
		
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("I am in onStart Method" + context.getName());
		context.setAttribute("AndroidDriver", this.driver);

	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("I am in onStart Method" + context.getName());

	}

}
