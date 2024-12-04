package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Head {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriverManager.chromedriver().setup(); // Set up WebDriver
         ChromeOptions cs = new ChromeOptions();
         cs.addArguments("--headless"); // Run in headless mode
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.name("q")).sendKeys("men");
         Thread.sleep(4000);
         List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"x6GwIv _2Ipp17\"]"));
         for(WebElement e: list) {
        	 System.out.println(e.getText());
         }
         
         
	}
}
