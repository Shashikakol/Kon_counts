package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends GenericLibrary.BrowserUtility
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
	public void loginToApp(String uSERNAME, String pASSWORD) {
		
		
	}
	}
