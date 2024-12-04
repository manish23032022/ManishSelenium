package TestNg;

import org.testng.annotations.Test;

public class AlwaysRun {

	@Test( )
	public void DBconnection1() {
	   System.out.println("Script -  1");
	}
	  
	@Test( )
	public void DBconnection2() {
		 System.out.println("Script -  2");
	}
	
	@Test(alwaysRun = true)
	public void DBconnection3() {
		 System.out.println("Script -  3");
	}
	
}
