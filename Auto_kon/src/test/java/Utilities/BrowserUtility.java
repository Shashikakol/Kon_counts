package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility 
{
 public static WebDriver driver;
 public static WebDriver openBrowser(WebDriver driver, String Browsername, String url)
 {
	 if(Browsername.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "/home/aissel/Downloads/chromedriver_linux64/chromedriver");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(url);
		 return driver;
	 }
	 else if(Browsername.equalsIgnoreCase("firefox"))
	 {
		System.setProperty("Webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	 }
	return null;
	 
 }
}
