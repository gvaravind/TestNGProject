package Pages;

import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AOE_Homepage
{

	@FindBy(id ="orderlinks:ordersearch")
	private WebElement Ordertype;

	
	public AOE_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectOrdertype(int i)
	{
		Select se = new Select(Ordertype);
		se.selectByIndex(i);
	}
}
