package PageObjects;

import java.io.IOException;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BrowserUtility;

public class LoginPage extends BrowserUtility
{
	@FindBy(how=How.ID, using="username")
	WebElement txtUsername;

	@FindBy(how=How.ID, using="password")
	WebElement txtPassword;

	@FindBy(how=How.ID, using="kc-login")
	WebElement btnLogin;

	@FindBy(how=How.XPATH, using="//div[@class='navLinkHome sprite_iconSet activeIcon']")
	WebElement tabHome;
	//WebDriver driver;

	@FindBy(how=How.XPATH, using="//td[contains(text(),'Invalid username or password')]")
	WebElement invalidLogin;

	@FindBy(how=How.XPATH, using="//*[contains(text(),'SYSTEM')]|(//*[contains(text(),'USER')])[2]")
	WebElement homePageLoad;


	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String username)
	{
		txtUsername.sendKeys(username);

	}

	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);

	}

	public void clickLoginButton() throws IOException, InterruptedException
	{
		 StopWatch pageLoad = new StopWatch();
		    pageLoad.start();
		    btnLogin.click();
		    WebDriverWait wait = new WebDriverWait(driver, 60);
		    wait.until(ExpectedConditions.visibilityOf(homePageLoad));
		    pageLoad.stop();
		    //Get the time
		    long pageLoadTime_ms1 = pageLoad.getTime();
		    long pageLoadTime = pageLoadTime_ms1 / 1000;
		    System.out.println("Total Page Load Time for Home Page: " + pageLoadTime + " seconds");      
		
	}
	public void verifyHomeTab()
	{
		
		if(tabHome.isDisplayed())
		{
			System.out.println("Cardio login is successfully");
		}
		else
		{
			System.out.println("Cardio login is not successfully");
		}
	}
	public void verifyInvalidLogin()
	{
			
			System.out.println("Invalid username or password");
	}
	}

