package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.switchTo().frame("moneyiframe");
	String nse	=driver.findElement(By.id("nseindex")).getText();
	System.out.println(nse);
	
		driver.switchTo().defaultContent();
//		WebElement frame2=driver.findElement(By.xpath("//iframe[@title='3rd party ad content']/ancestor::div[@id='div_advt_x01']"));
//		
//		driver.switchTo().frame(frame2);
//		String str=frame2.getText();
//		System.out.println(str);
		int siz=driver.findElements(By.tagName("iframe")).size();
		System.out.println(siz);
	//	driver.switchTo().parentFrame();
	}

}
