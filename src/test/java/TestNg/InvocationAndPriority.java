package TestNg;

import org.testng.annotations.Test;

public class InvocationAndPriority {

	 
		@Test(invocationCount = 2,priority = 1)
		public void DBconnection1() {
		   System.out.println("Script -  1");
		}
		  
		@Test(invocationCount = 2,priority = 3)
		public void DBconnection2() {
			 System.out.println("Script -  2");
		}
		
		@Test(invocationCount = 2 ,priority = 2)
		public void DBconnection3() {
			 System.out.println("Script -  3");
		}
	
}
