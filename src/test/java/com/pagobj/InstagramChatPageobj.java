package com.pagobj;


import java.time.Duration;

import org.generics.ExtentTestManager;
import org.generics.GenericFunctions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.setup.Launch_setup;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

import com.page.InstagramchatPage;
import com.relevantcodes.extentreports.LogStatus;


public class InstagramChatPageobj extends Launch_setup{


	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	static Logger log = Logger.getLogger(InstagramchatPage.class);
	InstagramchatPage insta = PageFactory.initElements(driver, InstagramchatPage.class);
	Actions action = new Actions(driver);

	public void Chatbox()
	{
		try
		{
			Reporter.log("Execution 1");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Checking the Message Box");
			insta.MsgBox.click();
			insta.Searchbox.click();
			insta.searchbar.clear();
			action.sendKeys(insta.searchbar,"Your friend ID").perform();;
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(insta.username);
			insta.username.click();
			
			Thread.sleep(5000);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Checked the Message Box");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Failed While checking message box");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Exception Message:" + e.getLocalizedMessage());
			log.error("Exception in the method Checked the Message Box" +e.getLocalizedMessage());
			Assert.fail("Failed While checking message box" + e.getLocalizedMessage());
		}
	}
	
	public void MsgtoPinky()
	{
		try
		{
			Reporter.log("Execution 1");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Checking the pinky chat");
			insta.chatbar.clear();
			action.sendKeys(insta.chatbar,"Hi xxxxx this is automated msg from xxxx Just checking did you reached home safely???").perform();
			insta.Sendbtn.click();
			Thread.sleep(5000);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Checked the Message Box");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Failed While checking message box");
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Exception Message:" + e.getLocalizedMessage());
			log.error("Exception in the method Checked the Message Box" +e.getLocalizedMessage());
			Assert.fail("Failed While checking message box" + e.getLocalizedMessage());
		}
	}
	

}
