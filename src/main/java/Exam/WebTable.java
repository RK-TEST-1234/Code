package Exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);

	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);

	WebElement ele = driver.findElement(By.xpath("//table[@id='customers']//th[1]"));
	
	String texts = ele.getText();
	System.out.println(texts);

	WebElement contact=driver.findElement(By.xpath("//table[@id=\"customers\"]//th[2]"));
	System.out.println(contact.getText());
	List<WebElement> concells=driver.findElements(By.xpath("//table[@id=\"customers\"]//td[2]"));
	for(WebElement concell:concells ) {
		System.out.println(concell.getText());
	}
	List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
	
	for(WebElement row:AllRows) 
	{
	String text = row.getText();
	System.out.println(text);
	}
	}

       
	
	}

