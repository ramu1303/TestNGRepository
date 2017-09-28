package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ErrorTextCaptureDemo {
	@Test
	public void errorCapture() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		String errorMessage=driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		System.out.println(errorMessage);
		String errorMessage2=driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getAttribute("innerHTML");
		System.out.println(errorMessage2);
		driver.close();
	}
}
