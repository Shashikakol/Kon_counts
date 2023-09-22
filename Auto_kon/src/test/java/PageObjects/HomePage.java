package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.BrowserUtility;



public class HomePage extends BrowserUtility
{
	@FindBy(how=How.XPATH, using="(//a[normalize-space()='Show More'])[1]")
	WebElement LinkShowMore;
	
	@FindBy(how=How.XPATH, using="//div[@id='second']")
	WebElement homePageLoad;
	
	@FindBy(how=How.XPATH, using="(//a[normalize-space()='Show More'])[2]")
	WebElement RaShowMore;
	
    WebDriver driver;
	public HomePage(WebDriver driver)
	{		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void verifyHomePageLoad() {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(homePageLoad));
			Assert.assertEquals(true, homePageLoad.isDisplayed());
			System.out.println("Home Page is loaded successfully");
		}catch(NoSuchElementException e) {
			System.out.println("Home Page is not loaded successfully");
		}
		
	}
	
	public void clickshowmorelink() throws InterruptedException
	{
		Thread.sleep(7000);
		LinkShowMore.click();	
		
	}
	public void clickrashowmorelink()
	{
		RaShowMore.click();
	}
	public void userscrolldownandup()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}


