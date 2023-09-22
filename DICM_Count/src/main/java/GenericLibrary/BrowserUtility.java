package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility{
    public static WebDriver driver;
    public static WebDriver OpenBrowser(WebDriver driver,String browserName,String url) throws InterruptedException, IOException
    {
        if(browserName.equalsIgnoreCase("Chrome")) 
        {
        //C:\\Users\\hp\\eclipse-workspace\\com.testautomation.konectar\\Drivers\\chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "/home/aissel/Downloads/chromedriver_linux64/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
        }
    else if(browserName.equalsIgnoreCase("firefox")) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

        return null;

}

}

