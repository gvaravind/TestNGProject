package com.autodesk;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Pages.AOE_CartPage;
import Pages.AOE_Homepage;

public class AOE_OrderCreation extends AOE_BaseClass
{

	@Test (priority=1, description= "Order with Existing Account and Contact",enabled=false)
	public void CreateOrder_With_ExistingAccount_Contact() throws InterruptedException 
	{
		String aHTitle = driver.getTitle();
		String eHTitle = "Welcome to Autodesk IOrder";
		Assert.assertEquals(aHTitle, eHTitle);
		Reporter.log("AOE HOME Page Successfully Loaded & It's Title: "+aHTitle , true);
		
		AOE_Homepage hp= new AOE_Homepage(driver);
		hp.SelectOrdertype(3);
		Thread.sleep(2000);
		
		Reporter.log("Selected the Order type 3", true);
		
		String aCTitle = driver.getTitle();
		String eCTitle = "Autodesk Shopping Cart";
		Assert.assertEquals(aCTitle, eCTitle);
		
		Reporter.log("Autodesk Shopping Cart loaded Successfully", true);
		
		AOE_CartPage cp = new AOE_CartPage(driver);
		cp.eu_FindByAccount("5125295164");
		int eutext = (driver.findElement(By.id("mainfrm:existingEndUserAcctLine1")).getText()).length();
		Assert.assertTrue(eutext>0, "Account found Successfully");
		Reporter.log("Account found Successfully", true);
	}
	
	@Test (priority=2, description= "Order with new Account and Contact",enabled=false)
	public void CreateOrder_With_NewAccount_Contact() throws InterruptedException 
	{
		String aHTitle = driver.getTitle();
		String eHTitle = "Welcome to Autodesk IOrder";
		Assert.assertEquals(aHTitle, eHTitle);
		Reporter.log("AOE HOME Page Successfully Loaded & It's Title: "+aHTitle , true);
		
		AOE_Homepage hp= new AOE_Homepage(driver);
		hp.SelectOrdertype(3);
		Thread.sleep(2000);
		
		Reporter.log("Selected the Order type 3", true);
		
		String aCTitle = driver.getTitle();
		String eCTitle = "Autodesk Shopping Cart";
		Assert.assertEquals(aCTitle, eCTitle);
		
		Reporter.log("Autodesk Shopping Cart loaded Successfully", true);
		
		AOE_CartPage cp = new AOE_CartPage(driver);
		cp.eu_CreateAccount();
		
		//Getting the Created Account length to ensure it is success
		int eutext = (driver.findElement(By.id("mainfrm:existingEndUserAcctLine1")).getText()).length();
		Assert.assertTrue(eutext>0, "Account found Successfully");
		Reporter.log("Account Created Successfully", true);
	}
	
	@Test (priority=3, description= "SearchAccount")
	public void searchaccount() throws InterruptedException 
	{
		String aHTitle = driver.getTitle();
		String eHTitle = "Welcome to Autodesk IOrder";
		Assert.assertEquals(aHTitle, eHTitle);
		Reporter.log("AOE HOME Page Successfully Loaded & It's Title: "+aHTitle , true);
		
		AOE_Homepage hp= new AOE_Homepage(driver);
		hp.SelectOrdertype(3);
		Thread.sleep(2000);
		
		Reporter.log("Selected the Order type 3", true);
		
		AOE_CartPage cp = new AOE_CartPage(driver);
		cp.searchAcc();
	}
	
}

