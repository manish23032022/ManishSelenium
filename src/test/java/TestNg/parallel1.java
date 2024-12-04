package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel1 {
	WebDriver driver;
	   @Test
	   public void test01() {
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com");
	   }
	   
	   @Test
	   public void test02() {
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   
	   }
}
