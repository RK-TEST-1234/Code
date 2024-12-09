package iLovePDF;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class webtable {
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();

	
	Thread.sleep(2000);

	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	Thread.sleep(2000);

	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	
	Thread.sleep(2000);
	
	driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	
	int Size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	Thread.sleep(2000);
	
	
	System.out.println(Size);
	}
	}


