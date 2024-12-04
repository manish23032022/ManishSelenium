package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup(); // Set up WebDriver
         ChromeOptions cs = new ChromeOptions();
         cs.addArguments("--headless"); // Run in headless mode
         WebDriver driver = new ChromeDriver(cs);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(3000);
		//List<WebElement> list=driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));
	//	List<WebElement> list=driver.findElements(By.xpath("span[text()='iphone']"));
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		//li[@class='_3D0G9a']
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getText());
			System.out.println(e.getSize());
		}
		// driver.quit();
		
	}

}
