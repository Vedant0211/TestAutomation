package com.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.logging.log4j.ThreadContext;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import com.qa.reports.ExtentReport;

public class BaseTest {
	protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal <AppiumDriver>();
	protected static ThreadLocal <Properties> props = new ThreadLocal <Properties>();
	//protected static DesiredCapabilities cap;
	protected static ThreadLocal <HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
	
	public AppiumDriver getDriver() {
		return driver.get();
	} 

	public void setDriver(AppiumDriver driver2) {
		driver.set(driver2);
	}
	public Properties getProps() {
		return props.get();
	} 

	public void setProps(Properties props2) {
		props.set(props2);
	}
	public HashMap<String,String> getStrings() {
		return strings.get();
	} 

	public void setStrings(HashMap<String,String> strings2) {
		strings.set(strings2);
	}
	// Initializing drivers and other utiles files config file, property file, ect.
	// aslo define coman method click method, sendkey method, gettext method, isdisplay method, ect. 

	@BeforeTest
	@Parameters({"platformName" , "platformVersion" , "deviceName","udid","systemPort","chromeDriverPort"})
	public void beforeTest(String platformName, String platformVersion, String deviceName, @Optional String udid,@Optional String systemPort,@Optional String chromeDriverPort) throws Exception {
		
		
		Properties props = new Properties();
			AppiumDriver driver;
			URL url;
			InputStream inputStream = null;
			InputStream stringsis = null;
			try {
			props =new Properties();
			String propFileName= "config.properties";
			String xmlFileName = "string/strings.xml"; 
			
			inputStream =getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);
			setProps(props);

			
			stringsis= getClass().getClassLoader().getResourceAsStream(xmlFileName);
			setStrings(getStrings());
	
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("platformName", platformName);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			cap.setCapability("platformVersion", platformVersion);
			cap.setCapability("udid", udid);
			cap.setCapability("automationName", props.getProperty("androidAutomationName"));
			cap.setCapability("appPackage", props.getProperty("androidAppPackage"));
			cap.setCapability("appActivity", props.getProperty("androidAppActivity"));
			//cap.setCapability("appActivity", "com.mindsarray.pay1.ui.intro.LanguageSplashActivity");
			cap.setCapability(MobileCapabilityType.FULL_RESET, false);
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
		//	cap.setCapability("autoGrantPermissions", "true");
		//	cap.setCapability("autoAcceptAlerts", "true");
			//options.AddAdditionalCapability("fullReset", "true");
			cap.setCapability("systemPort", systemPort);
			cap.setCapability("chromeDriverPort", chromeDriverPort);
			cap.setCapability("unicodeKeyboard", true);
			cap.setCapability("resetKeyboard", false);
			cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			cap.setCapability("autoAcceptAlerts", true);
		//	cap.setCapability("connectHardwareKeyboard", false);
		//	cap.setCapability("unicodeKeyboard", false);



			url =new URL(props.getProperty("appiumURL")/*+"/wd/hub"*/);
			//System.out.println(url);
			//driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver = new AndroidDriver(url, cap);
				
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
			
	}
	
	public void WaitForVisibility(WebElement e) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);		
		wait.until(ExpectedConditions.visibilityOf(e));	
	}
	
	public void click(WebElement e) {
		WaitForVisibility(e);
		e.click();
	}
	public void isDisplayed(WebElement element) {
        WaitForVisibility(element);
	}
	
	public void sendKeys(WebElement e, String txt) {
		WaitForVisibility(e);
		e.sendKeys(txt);
	}
	
	public String getText(WebElement e) {
		WaitForVisibility(e);
		String text=e.getText();
		return text;
	}
}
