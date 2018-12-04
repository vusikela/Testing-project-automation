package pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadrivenfr 
{
	
	@DataProvider(name="data")
		 
	public Object[][] getdata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] data=new Object[0][6];
		
		FileInputStream fis=new FileInputStream("D:\\\\Automation.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 int st=wb.getSheetIndex("Sheet1");
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheetAt(st);
		int rc=s.getLastRowNum();
		for( int i=0;i<=rc;i++)
		{
			Row r=s.getRow(i);
			int cc=r.getLastCellNum();
			for(int j=0;j<cc;j++)
			{
				Cell c=r.getCell(j);
				
				Object numaric = data;
				if(c.equals(numaric))
				{
					data[i][j]=c.getStringCellValue();	
				}
				else
				{
					data[i][j]=c.getStringCellValue();	
				}
			
				
				
			}}
		return data;
			}

		
	
@Test(dataProvider="data")
public void regst(String fn,String ln,String un,String pwd,String email,String mob) throws InterruptedException, IOException
{
	
	WebDriver driver=new FirefoxDriver();

	
	driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
	driver.findElement(By.xpath(".//*[@type='add']")).click();
	driver.findElement(By.name("FirstName")).sendKeys(fn);
	driver.findElement(By.name("LastName")).sendKeys(ln);
	driver.findElement(By.name("UserName")).sendKeys(un);
	driver.findElement(By.xpath(".//*[@type='password']")).sendKeys(pwd);
	driver.findElement(By.xpath(".//*[@type='radio']")).click();
	Select os=new Select(driver.findElement(By.xpath(".//*[@name='RoleId']")));
	os.selectByValue("0");
	driver.findElement(By.name("Email")).sendKeys(email);
	driver.findElement(By.name("Mobilephone")).sendKeys(mob);
	driver.findElement(By.xpath(".//*[@class='btn btn-success']")).click();
	}
	}
/*driver.get("http://facebook.com");
driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys(un);
driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys(pwd);
driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(td);

driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();*/