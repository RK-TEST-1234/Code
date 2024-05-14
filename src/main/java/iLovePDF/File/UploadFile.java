package iLovePDF.File;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 
		File uploadFile = new File("C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
}
}