package Com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.Base.Testbase;

public class Loginpage extends Testbase {
//page factory or Object Repository
	@FindBy(xpath=".//*[@name='username']")/*.//*[@type='submit']*/
	WebElement username;
	@FindBy(xpath=".//*[@name='password']")
	WebElement password;
	@FindBy(xpath=".//*[@value='Login']")
	WebElement loginbut;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")/*//a[contains(text(),'South Africa')]*/
	WebElement singup;
	/*@FindBy(xpath="//image[(@class='img-responsive')]")
	WebElement crmlogo;*/
//Intilizing the page objects
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
//Actions
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	/*public boolean validateimage()
	{
		return crmlogo.isDisplayed();
	}*/
public Homepage loginpage(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbut.click();
		return new Homepage();
	}
	
	
	
}
