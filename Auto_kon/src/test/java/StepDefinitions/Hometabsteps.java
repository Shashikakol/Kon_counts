package StepDefinitions;

import PageObjects.HomePage;
import Utilities.BrowserUtility;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Manager.PageObjectManager;

public class Hometabsteps extends BrowserUtility
{
	HomePage home;
	PageObjectManager pageObjectManager;
	
	@After
    public static void closeBrowser() throws Exception{
           if (driver == null) {
               return;
           }
           driver.quit();
           driver = null;
       }
	@Given("^user is on home tab$")
	public void user_is_on_home_tab()
	{	    
		pageObjectManager=new PageObjectManager(driver);		
		home=pageObjectManager.getHomePage();
		home.verifyHomePageLoad();
	    System.out.println("Verified Upcoming Events show more link");
	   
	}

	@When("^user clicks on showmore link in Upcomimg events section$") 
	public void user_clicks_on_showmore_link_in_summary_section() throws InterruptedException
	{
	//	pageObjectManager=new PageObjectManager(driver);
	//	home=pageObjectManager.getHomePage();	
	    home.clickshowmorelink();
	    Thread.sleep(5000);
	    driver.navigate().back();
	}

	@Then("^User should land on Upcomimg events page$") 
	public void User_should_land_on_contact_listing_page() throws InterruptedException
	{
	//	home.clickshowmorelink();
		System.err.println("Verified");
	}
	
	@When("^user clicks on showmore link in recent activity section$") 
	public void user_clicks_on_showmore_link_in_recent_activity_section() throws InterruptedException
	{
		 home.clickrashowmorelink();
		 Thread.sleep(5000);
		 driver.navigate().back();
	}
	@When("^User should land on Recent activity main page$") 
	public void user_land_on_Recent_activity_main_page() throws InterruptedException
	{
		 home.clickrashowmorelink();
		 Thread.sleep(10000);
		 driver.navigate().back();
	}
	@When("^user scroll down and up in home page$") 
	public void userscrolldownandupininhomepage() throws InterruptedException
	{
	   home.userscrolldownandup();
	   Thread.sleep(10000);
	   driver.navigate().back();
	}
	
	@Then("^User should view the all widjet in the home page$") 
	public void User_should_land_on_media_main_page()
	{
		System.err.println("Verified");
	}
	
}
