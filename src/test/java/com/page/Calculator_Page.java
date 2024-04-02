package com.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Calculator_Page {


	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.oneplus.calculator:id/img_clr\"]")
	public WebElement AllClear;

	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.oneplus.calculator:id/digit_8\"]")
	public WebElement Eight;

	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.oneplus.calculator:id/digit_2\"]")
	public WebElement Two;

	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.oneplus.calculator:id/img_op_add\"]")
	public WebElement Add;

	@FindBy(xpath="//android.widget.Button[@resource-id=\"com.oneplus.calculator:id/img_eq\"]")
	public WebElement equaltoo;

	@FindBy(xpath="//android.widget.TextView[@resource-id=\"com.oneplus.calculator:id/result\"]")
	public WebElement Ans;


}
