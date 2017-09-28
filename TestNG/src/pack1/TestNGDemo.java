package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo 
{
@Test
public void verifyTitle()
{
System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
String pageTitle=driver.getTitle();
Assert.assertEquals("Google", pageTitle);
}
}
