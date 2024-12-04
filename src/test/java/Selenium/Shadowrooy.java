package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shadowrooy {
   public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
	 driver.get("https://www.google.com");
	 JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search=(WebElement)
				js.executeScript("return document.querySelector('ntp-app').shadowRoot.querySelector('cr-most-visited').shadowRoot.querySelector('div#container > div[title=\"Gmail\"]')");
			    js.executeScript("arguments[0].click();", search);
}
}
