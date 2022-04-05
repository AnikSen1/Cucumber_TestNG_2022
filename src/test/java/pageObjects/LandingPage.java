package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@type='search']") private WebElement searchBox;
	//By searchBox=By.xpath("//input[@type='search']");
	@FindBy(how=How.XPATH,using="//a[text()='Top Deals']") private WebElement topDealsLink;
	//By topDealsLink=By.xpath("//a[text()='Top Deals']");
	@FindBy(how=How.CSS, using="h4.product-name") private WebElement productName;
	//By productName=By.cssSelector("h4.product-name");
	@FindBy(how=How.XPATH,using="//button[text()='ADD TO CART']") private WebElement addToCartLink;
	//By addToCartLink=By.xpath("//button[text()='ADD TO CART']");
	@FindBy(how=How.CSS,using="a.increment") private WebElement increment;
	//By increment=By.cssSelector("a.increment");
	
	
	public void search(String Shortname) {
		searchBox.sendKeys(Shortname);
		//driver.findElement(searchBox).sendKeys(Shortname);
		
	}
	
	public void clickTopDeajs() {
		topDealsLink.click();
		//driver.findElement(topDealsLink).click();
		
	}
	public  String  getProductName() {
		return productName.getText();
		//return driver.findElement(productName).getText();
		
	}
	public void clickOnIncrement(int quantity) throws InterruptedException {
		
	for(int i=1; i<quantity; i++) {
		Thread.sleep(3000);
		increment.click();
		//driver.findElement(increment).click();
	}
		
		
	}
	public void clickAddToCartLink() {
		addToCartLink.click();
		//driver.findElement(addToCartLink).click();	
	}
	
	
	public  String titleOfLandingPage() {
		return driver.getTitle();
	}	
}
