package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultiSelectClassDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		List<WebElement> list=driver.findElements(By.xpath("//select[@title='Day']/option"));
		
		
		
		for(WebElement e :list) {
			System.out.println(e.getText());
			if(e.getText().equals("2")) {
				e.click();
				//break;
			}
		}
	}

}
