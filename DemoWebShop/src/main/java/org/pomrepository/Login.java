package org.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id = "Email") private WebElement logiEmailTB;
	@FindBy(id = "Password") private WebElement loginPasswordTB;
	@FindBy(id = "RememberMe") private WebElement remembermeCB;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPassLink;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	
	 public Login(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }

	 public WebElement getLogiEmailTB() {
		 return logiEmailTB;
	 }

	 public WebElement getLoginPasswordTB() {
		 return loginPasswordTB;
	 }

	 public WebElement getRemembermeCB() {
		 return remembermeCB;
	 }

	 public WebElement getForgotPassLink() {
		 return forgotPassLink;
	 }

	 public WebElement getLoginButton() {
		 return loginButton;
	 }

	
}
