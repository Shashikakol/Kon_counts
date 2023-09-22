package Manager;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.LoginPage;

public class PageObjectManager 
{
	    public WebDriver driver;
	    LoginPage loginPage;
	    HomePage homePage;
	    
	    public PageObjectManager(WebDriver driver) 
	    {
	        this.driver = driver;
	    }
	    

	    public LoginPage getLoginPage() {
	        return (loginPage==null) ? loginPage = new LoginPage(driver):loginPage;
	    }
	    public HomePage getHomePage() {
	        return (homePage==null) ? homePage = new HomePage(driver):homePage;
	    }
	 
}
