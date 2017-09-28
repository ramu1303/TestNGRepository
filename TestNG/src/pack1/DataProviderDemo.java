package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
	public static WebDriver driver;
	@Test(dataProvider="testData")
	public void adminLogin(String uname,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@DataProvider(name="testData")
	public static String[][] inputMethod() 
	{
	XSSFWorkbook wb=null;
	XSSFSheet sheet=null;
	try {
		File file=new File("C:\\Users\\ram\\Desktop\\Inputdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	} 
    catch (Exception e) 
	{
		
	}
	
	String[][]  testData=new String[3][2];
	for(int i=0;i<=2;i++)
	{
		for(int k=0;k<=1;k++)
		{
		testData[i][k]=sheet.getRow(i).getCell(k).getStringCellValue();
		}
	}
	return testData;
	
	}
}
