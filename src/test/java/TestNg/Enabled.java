package TestNg;

import org.testng.annotations.Test;

public class Enabled {

	@Test( )
	public void DBconnection1() {
	   System.out.println("Script -  1");
	}
	  
	@Test( )
	public void DBconnection2() {
		 System.out.println("Script -  2");
	}
	
	@Test(enabled = false )
	public void DBconnection3() {
		 System.out.println("Script -  3");
	}
	
}
