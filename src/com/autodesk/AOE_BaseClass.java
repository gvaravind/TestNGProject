package com.autodesk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AOE_BaseClass 
{
	WebDriver driver;
	String url = "http://ussclsetomaoe01.autodesk.com:8080/IOrder/partner?uid=5125286630-67976119&PartnerCenter=Yes";
	
	@BeforeClass
	public void browserinvoike()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
//	@AfterClass
//	public void browserclose()
//	{
//		driver.close();
//	}
	
	@BeforeMethod
	public void urlinvoke()
	{
		driver.get(url);
		
	}

	@AfterMethod
	public void review()
	{
		Reporter.log("review order", true);
	}
}
