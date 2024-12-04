package TestNg;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void test1() {
		System.out.println("test1");
		int[] arr= {1,2,3};
		System.out.println(arr[5]);
	}
	
	@Test(dependsOnMethods ="test1" )
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3() {
		System.out.println("test3");
	}

}
