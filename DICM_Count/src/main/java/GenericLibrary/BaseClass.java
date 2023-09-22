package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pageobject.LoginPage;



public class BaseClass 
{
	//create object of all utilities
    
  //  public    ExcelFileUtility eLib= new ExcelFileUtility();
   // public    JavaUtility jLib= new JavaUtility();
    public    PropertyFileUtility pLib= new PropertyFileUtility();
    public    BrowserUtility wLib= new  BrowserUtility();
    public    WebDriver driver =null;
    public static WebDriver driver1;

 
    public void launchTheBrowser() throws Throwable
    {
        //read data from property
    	String BROWSER = pLib.readDataFromPropertyFile("browser");
    	 String URL = pLib.readDataFromPropertyFile("url");
         
        
        //create runtime Polymorphism
        if(BROWSER.equalsIgnoreCase("chrome"))
        {
            //WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        else if(BROWSER.equalsIgnoreCase("firefox"))
        {
           // WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }
        else
        {
            System.out.println("invalid browser");
        }
        driver1= driver;
        driver.get(URL);
    }
    public void login() throws Throwable
    {
        String USERNAME = pLib.readDataFromPropertyFile("username");
        String PASSWORD = pLib.readDataFromPropertyFile("password");
        LoginPage lp = new LoginPage(driver);
        lp.loginToApp(USERNAME, PASSWORD);
    }
    public void logout()
    {
     //   HomePage hp= new HomePage(driver);
      //  hp.signOutOfApp(driver);
    }
    public void closeBrowser()
    {
        driver.quit();
       
    }
    public void closeDb()
    {
       
    }
}
