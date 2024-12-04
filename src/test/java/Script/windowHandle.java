package Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		driver.manage().window().maximize();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow" + parentwindow );
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement scroll=driver.findElement(By.id("newTabsWindowsBtn"));
		js.executeScript("arguments[0].scrollIntoView(true);",scroll );
		scroll.click();
		
		Set<String> handles=driver.getWindowHandles();
		for(String handle: handles) {
			
			System.out.println(handle);
			//driver.findElement(By.id("firstName")).sendKeys("manish");
		}
		
		
	}

}
