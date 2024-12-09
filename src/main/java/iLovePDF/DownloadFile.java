package iLovePDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id=\"accept-cookie-notification-cross-icon\"]")).click();
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("(//a[@target=\"_blank\"])[5]")).click();



}
}