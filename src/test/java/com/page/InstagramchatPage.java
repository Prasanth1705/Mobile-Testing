package com.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;



public class InstagramchatPage {
	
//	AndroidDriver driver;
//	
//	public InstagramchatPage(AndroidDriver driver)
//	{
//		this.driver= driver;
//	}


	@FindBy(id="com.instagram.android:id/action_bar_inbox_button")
	public WebElement MsgBox;

	@FindBy(id="com.instagram.android:id/search_row")
	public WebElement Searchbox;
	
	@FindBy(id="com.instagram.android:id/search_bar_real_field")
	public WebElement searchbar;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Akhila_Reddy\"]")
	public WebElement username;
	
	@FindBy(id="com.instagram.android:id/row_thread_composer_edittext")
	public WebElement chatbar;
	
	@FindBy(id="com.instagram.android:id/row_thread_composer_send_button_icon")
	public WebElement Sendbtn;
	
	
	
	
	

}
