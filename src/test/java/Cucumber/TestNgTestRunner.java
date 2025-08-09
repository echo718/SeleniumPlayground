package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Cucumber", glue = "stepDefinitions", 
	monochrome = true, tags = "@Regression", 
	plugin = {
		"html:target/cucumber.html", 
		//"pretty",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
