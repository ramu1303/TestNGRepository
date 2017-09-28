package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
	@Test(priority=1)
	public void method1()
	{
	String name="ramu patil";
	SoftAssert obj=new SoftAssert();
	System.out.println("test started");
	Assert.assertTrue(name.contains("ram") , "matching the names");
	System.out.println("test completed");
	obj.assertAll();
	}
	
	@Test(priority=2 ,dependsOnMethods="method1")
	public void hardAssert()
	{
		String name="ramu patil";
		System.out.println("test started");
		Assert.assertTrue(name.contains("app") , "matching the names");
		System.out.println("test completed");
		
	}
}
