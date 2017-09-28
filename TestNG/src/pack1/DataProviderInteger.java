package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataProviderInteger {

	public static void main(String[] args) throws Exception
	{
		File f=new File("C:\\Users\\ram\\Desktop\\Integerwps.xls");
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheet("Sheet1");
	    int[][] intArray=new int[6][3];
	    for(int i=0;i<=5;i++)
	    {
	    	for(int k=0;k<=2;k++)
	    	{
	    		intArray[i][k]=(int)sheet.getRow(i).getCell(k).getNumericCellValue();
	    		System.out.print(intArray[i][k]);
	    		System.out.print(" ");
	    	}
	    	
	    	System.out.println();
	    }
	    fis.close();
	}

}
