package com.BugBush.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	

	@CucumberOptions(
		    features = "src/test/resources/Features/Login.feature",
		    glue = "com.BugBush.stepDefinitions",
		    plugin = {
		        "pretty", "html:target/HtmlReports/cucumber.html",
		        "pretty", "json:target/JSONReports/cucumber.json"
		    },
		    monochrome = true
		)

	public class loginTestRunner extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	

 
}
