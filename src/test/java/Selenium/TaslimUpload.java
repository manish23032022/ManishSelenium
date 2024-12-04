package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
//import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TaslimUpload {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/upload-download");
        WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadFile']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", uploadButton);
        Robot robot = new Robot();
        robot.delay(2000); 
        driver.findElement(By.xpath("//label[text()='Select a file']")).click();
        String filePath = "C:\\Users\\Manish\\Dec.pdf";
        StringSelection filePathSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePathSelection, null);
        jse.executeScript("arguments[0].scrollIntoView(true);", uploadButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        Thread.sleep(2000); 
        robot.keyPress(KeyEvent.VK_CONTROL);  // CTRL key
        robot.keyPress(KeyEvent.VK_V);        // V key (paste)
        robot.keyRelease(KeyEvent.VK_CONTROL); // Release CTRL key
        robot.keyRelease(KeyEvent.VK_V);      // Release V key
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("File uploaded");
        Thread.sleep(10000); 
        System.out.println("Browser is closed");
       }	
	}


