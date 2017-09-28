package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 
{
public static WebDriver driver;

@Test(alwaysRun=true)
public void launchBrowser()
{
System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();	
}

@Test(dependsOnMethods="launchBrowser")
public void verifyGoogleTitle()
{
driver.get("http://www.google.com");
String pageTitle=driver.getTitle();
Assert.assertEquals("Google", pageTitle);
}

@Test(dependsOnMethods="verifyGoogleTitle")
public void verifyYahooTitle()
{
driver.get("http://www.yahoo.com");
String pageTitle=driver.getTitle();
Assert.assertEquals("Yahoo", pageTitle);
}

@Test(dependsOnMethods="verifyYahooTitle")
public void closeBrowser()
{
	driver.close();
}
}
