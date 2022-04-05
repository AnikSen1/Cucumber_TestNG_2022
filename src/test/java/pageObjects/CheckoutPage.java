package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CSS, using="[alt='Cart']") private WebElement cartBag;
	//	By cartBag = By.cssSelector("[alt='Cart']");
	@FindBy(how=How.XPATH, using="//button[contains(text(),'PROCEED TO CHECKOUT')]") private WebElement checkOutButton;
	//	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	@FindBy(how=How.CSS, using=".promoBtn") private WebElement promoBtn;
	//	By promoBtn = By.cssSelector(".promoBtn");
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Place Order')]") private WebElement placeOrder;
	//	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

	
	
	
	public void CheckoutItems()
	{
		cartBag.click();
		checkOutButton.click();
		//driver.findElement(cartBag).click();
		//driver.findElement(checkOutButton).click();
	}
	
	public Boolean VerifyPromoBtn()
	{
		return promoBtn.isDisplayed();
		//return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean VerifyPlaceOrder()
	{
		return placeOrder.isDisplayed();
		//return driver.findElement(placeOrder).isDisplayed();
	}
	
}
