package org.automation.webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTheEmailEnteredInFBLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String email = "nehetehemant2004@gmail.com";
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.clear();
		System.out.println(emailTextBox.getAttribute("class"));
		emailTextBox.sendKeys(email);
		String enteredEmail = emailTextBox.getAttribute("value");
		if(email.equals(enteredEmail))
		System.out.println("email has been enter");
		else 
			System.err.println("email has been not enter");
	
	}

}
