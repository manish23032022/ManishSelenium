package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class group2 {

	WebDriver driver;
	   @Test (groups = "regression")
	   public void test01() {
		  driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com");
	   }
	   
	   @Test(groups = "smoke")
	   public void test02() {
		   driver=new ChromeDriver();
		   driver.get("https://www.amazon.in");
		   
	   }
}
