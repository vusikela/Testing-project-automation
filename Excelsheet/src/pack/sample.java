package pack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample 
{
	
	@Test
	public void openapp()

	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.findElement(By.xpath(".//*[@type='add']")).click();
		driver.findElement(By.name("FirstName")).sendKeys("sathi");
		driver.findElement(By.name("LastName")).sendKeys("vusike");
		driver.findElement(By.name("UserName")).sendKeys("675vusisat");
		driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("23456");
		driver.findElement(By.xpath(".//*[@type='radio']")).click();
		Select os=new Select(driver.findElement(By.xpath(".//*[@name='RoleId']")));
		os.selectByValue("0");
		driver.findElement(By.name("Email")).sendKeys("vusike123@gmail.com");
		driver.findElement(By.name("Mobilephone")).sendKeys("9951564048");
		driver.findElement(By.xpath(".//*[@class='btn btn-success']")).click();
		
		
		
		
		
	}

}
