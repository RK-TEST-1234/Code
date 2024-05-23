package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/newtours/register.php");
         Thread.sleep(2000);
        driver.manage().window().maximize();
	
   
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByVisibleText("ANTARCTICA");


}

}
