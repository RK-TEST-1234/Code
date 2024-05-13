package iLovePDF;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;
public class uploadDownload {

	    public static void main(String[] args) throws InterruptedException {

	    	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

//	        driver.get("https://www.ilovepdf.com/excel_to_pdf");
//	        
//	        driver.get("https://www.ilovepdf.com/png_to_pdf");
//	        
//	       driver.get("https://www.ilovepdf.com/pdf_to_jng");
//	        
	        driver.get("https://www.ilovepdf.com/word_to_pdf");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//	        WebElement test = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//	        test.sendKeys(System.getProperty("user.dir"+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\EvilTester Testcases.xlsx"));

	        
//	        WebElement test = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//	        test.sendKeys(System.getProperty("user.dir"+"C:\Users\RK\eclipse-workspace\iLovePDF\src\main\java\iLovePDF\Diagram.png"));
	        

//	        WebElement test = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//	        test.sendKeys(System.getProperty("user.dir"+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\dummy-pdf_2.pdf"));

//	        WebElement test = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
//	        test.sendKeys(System.getProperty("user.dir"+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\dummy-pdf_2.docx"));

	        WebElement test = driver.findElement(By.xpath("//a[@id=\"pickfiles\"]"));
	        test.sendKeys(System.getProperty("user.dir"+"C:\\Users\\RK\\eclipse-workspace\\iLovePDF\\src\\main\\java\\iLovePDF\\dummy-pdf_2.docx"));


	        try {
	            Thread.sleep(10000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
//	        WebElement downloadButton = driver.findElement(By.id("download-button"));
//	        downloadButton.click();
//
//	        // Wait for some time to allow file download process to complete
//	        try {
//	            Thread.sleep(5000); // Adjust sleep time as needed
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//
//	        // Check if the file has been downloaded successfully
//	        File downloadedFile = new File("C:\\\\\\\\Users\\\\\\\\RK\\\\\\\\Desktop\\\\\\\\EvilTester Testcases.xlsx");
//	        if (downloadedFile.exists()) {
//	            System.out.println("File downloaded successfully.");
//	        } else {
//	            System.out.println("Failed to download the file.");
//	        }
//
//	        // Close the browser
//	        driver.quit();
//	    }
//	}

