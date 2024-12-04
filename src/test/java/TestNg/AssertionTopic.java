package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTopic {
    @Test 
	public void test01() {
		
    	System.out.println("Script test01  line 01");
    	Assert.assertEquals("Hello", "Hell");  // stop the execution  jump from current block to another block
    	System.out.println("Script test01  line 02");
    	System.out.println("Script test01  line 03");
	}
	
    @Test
	public void test02() {
    	System.out.println("Script test02  line 01");
    	SoftAssert soft=new SoftAssert();
    	soft.assertEquals("Hello", "Hell");
    	
    	System.out.println("Script test02  line 02");
    	System.out.println("Script test02  line 03");
    	soft.assertAll();
    	
	}
    
    @Test(enabled = false)
   	public void test03() {
    	System.out.println("Script test03  line 01");
    	Assert.assertEquals("Hello", "Hello");
    	System.out.println("Script test03  line 02");
    	System.out.println("Script test03  line 03");
   	}
}
