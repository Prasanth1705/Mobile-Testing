package com.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class InstagramLoginPage {


	@FindBy(xpath="//android.view.View[@content-desc=\"Username, email address or mobile number\"]")
	public WebElement userid;

	@FindBy(xpath="//android.view.View[@content-desc=\"Password\"]")
	public WebElement password;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Log in\"]")
	public WebElement login;
	
	
	



}
