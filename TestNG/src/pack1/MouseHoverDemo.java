package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
public static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.className("_160X"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[1]/div/div/div/div/div/a[2]/span")).click();
		
	}

}
