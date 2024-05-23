package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://materializecss.com/radio-buttons.html");
         Thread.sleep(2000);
        driver.manage().window().maximize();
        
      
//        Thread.sleep(2000);
//        
//        driver.navigate().to("www.javatpoint.com");          
       
	}

}
