package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions cs=new ChromeOptions();
//		cs.addArguments("--headless");
//		WebDriver driver=new ChromeDriver(cs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flipkart" , Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='BYM4Nd']/descendant::div[@class='yuRUbf']/descendant::h3[text()='Flipkart']")).click();
		driver.findElement(By.name("q")).sendKeys("realme 5g",Keys.ENTER);
//		String parent=driver.getWindowHandle();
//	     driver.findElement(By.xpath("//div[contains(text(),\"realme P2 Pro 5G \")]")).click();
//	    Set<String> allwindow=driver.getWindowHandles();
//	    for(String window:allwindow) {
//	    	driver.switchTo().window(window).getTitle();
		 
		String parent=driver.getWindowHandle();
		
	//	driver.findElement(By.xpath("//div[contains(text(),'realme P2 Pro 5G')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'realme P2 Pro 5G')]/ancestor::div[@class='yKfJKb row']")).click();
		Set<String> allwindow=driver.getWindowHandles();
		for(String window:allwindow) {
		System.out.println("window id"+window.toString());
			driver.switchTo().window(window).getTitle();
			
			
		}
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
//	    	
//	    }
//		
//		driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		


	}

}
