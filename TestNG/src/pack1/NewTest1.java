package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 
{
	/*@BeforeClass
	 public void login()
	 {
		 System.out.println("logged in");
	 }*/
	@Test
	 public void deleteProduct()
	 {
		long id=Thread.currentThread().getId();
		System.out.println("current thread :" + id);
		 System.out.println("product deleted");
	 }
	@Test
	 public void deleteCurrency()
	 {
		long id=Thread.currentThread().getId();
		System.out.println("current thread :" + id);
		 System.out.println("currency deleted");
	 }
	@Test
	 public void deleteCart()
	 {
		long id=Thread.currentThread().getId();
		System.out.println("current thread :" + id);
		 System.out.println("cart deleted");
	 }
	/*@AfterClass
	 public void logout()
	 {
		 System.out.println("logged out");
	 }*/
}
