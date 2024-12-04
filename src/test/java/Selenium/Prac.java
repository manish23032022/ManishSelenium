package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crossover.com/blog/top-10-in-demand-programming-languages-for-2024");
		List<WebElement> list=driver.findElements(By.xpath("//li[@class=\"list-item ng-star-inserted\"]"));
		for(WebElement e:list) {
			System.out.println(e.getText());
		}
	
	}

}
