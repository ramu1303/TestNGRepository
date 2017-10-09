package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class CaptureScreenshot 
{
@Test
public void screenshot() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ram");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(f, new File("./screenshots/facebooklogin2.png"));
	FileUtils.copyFile(f, new File("C:\\Users\\ram\\Desktop\\screenshot\\fb.png"));
	System.out.println("screenshot taken");
}
}
