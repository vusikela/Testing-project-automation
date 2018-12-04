package Com.CRM.QA.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.crm.qa.Base.Testbase;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;

public class Homepagetest extends Testbase {
Loginpage loginpage;
Homepage homepage;
	public Homepagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() 
	{
		 inisilization();
		 loginpage=new Loginpage();
		  homepage=loginpage.loginpage(prop.getProperty("username"), prop.getProperty("password"));
		  /*String homepagetitle=homepage.homepagetitle();
			Assert.assertEquals(homepagetitle, "CRMPRO","home page title not matched");*/
	}
	
	@Test
	public void verifyhomepagetitiletest()
	{
		String homepagetitle=homepage.homepagetitle();
		Assert.assertEquals(homepagetitle, "CRMPRO","home page title not matched");
	}
	
	
	
	
	
	
	
}
