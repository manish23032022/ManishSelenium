package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> name = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr[*]/td[1]"));
		List<WebElement> email=driver.findElements(By.xpath("//table[@class='tg']/tbody/tr[*]/td[3]"));
		System.out.println(name);
		int i=0;
		for(WebElement e :name) {
			System.out.println(e.getText()+"  "+email.get(i++).getText());
		}
		
		

	}

}
