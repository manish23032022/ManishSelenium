package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;  


public class ListenerDemo {
	public static	WebDriver driver;
	@Test
	public void test01() {
         driver=new ChromeDriver();
         driver.get("https://www.google.com");
		  Assert.assertEquals("test", "tevv");
	}
}
