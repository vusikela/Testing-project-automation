package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class3 {

	@Test(dataProvider="passdata")//this test case is dependent on the dataprovider, whose name is worl prress data.
	public void openapp( String un, String pwd) throws InterruptedException 
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:facebook.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("un");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("pwd");
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}
	
	@DataProvider
	public Object[][] passdata()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="9951564048";
		data[0][1]="9951424220";
		
		data[1][0]="9951264048";
		data[1][1]="99514f24220";
		
		data[2][0]="9951564048";
		data[2][1]="995142a4220";
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
