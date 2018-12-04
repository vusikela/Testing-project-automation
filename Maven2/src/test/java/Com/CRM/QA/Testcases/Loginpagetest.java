package Com.CRM.QA.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.crm.qa.Base.Testbase;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;

public class Loginpagetest extends Testbase
{
	Loginpage loginpage;
	Homepage homepage;
	//This constructor is used to the call the super constructor
	public Loginpagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup() 
	{
		 inisilization();
		 loginpage=new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpagetitletest() {
		 String title=loginpage.validateloginpagetitle();
		 Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	/*@Test(priority=2)
	public void crmlogotest() 
	{
		boolean folat=loginpage.validateimage();
		Assert.assertTrue(folat);
	}*/
	@Test(priority=3)
	public void logintest()
	{
		homepage=loginpage.loginpage(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	/*@AfterMethod
	public void shutdown() {
		driver.quit();
	}*/
}
