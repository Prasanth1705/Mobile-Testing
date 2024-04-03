package com.pagobj;


import org.generics.GenericFunctions;
import org.openqa.selenium.support.PageFactory;
import org.setup.Launch_setup;
import org.testng.Assert;
import org.testng.Reporter;
import com.page.InstagramLoginPage;


public class InstagramLoginPageobj extends Launch_setup{


	InstagramLoginPage insta = PageFactory.initElements(driver, InstagramLoginPage.class);

	public void LoginDetails()
	{
		try
		{
			Reporter.log("Execution 1");
			
			insta.userid.click();
			insta.userid.sendKeys("userid");
			insta.password.click();
			insta.password.sendKeys("yourpasssword");
			
			insta.login.click();
			
			Thread.sleep(5000);

		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
