package iLovePDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class demo {
	
	public static void main(String[] args, Object uploadFile) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/excel-to-pdf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement file=driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]"));
		
	//	file.sendKeys(uploadFile.getAbsolutePath());
	//	file.sendKeys(System.getProperty(("user.dir"), "C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx"));
		
		//file.sendKeys(System.getProperty("user.dir")+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx");
		  try {
	            Thread.sleep(10000); 
	        } catch (InterruptedException e) {
	          e.printStackTrace();
	        }
//		WebElement dis=driver.findElement(By.xpath("//span[@class=\"sc-8s01yt-4 dNifye\"]")).sendKeys("C:\\\\Users\\\\RK\\\\eclipse-workspace\\\\iLovePDF\\\\src\\\\main\\\\java\\\\iLovePDF\\\\EvilTester Testcases.xlsx");

	//	Actions sct= new Actions(driver);
//		sct.dragAndDrop(file, dis);
	
	}

}
