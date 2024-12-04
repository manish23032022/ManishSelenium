package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");
		WebElement book=driver.findElement(By.xpath("//book-app"));
		SearchContext root=book.getShadowRoot();
		//root.findElement(By.xpath("//app-header/app-toolbar[2]/book-input-decorator/input")).sendKeys("tenali rama",Keys.ENTER);
		//root.findElement(By.cssSelector("input#input")).sendKeys("tenali rama",Keys.ENTER);
		
		//this one is also right
		root.findElement(By.cssSelector("app-header>app-toolbar.toolbar-bottom>book-input-decorator>input#input")).sendKeys("tenali rama",Keys.ENTER);

	}

}
