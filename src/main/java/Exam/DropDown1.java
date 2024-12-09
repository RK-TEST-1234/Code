package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
    	driver.get("http://jsbin.com/osebed/2");
         Thread.sleep(2000);
        driver.manage().window().maximize();
        
    	Select fruits = new Select(driver.findElement(By.id("fruits")));
    	fruits.selectByVisibleText("Banana");
    	fruits.selectByIndex(1);
	
	}

}
