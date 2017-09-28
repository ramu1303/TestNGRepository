package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest 
{
	//@BeforeClass
	@BeforeTest
	 public void login()
	 {
		 System.out.println("logged in");
	 }
 @Test
 public void addProduct()
 {
	 System.out.println("product added");
 }
 @Test
 public void addCurrency()
 {
	 System.out.println("currency added");
 }
 @Test
 public void addCart()
 {
	 System.out.println("cart added");
 }
 @AfterTest
 public void logout()
 {
	 System.out.println("logged out");
 }
}
