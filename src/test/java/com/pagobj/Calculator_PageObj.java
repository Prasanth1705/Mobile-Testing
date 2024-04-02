package com.pagobj;


import org.openqa.selenium.support.PageFactory;
import org.setup.Launch_setup;
import org.testng.Assert;
import org.testng.Reporter;

import com.page.Calculator_Page;


public class Calculator_PageObj extends Launch_setup{


	Calculator_Page calc = PageFactory.initElements(driver, Calculator_Page.class);

	public void AddingNums()
	{
		try
		{
			Reporter.log("Execution 1");
			Thread.sleep(2000);
			calc.AllClear.click();			
			Thread.sleep(2000);
			calc.Eight.click();
			Thread.sleep(2000);
			calc.Add.click();
			Thread.sleep(2000);
			calc.Two.click();
			Thread.sleep(2000);
			calc.equaltoo.click();
			Thread.sleep(1000);

			String s = calc.Ans.getText().trim();

			Assert.assertEquals("10", s);

		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
