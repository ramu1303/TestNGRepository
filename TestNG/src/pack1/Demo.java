package pack1;

import org.testng.annotations.Test;

//import properties.TestBase;

public class Demo 
{
@Test
public void method() throws Exception
{
	String data=properties.TestBase.getData("name");
	System.out.println(data);
	
	String data2=properties.TestBase.getData("place");
	System.out.println(data2);
}


}
