package iLovePDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkcode {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.ilovepdf.com/excel_to_pdf");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	WebElement test=driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
	Actions act = new Actions(driver);
	act.moveToElement(test).perform();
	Thread.sleep(2000);
	test.sendKeys("C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx");
	
	
	
//	test.sendKeys(System.getProperty("user.dir")+"src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx");
//	  try {
//          Thread.sleep(10000); 
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }

}
}