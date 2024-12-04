package TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 
         // Maximize the window
         driver.manage().window().maximize();
         driver.get("https://facebook.com/");
         
         

         // Convert web driver object to TakeScreenshot
         TakesScreenshot ts = (TakesScreenshot) driver;
        

         // Call getScreenshotAs method to create image file
         File srcFile = ts.getScreenshotAs(OutputType.FILE);
         
    //      //Move image file to new destination

        // File DestFile=new File("C:\\Users\\Manish\\Pictures\\screenshot\\serr"+System.currentTimeMillis()+".png");
         File DestFile=new File("C:\\Users\\Manish\\Pictures\\Screenshot2.png");

         //Copy file at destination

         FileUtils.copyFile(srcFile, DestFile);

         // close the current browser
         driver.quit();
   
	}

}
