package pack1;

import org.testng.annotations.Test;

public class GroupDemo 
{
	@Test(groups={"sanity" , "regression"} , priority=1)
public void login()
{
	System.out.println("logged in");
}
	@Test(groups={"regression"} , priority=2)
	public void search()
	{
	System.out.println("search successfull");	
	}
	@Test(groups={"regression","sanity"} , priority=3)
	public void advancedSearch()
	{
		System.out.println("advanced search successfull");
	}
	@Test(groups={"sanity"} , priority=4)
	public void billPayment()
	{
		System.out.println("bill payment successfull");
	}
	@Test(groups={"regression", "sanity"} , priority=5)
	public void logout()
	{
		System.out.println("logged out");
	}
}
