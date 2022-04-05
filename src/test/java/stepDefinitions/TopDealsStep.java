package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.TopDealsPage;
import utils.TestContextSetup;

public class TopDealsStep {

TestContextSetup testContextSetup;
LandingPage landingPage;
TopDealsPage topDealsPage;

public String topDealsPageProductName;
public String landingPageProductName;

//Spring framework, EJB, 
//Single responsibilty Principle
//loosly coupled
//Factory Design Pattern

public TopDealsStep(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	landingPage=testContextSetup.pageObjectManager.getLandingPage();
	topDealsPage  =testContextSetup.pageObjectManager.getTopDealsPage();
}

@Then("^user searched for (.+) shortname in top deals page$")
public void user_searched_for_same_shortname_in_top_deals_page(String shortName) throws InterruptedException {

	switchToTopDealssPage();
	
	Assert.assertEquals(topDealsPage.TopDealsPageUrl(), "https://rahulshettyacademy.com/seleniumPractise/#/offers");
	topDealsPage.searchItem(shortName);
	Thread.sleep(2000);
	topDealsPageProductName = topDealsPage.getProductName();
	System.out.println(topDealsPageProductName+" is extracted from Top Deals page for "+shortName);	
	
		
}

public void switchToTopDealssPage()
{
	landingPage.clickTopDeajs();
	testContextSetup.genericUtils.SwitchWindowToChild();
	
	
	
}
@Then("validate product name in top deals page matches with Landing Page")
public void validate_product_name_in_top_deals_page()
{
	Assert.assertEquals(topDealsPageProductName, testContextSetup.landingPageProductName);
}
}
