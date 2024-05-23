package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Thread.sleep(2000);
    
   WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
    
    Thread.sleep(2000);
    
    Select sel = new Select(day);
    sel.selectByIndex(25);
    

}}
