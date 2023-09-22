package Counts_checking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Test
public class DisContacts_Count extends BaseClass
{

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/home/aissel/Downloads/chromedriver_linux64/chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://cardio.konectar.io");
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kon@test.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jukonec*23");
		driver.findElement(By.xpath("//input[@id='kc-login']")).click();*/
		driver.findElement(By.xpath("//div[@class='navLinkIdentify sprite_iconSet']")).click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement table = driver.findElement(By.id("//div[@class='ui-paging-info']")); 
		//List<WebElement> table = driver.findElements(By.cssSelector("div[class='frozen-div ui-state-default ui-jqgrid-hdiv'] tr:nth-child(2) th:nth-child(1)"));
		List<WebElement> rows = table.findElements(By.xpath("//div[@class='ui-paging-info'])[1])"));
		int rowCount = rows.size();
		System.out.println("Number of rows in the table: " + rowCount);
		
	
		      //  driver.get("https://example.com/paginated-list"); // Replace with your URL
		driver.findElement(By.xpath("//div[@id='rssfeed_content1']")).click();
		        int totalItemCount = 0;
		        boolean hasNextPage = true;

		        while (hasNextPage) {
		            // Count items on the current page
		            int itemCountOnPage = driver.findElements(By.cssSelector("input[value='0'][role='textbox']")).size();
		            totalItemCount += itemCountOnPage;

		            // Click the "Next" button if available
		            WebElement nextButton = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-seek-next'])[1]")); // Adjust the selector
		            if (nextButton.isEnabled()) {
		               // nextButton.click();
		            } else {
		                hasNextPage = false;
		            }
		        }

		        System.out.println("Total Item Count: " + totalItemCount);

		        driver.quit();
		    }
}

