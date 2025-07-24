package com.BigBush.pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	    WebDriver driver;

	    public LoginPage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "email")
	    WebElement username;

	    @FindBy(id = "password")
	    WebElement password;

	    @FindBy(xpath = "//button[contains(text(), 'Sign In')]")
	    WebElement loginButton;

	    public void enterUsername(String uname){
	        username.clear();
	        username.sendKeys(uname);
	    }

	    public void enterPassword(String pass){
	        password.clear();
	        password.sendKeys(pass);
	    }

	    public void clickLogin(){
	        loginButton.click();
	    }
	}
