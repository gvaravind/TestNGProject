package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AOE_CartPage 
{
	//Find by Account
	@FindBy(id ="mainfrm:endusercsn")
	private WebElement enduserAccount;
	
	@FindBy(id ="mainfrm:doopensearchaccount")
	private WebElement findbyaccount;
	
	//Create Account
	@FindBy(id ="mainfrm:doenduserfindbutton")
	private WebElement createaccount;
	
	@FindBy(id ="accountform:accounttypeid")
	private WebElement accounttype;
	
	@FindBy(id ="accountform:nameid")
	private WebElement cmpnyname;
	
	@FindBy(id ="accountform:add1id")
	private WebElement aadres1;
	
	@FindBy(id ="accountform:cityid")
	private WebElement city;

	@FindBy(id ="accountform:stateid")
	private WebElement state;
	
	@FindBy(id ="accountform:zipid")
	private WebElement zipcode;
	
	@FindBy(id ="accountform:saveaccountid")
	private WebElement submit;
	
	//Confirm Address
	@FindBy(id ="acctcnfrmform:overwriteaccountid")
	private WebElement confirmAddrs;

	//Search Account 
	@FindBy(id ="doadvacctsearchbutton")
	private WebElement searchaccount;
	
	@FindBy(id ="accountform:nameid")
	private WebElement scmpnyname;
	
	@FindBy(id ="accountform:saveaccountid")
	private WebElement searchAcc;
	
	public AOE_CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void eu_FindByAccount(String i)
	{
		
		enduserAccount.sendKeys(i);
		findbyaccount.click();
		
	}
	
	public void eu_CreateAccount() throws InterruptedException
	{
		createaccount.click();
		Thread.sleep(2000);
		Select acctyp = new Select(accounttype);
		acctyp.selectByVisibleText("End User");
		Thread.sleep(2000);
		cmpnyname.sendKeys("EMRtesting");
		Thread.sleep(1000);
		aadres1.sendKeys("4676 Adonais Way");
		Thread.sleep(1000);
		city.sendKeys("Norcross");
		Thread.sleep(1000);
		Select ste = new Select(state);
		ste.selectByValue("GA");
		Thread.sleep(1000);
		zipcode.sendKeys("30071");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(2000);
		confirmAddrs.click();
		Thread.sleep(2000);
		
	}
	public void searchAcc()
	{
		searchaccount.click();
		scmpnyname.sendKeys("PC_");
		searchAcc.click();
	}

}
