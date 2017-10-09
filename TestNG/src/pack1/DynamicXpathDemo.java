package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpathDemo 
{
	@Test
public void method()
{
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=sH_QWerYNvHx8Afd0pXgAg");
	driver.findElement(By.xpath("//a[@data-pid='23']")).click();
}
}
