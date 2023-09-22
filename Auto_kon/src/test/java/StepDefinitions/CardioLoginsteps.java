package StepDefinitions;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;
import Utilities.BrowserUtility;
import Utilities.PropertiesFileReader;
import io.cucumber.java.en.Given;
import Manager.PageObjectManager;

public class CardioLoginsteps 
{
	PageObjectManager pageObjectManager;
    PropertiesFileReader obj = new PropertiesFileReader();
    WebDriver driver;
    LoginPage login;
    
    @Given("^user login to Cardio application with (.+) and (.+)$")
    public void user_login_to_Cardio_application_with_username_and_password(String username, String password) throws InterruptedException, IOException {

        Properties properties=obj.getProperty();
        driver=BrowserUtility.openBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
        pageObjectManager=new PageObjectManager(driver);
        login=pageObjectManager.getLoginPage();
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLoginButton();
  //      driver.close();
    }
}
