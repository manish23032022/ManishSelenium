package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOverAction {

	  public static void main(String[] args) {
	  

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.amazon.in/");
	        
	        WebElement ele=driver.findElement(By.xpath("//span[text()='Account & Lists']"));

	        
	        Actions actions = new Actions(driver);
	        actions.moveToElement(ele).perform();
	        WebElement ele2=driver.findElement(By.xpath("//div[@class=\"nav-flyout-content nav-flyout-accessibility\" and contains(.,'Sign in')]/a/span[text()='Sign in']"));
	        System.out.println(ele2.getText());
	        driver.quit();
	    }

}
