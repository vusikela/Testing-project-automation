package pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bootstrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=167.0_1");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary dropdown-toggle')]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		/*if(list.get(i).getText().contains(String))
		{
			list.get(i).click();
		}*/
		}
		
	}

}
