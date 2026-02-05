package org.automation.modulerFramework;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	@FindBy(id = "gender-male") private WebElement maleRadioButton;
	@FindBy(id = "gender-female") private WebElement femaleRadioButton;
	@FindBy(id = "FirstName") private WebElement firstNameTB;
	@FindBy(id = "LastName") private WebElement lastNameTB;
	@FindBy(id = "Email") private WebElement emailTB;    	
	@FindBy(id = "Password") private WebElement passwordTB;
	@FindBy(id = "ConfirmPassword") private WebElement cpasswordTB; 
	@FindBy(id = "register-button") private WebElement registerButton;
	
	 public Register(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }

	 public WebElement getMaleRadioButton() {
		 return maleRadioButton;
	 }

	 public WebElement getFemaleRadioButton() {
		 return femaleRadioButton;
	 }

	 public WebElement getFirstNameTB() {
		 return firstNameTB;
	 }

	 public WebElement getLastNameTB() {
		 return lastNameTB;
	 }

	 public WebElement getEmailTB() {
		 return emailTB;
	 }

	 public WebElement getPasswordTB() {
		 return passwordTB;
	 }

	 public WebElement getCpasswordTB() {
		 return cpasswordTB;
	 }

	 public WebElement getRegisterButton() {
		 return registerButton;
	 }

}
