package Exam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
	
	Thread.sleep(2000);

	driver.get("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement element=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[3]/div/table"));
	
	String text= element.getText();
	System.out.println(text);

	WebElement element1=driver.findElement(By.xpath("//*[@id=\"customers\"]"));
	System.out.println(element1.getText());

	WebElement element2=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th[1]"));
	
	System.out.println(element2.getText());
	}

}
