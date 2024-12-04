package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parent=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> allwind=driver.getWindowHandles();
		for(String window:allwind) {
			driver.switchTo().window(window).getTitle();
		}
		WebElement web=driver.findElement(By.xpath("//button[text()='Book a Free Demo']/ancestor::div[@id='navbarSupportedContent']"));
	
		System.out.println(web.getText());
		driver.switchTo().window(parent);
	}

}
