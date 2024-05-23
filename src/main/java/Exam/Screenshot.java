package Exam;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/newtours/register.php");
         Thread.sleep(2000);
        driver.manage().window().maximize();
        
        File source=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        File destination = new File("C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\Screenshot\\abc.jpg");
        FileHandler.copy(source, destination);
        
	}

}
