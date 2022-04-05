package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStep {

TestContextSetup testContextSetup;
LandingPage landingPage;

public String landingPageProductName;


public LandingPageStep(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
}
	@Given("User is on GreenCart Landing page")
public void user_is_on_green_cart_landing_page() {	
		
		Assert.assertTrue(landingPage.titleOfLandingPage().contains("GreenKart"));
}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName ) throws InterruptedException {
		
		landingPage.search(shortName);
		Thread.sleep(3000);
		testContextSetup.landingPageProductName=landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageProductName+" is extracted from Home page for "+shortName);			
}

	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity) throws NumberFormatException, InterruptedException
	{
		landingPage.clickOnIncrement(Integer.parseInt(quantity));
		landingPage.clickAddToCartLink();
	}
}
