package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 
{
	public static WebDriver driver;
	//@BeforeMethod
	@BeforeClass
	public void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();	
	}
	@Test
	public void verifyFlipkartTitle()
	{
	driver.get("http://www.flipkart.com");
	Assert.assertEquals("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More", driver.getTitle());
	}
	@Test
	public void verifyGoogleTitle()
	{
	driver.get("http://www.google.com");
	String pageTitle=driver.getTitle();
	Assert.assertEquals("Google", pageTitle);
	}
	@Test
	public void verifyYahooTitle()
	{
	driver.get("http://www.yahoo.com");
	String pageTitle=driver.getTitle();
	Assert.assertEquals("Yahoo", pageTitle);
	}
	//@AfterMethod
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
