package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XMLReader 
{
	public static String[][] XMLReaderMethod(String filename,String sheetName) throws Exception
	{
	File f = new File( filename);
	FileInputStream fis = new FileInputStream(f);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(sheetName);
	
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
