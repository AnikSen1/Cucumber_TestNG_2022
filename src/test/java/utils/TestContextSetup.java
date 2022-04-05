package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public BaseClass baseClass;
	public GenericUtils genericUtils;

	
	public TestContextSetup() throws IOException
	{
		baseClass = new BaseClass();
		genericUtils = new GenericUtils(baseClass.WebDriverManager());
		pageObjectManager = new PageObjectManager(baseClass.WebDriverManager());
	}
}
