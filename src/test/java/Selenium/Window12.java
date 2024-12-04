package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		WebElement scroll=driver.findElement(By.id("newTabBtn"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		scroll.click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			driver.switchTo().window(handle);
		
		}
		WebElement ele=driver.findElement(By.xpath("//h1[@class=\"post-title entry-title\"]"));
		System.out.println(ele.getText());
		//driver.manage().window().maximize();
		//driver.switchTo().window(parent);
		
	}

}
