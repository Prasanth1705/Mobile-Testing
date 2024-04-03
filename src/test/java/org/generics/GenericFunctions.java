package org.generics;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.setup.Launch_setup;

import io.appium.java_client.android.AndroidDriver;

public class GenericFunctions extends Launch_setup{
	
	public Select select;
	public Action action;
	
	public static void SelectValueFromDropDwown(AndroidDriver driver, String locator,String text)
	{
		WebElement lang = driver.findElement(By.xpath(locator));
		List<WebElement> list = driver.findElements(By.xpath(locator));
		for (WebElement opt : list)
		{
			String value = opt.getText().trim();
			if(value.equalsIgnoreCase(text))
			{
				System.out.println("Value Clicked ="+ value);
				opt.click();
			}
		}
	}
	
	public static String currentDateAndTime()
	{
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddHHmmss");
		String date= now.format(dtf);
		return date;
	}
	
	public static void waitTillTheElementIsVisibleAndClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForPresenceOfElementAndClickable(By by)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public static void waitTillTheElementINVisible(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

}
