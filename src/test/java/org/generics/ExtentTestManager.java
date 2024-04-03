package org.generics;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	
	static Map extentTestMap = new HashMap();
	static ExtentReports extent = ExtentManager.getRepoeter();
	
	public static synchronized ExtentTest getTest()
	{
		return(ExtentTest)extentTestMap.get((int) (long)(Thread.currentThread().getId()));
	}
	
	public static synchronized void endTest()
	{
		extent.endTest((ExtentTest)extentTestMap.get((int) (long)(Thread.currentThread().getId())));
	}
	
	public static synchronized ExtentTest startTest(String testname, String description)
	{
		ExtentTest test = extent.startTest(testname, description);
		extentTestMap.put((int)(long)(Thread.currentThread().getId()), test);
		return test;
	}

}
