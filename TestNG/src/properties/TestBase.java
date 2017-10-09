package properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class TestBase 
{
static Properties prop;
public static void loadData() throws Exception
{
	prop=new Properties();
	File f=new File("../TestNG/src/properties/file1.properties");
	FileReader fr=new FileReader(f);
	prop.load(fr);
}
public static String getData(String data) throws Exception
{
	loadData();
	String s1=prop.getProperty(data);
	return s1;
}
}
