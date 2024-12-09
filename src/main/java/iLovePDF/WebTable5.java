package iLovePDF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable5 {
	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		Thread.sleep(2000);

		driver.get("https://www.w3schools.com/html/html_tables.asp");
	
		Thread.sleep(2000);

		for (int i = 2; i <= 7; i++) 
	
		{
	
			for (int j = 1; j <= 3; j++) 
	{
	
				WebElement Alldata = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
	
				String text = Alldata.getText();
	
				System.out.print(text+" ");
	}
	
			    System.out.println();
	}
	}

}
