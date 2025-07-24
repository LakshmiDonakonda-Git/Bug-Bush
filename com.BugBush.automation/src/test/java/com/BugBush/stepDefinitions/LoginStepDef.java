package com.BugBush.stepDefinitions;


import com.BigBush.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class LoginStepDef {
	
	    WebDriver driver;
	    LoginPage LoginPage;

	    @Given("User is on login page")
	    public void user_is_on_login_page() {
	    
	        System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://bugbash.syook.com/");
	        LoginPage = new LoginPage(driver);
	    }

	    @When("User enters {string} and {string}")
	    public void user_enters_and(String uname, String pass) {
	        LoginPage.enterUsername(uname);
	        LoginPage.enterPassword(pass);
	        LoginPage.clickLogin();
	    }

	    @Then("Appropriate message should be displayed")
	    public void appropriate_message_should_be_displayed()  throws InterruptedException {
	        Thread.sleep(2000); // Use WebDriverWait in real project
	        String currentUrl = driver.getCurrentUrl();

	        if (currentUrl.contains("dashboard")) {
	            System.out.println("Login Successful");
	            Assert.assertTrue(true);
	        } else {
	            boolean error = driver.getPageSource().contains("Invalid email or password. Try: admin@shophub.com / admin123");
	            System.out.println("Login Failed - Error : " + error );
	            Assert.assertTrue(error, "Expected error message not displayed");
	        }

	        driver.quit();
	    }
	}

