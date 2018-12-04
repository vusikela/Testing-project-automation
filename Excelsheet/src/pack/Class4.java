package pack;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class4 
{
	@Test
	public void openapp() throws IOException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.ilabquality.com/");
		driver.findElement(By.xpath(".//*[@id='menu-item-1373']/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'South Africa')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Senior Test Automation Specialist – Johannesburg')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='wpjb-scroll']/div[1]/a")).click();
		Thread.sleep(4000);
		
		/*driver.findElement(By.xpath(".//*[@id='applicant_name']")).sendKeys("un");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pwd");
		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("9951564048");
		driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("something");*/
		
		driver.findElement(By.xpath(".//*[@id='wpjb-upload-browse-file']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\SATHISH\\Desktop\\auto1.exe");
		
		driver.findElement(By.xpath(".//*[@id='wpjb_submit']")).click();
	}
	

}
