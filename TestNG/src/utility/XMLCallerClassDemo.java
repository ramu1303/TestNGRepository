package utility;

public class XMLCallerClassDemo {

	public static void main(String[] args) throws Exception 
	{
		
		String[][]  testDataCopy= XMLReader.XMLReaderMethod( "C:\\Users\\ram\\Desktop\\Inputdata.xlsx", "Sheet1");
		for(int i=0;i<=2;i++)
		{
			for(int k=0;k<=1;k++)
			{
			System.out.println(testDataCopy[i][k]);
			}
		}
	}

}
