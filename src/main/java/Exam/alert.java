package Exam;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {
	
	public static void main(String[] args) throws InterruptedException  {									
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
        
        driver.get("https://demo.guru99.com/test/delete_customer.php");			
                            		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
       
        Alert alert = driver.switchTo().alert();		
        		
        String alertMessage= driver.switchTo().alert().getText();		
        		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        alert.accept();		
    }	

}
