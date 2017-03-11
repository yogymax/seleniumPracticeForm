package com.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import com.demo.util.MyConstants.MyBrowsers;
/**
 * @author Progvaltion_11
 */
public class InitializeDrivers {

/**	
 * 
 * @param typeofBrowser
 * @return
 */
	public static WebDriver initializeDrivers(MyBrowsers typeofBrowser){
		WebDriver driver =null;
		switch (typeofBrowser) {
		case Firefox:
			driver = new FirefoxDriver();
			break;
		case Chrome:
			driver = new ChromeDriver();
			break;
		case InternetExplorer:
			driver= new InternetExplorerDriver();
			break;
		case Safari:
			driver = new SafariDriver();
			break;
		default:
			Assert.fail("Expected browser is not available");
			break;
		}
		return driver;
	}

}
