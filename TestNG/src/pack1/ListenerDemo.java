package pack1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(pack1.ListenerClass.class)
public class ListenerDemo 
{ 
  @Test
  public void login()
  {
	  System.out.println("logged in");
  }
}
