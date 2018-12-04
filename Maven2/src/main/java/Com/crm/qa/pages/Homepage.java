package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.Base.Testbase;

public class Homepage extends Testbase 
{
	
	@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
	WebElement usernaelabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactkslink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	//Intilizing the page objects
		public  Homepage ()
		{
			PageFactory.initElements(driver, this);
		}
	//Actions
	public String homepagetitle()
		{
			return driver.getTitle();
		}
	
	public Contactspage contacts()
	{
		 usernaelabel.click();
		 return new Contactspage();
	}
	
	public Detailspage dealslinka()
	{
		dealslink.click();
		 return new Detailspage();
	}
	
	public Tasklinkpage tasklink()
	{
		taskslink.click();
		 return new Tasklinkpage();
	}
	
	
	
}
