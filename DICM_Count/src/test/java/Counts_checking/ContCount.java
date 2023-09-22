package Counts_checking;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContCount 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "/home/aissel/Downloads/chromedriver_linux64/chromedriver"); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://cardio.konectar.io");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kon@test.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jukonec*23");
	driver.findElement(By.xpath("//input[@id='kc-login']")).click();
	driver.findElement(By.xpath("//div[@class='navLinkMyKolsIn sprite_iconSet']")).click();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	/*
	WebElement table = driver.findElement(By.id("//div[@class='ui-paging-info']")); 
	//List<WebElement> table = driver.findElements(By.cssSelector("div[class='frozen-div ui-state-default ui-jqgrid-hdiv'] tr:nth-child(2) th:nth-child(1)"));
	List<WebElement> rows = table.findElements(By.xpath("//div[@class='ui-paging-info'])[1])"));
	int rowCount = rows.size();
	System.out.println("Number of rows in the table: " + rowCount);*/
	 List<WebElement> link = driver.findElements(By.xpath("//table[@class='listResultSet']"));
	    int count = link.size();

	    WebElement w = link.get(count-1);
	    w.click();
	    
	      int totalItemCount = 0;
	        boolean hasNextPage = true;

	        while (hasNextPage) {
	            // Count items on the current page
	        	int itemCountOnPage = driver.findElements(By.cssSelector(".listResultSet")).size();
	            totalItemCount += itemCountOnPage;

	            // Click the "Next" button if available
	            WebElement nextButton = driver.findElement(By.linkText("Next")); // Adjust the selector
	            // Adjust the selector
	            if (nextButton.isEnabled()) {
	                nextButton.click();
	            } else {
	                hasNextPage = false;
	            }
	        }

	        System.out.println("Total Item Count: " + totalItemCount);

	        driver.quit();
}
}
