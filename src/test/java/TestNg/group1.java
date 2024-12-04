package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class group1 {
	WebDriver driver;
	   @Test(groups = "smoke")
	   public void test01() {
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com");
	   }
	   
	   @Test
	   public void test02() {
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
//		   uite name="Suite">
//			<groups>
//				<run>
//					<include name="smoke"></include>
//				</run>
//			</groups>
//		  <test thread-count="5" name="Test">
//		    <classes>
		   
	   }
}
