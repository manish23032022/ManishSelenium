package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("chrome://downloads/");
//		WebElement root=driver.findElement(By.xpath("//downloads-manager"));
//		SearchContext root1=root.getShadowRoot();
//		//root1.findElement(By.cssSelector("cr-toast-manager > downloads-toolbar > cr-toolbar > cr-toolbar-search-field > #searchInput")).sendKeys("hello");
//        root1.findElement(By.cssSelector("searchTerm#prompt")).sendKeys("hello");
		
		
		
		driver.get("https://books-pwakit.appspot.com/");
		WebElement book=driver.findElement(By.xpath("//book-app"));
		SearchContext root=book.getShadowRoot();
		//root.findElement(By.xpath("//app-header/app-toolbar[2]/book-input-decorator/input")).sendKeys("tenali rama",Keys.ENTER);
		root.findElement(By.cssSelector("input#input")).sendKeys("tenali rama",Keys.ENTER);

	}

}
