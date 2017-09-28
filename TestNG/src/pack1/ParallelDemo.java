package pack1;

import org.testng.annotations.Test;

public class ParallelDemo 
{
	
	@Test
	 public void login()
	 {
		long id=Thread.currentThread().getId();
		System.out.println("current thread :" + id); 
		System.out.println("logged in");
		 
	 }
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
	@Test
	 public void logout()
	 {
		long id=Thread.currentThread().getId();
		System.out.println("current thread :" + id);
		 System.out.println("logged out");
	 }
}
