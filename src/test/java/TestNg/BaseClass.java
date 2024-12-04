package TestNg;


import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
   
	@BeforeSuite
	public void DBconnection1() {
	  System.out.println("DB connection");
	}
	  
	@BeforeTest
	public void parallelStrat() {
		 System.out.println("Parelle start");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		 System.out.println("launch browser");
	}
	
	@BeforeMethod
	public void Login() {
		 System.out.println("Login");
	}
	
	@Test
	public void Script1() {
		System.out.println("Script 1 ");
	}
	
	@Test
	public void Script2() {
		System.out.println("Script 2 ");
	}
	
	@AfterMethod
	public void logout() {
		 System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		 System.out.println("Close Browser");
	}
	
	@AfterTest
	public void endParallel() {
		 System.out.println("end parallel");
	}
	
	@AfterSuite
	public void DBconnectionClose() {
		 System.out.println("DB Connection Close");
	}
}
