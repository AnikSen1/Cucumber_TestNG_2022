package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LandingPage landingPage;
	public TopDealsPage topDealsPage;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}


	public LandingPage getLandingPage()
	{
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public TopDealsPage getTopDealsPage()
	{
		topDealsPage = new TopDealsPage(driver);
		return topDealsPage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
