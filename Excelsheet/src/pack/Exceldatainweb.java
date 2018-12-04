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
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Exceldatainweb 
{
	@DataProvider(name="wordpressdata")
	public Object[][] getdata() throws Exception 
	{
		
		Object[][]data=new Object[1][6];
		FileInputStream fis =new FileInputStream("D:\\Automation.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int st=wb.getSheetIndex("sheet1");
		org.apache.poi.ss.usermodel.Sheet s=wb.getSheetAt(st);
		int rowc=s.getLastRowNum();
		for(int i=0;i<=rowc;i++)
		{
			Row r=s.getRow(i);
			int cellc=r.getLastCellNum();
			
			for(int j=0; j<cellc;j++ )
				{
				Cell cc=r.getCell(j);
				data[i][j]=cc.getRichStringCellValue();
				}
		}
		return data;
		}
		
		@Test(dataProvider ="wordpressdata")
		public void openapp(String un,String pwd) throws Exception
		{
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://facebook.com");
			driver.manage().window().maximize();
			Sleeper.sleepTightInSeconds(3000);
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("un");
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pwd");
			
			driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
			
		}
			
	
	
	
	
	
	
	


