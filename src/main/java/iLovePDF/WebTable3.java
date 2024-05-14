package iLovePDF;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable3 {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		Thread.sleep(2000);
	
		List<WebElement> columnSize = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		
	
		// int Size = columnSize.size();
	
		// System.out.println(Size);
	
		// List<WebElement> columnSize = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
	
		// System.out.println(columnSize.size());

		int Size = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th")).size();
	
		System.out.println(Size);
	}
	}
