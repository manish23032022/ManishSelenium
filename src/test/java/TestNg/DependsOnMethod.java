package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test( )
	public void DBconnection1() {
	   System.out.println("Script -  1");
	}
	  
	@Test(dependsOnMethods = "DBconnection1" )
	public void DBconnection2() {
		 System.out.println("Script -  2");
	}
	
	@Test(dependsOnMethods = "DBconnection2" )
	public void DBconnection3() {
		 System.out.println("Script -  3");
	}
	
}
