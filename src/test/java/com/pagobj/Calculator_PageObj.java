package com.pagobj;


import org.generics.GenericFunctions;
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
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(calc.AllClear);
			calc.AllClear.click();			
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(calc.Eight);
			calc.Eight.click();
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(calc.Add);
			calc.Add.click();
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(calc.Two);
			calc.Two.click();
			GenericFunctions.waitTillTheElementIsVisibleAndClickable(calc.equaltoo);
			calc.equaltoo.click();

			String s = calc.Ans.getText().trim();

			Assert.assertEquals("10", s);

		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
