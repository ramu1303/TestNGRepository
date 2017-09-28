package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	static WebDriver driver;
	@Test
	@Parameters(value="browser")
	public void verifyTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		
		driver.get("http://learn-automation.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
