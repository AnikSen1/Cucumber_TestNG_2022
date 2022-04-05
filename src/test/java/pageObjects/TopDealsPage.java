package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopDealsPage {

	public WebDriver driver;

	public TopDealsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH, using="//input[@type='search']") private WebElement searchBox;
	//private By searchBox = By.xpath("//input[@type='search']");
	@FindBy(how=How.CSS, using="tbody tr td:nth-child(1)") private WebElement productName;
	//private By productName = By.cssSelector("tbody tr td:nth-child(1)");
	
	
	public void searchItem(String name)
	{
		searchBox.sendKeys(name);
		//driver.findElement(searchBox).sendKeys(name);
	}
	
	public void getSearchText()
	{
		searchBox.getText();
		//driver.findElement(searchBox).getText();
	}
	
	public String getProductName()
	{
		return productName.getText();
		//return driver.findElement(productName).getText();
	}
	
	public String TopDealsPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
