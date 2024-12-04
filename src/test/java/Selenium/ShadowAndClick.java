package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ShadowAndClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");
		WebElement book=driver.findElement(By.xpath("//book-app"));
		SearchContext root=book.getShadowRoot();
		//root.findElement(By.cssSelector("app-header>app-toolbar.toolbar-top>button>svg")).click();
		root.findElement(By.cssSelector("app-header>app-toolbar.toolbar-top>button.signin-btn>svg")).click();
		 

	}

}
