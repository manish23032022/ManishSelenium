package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		String s=driver.getTitle();
		System.out.println(s);
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("E:\\manishWedding\\screenshot.png");
		FileUtils.copyFile(src, dst);
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("manish");
		WebElement daylist=driver.findElement(By.id("day"));
		Select s2=new Select(daylist);
		//s2.selectByIndex(10);
	//	s2.selectByValue("25");
		s2.selectByVisibleText("24");
		
		WebElement monthlist=driver.findElement(By.id("month"));
		Select s3=new Select(monthlist);
		//s3.selectByIndex(3);
	//	s3.selectByValue("Feb");
		s3.selectByVisibleText("Feb");
		
		
		//driver.close();

	}

}
