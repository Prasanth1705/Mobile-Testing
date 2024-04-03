package org.generics;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public synchronized static ExtentReports getRepoeter()
	{
		if(extent == null)
		{
			String wrokingDir = System.getProperty("user.dir");
			extent = new ExtentReports(wrokingDir+"/ExtentReports/ExtentReportResults"+ GenericFunctions.currentDateAndTime() + ".html", true);
		}
		return extent;
	}
}
