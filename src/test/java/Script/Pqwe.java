package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//*****
// ***
//  *

//  *
//  **
//  ***

public class Pqwe {
	
	  static int  a=10;

	public static void main(String[] args) {
		
			
	
			//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.crossover.com/blog/top-10-in-demand-programming-languages-for-2024");
			WebElement list=driver.findElement(By.xpath("//ul[@class='list']"));
	//	String s=list.getText();
		//System.out.println(s);
		//TakesScreenshot ts=(TakesScreenshot) driver();
		   TakesScreenshot ts = (TakesScreenshot) driver;
//		Pqwe pa=new Pqwe();
//		System.out.println(a);
		
		

	}

}
