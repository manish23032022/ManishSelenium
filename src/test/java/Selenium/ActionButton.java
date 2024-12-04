package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class ActionButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement right=driver.findElement(By.id("rightClickBtn"));
		js.executeScript("arguments[0].scrollIntoView(true)", right);
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		System.out.println("done action");
		
		//JavascriptExecutor js1=(JavascriptExecutor) driver;
	//	js1.executeScript("arguments[0].ScrollIntoView(true)" ,right);
		

	}

}
