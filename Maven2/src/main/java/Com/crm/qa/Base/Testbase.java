package Com.crm.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Com.crm.qa.Utilites.TestUtil;

public class Testbase  {
public static WebDriver driver;
 public static Properties prop;
	
 public Testbase()  
	{ 
  try 
     {
		 prop= new Properties();
		FileInputStream fis=new FileInputStream("D:\\SatPP\\Maven2\\src\\main\\java\\Com\\crm\\qa\\Config\\config1.properties");
        prop.load(fis);
     }
catch(FileNotFoundException e)
	     {
		e.printStackTrace();
	     }
catch(IOException e)
	{
    e.printStackTrace();}
  //System.out.println(prop.getProperty("username"));
	}
public static void inisilization()
{
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SATHISH\\Desktop\\All Documents//chromedriver.exe");
	driver=new ChromeDriver();
	}else if(browsername.equals("firefox"))
	{
	driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPICT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}
	
	
	
	
	
	
	
	
	
}
