package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtilityclass 
{
public static void captureScreenshot(WebDriver driver, String screenshotName)
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(f, new File("./screenshots/"+screenshotName+".png"));
	} catch (Exception e) 
	{
		System.out.println(e.getMessage());
	}
}
}
