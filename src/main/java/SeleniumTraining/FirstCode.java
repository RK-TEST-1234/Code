package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/login/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("mailis@gmail.com");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Password@1234"); 
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
      //div[@id="u_0_4_hd"]
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
        
        Thread.sleep(2000);
        
        driver.close();
        
	
	}
	

}
