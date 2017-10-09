package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo 
{
@Test
public void method1()
{
String name="ramu patil";
Assert.assertTrue(name.contains("z") , "matching the names");
System.out.println("test completed");

}
}
