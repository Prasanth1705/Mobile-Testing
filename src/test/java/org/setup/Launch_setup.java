package org.setup;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class Launch_setup {

	public static AndroidDriver driver;


	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "OnePlus IN2011"); //OnePlus8 OnePlus IN2011
		caps.setCapability("appPackage", "com.instagram.android"); //com.oneplus.calculator
		caps.setCapability("appActivity", "com.instagram.mainactivity.LauncherActivity"); //com.android.calculator2.Calculator
		caps.setCapability("automationName", "uiautomator2"); // Use UiAutomator2 for
		caps.setCapability("noReset", true); // Keep app data between
		caps.setCapability("newCommandTimeout", 120); // Timeout in seconds
		URL appiumServerURL = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(appiumServerURL, caps);	        

		System.out.println("Started");

	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public AndroidDriver getDriver()
	{
		return driver;
	}

}


