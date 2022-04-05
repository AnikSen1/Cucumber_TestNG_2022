package stepsRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src/test/java/features",
		glue ="stepDefinitions",
		monochrome=true,//for avoiding special character in report
		dryRun=false,	
		tags ="@PlaceOrder or @TopDeals",
		snippets=SnippetType.CAMELCASE,
plugin= {"pretty","html:target/cucumber.html", "json:target/cucumber.json",

		//for extent report
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	//for storing failed scenarios in a text file
		"rerun:target/failed_scenarios.txt"})
	
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	//This method only For parallel testing
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
