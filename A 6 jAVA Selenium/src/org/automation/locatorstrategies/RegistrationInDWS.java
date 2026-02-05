package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationInDWS {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Hemant");
		driver.findElement(By.id("LastName")).sendKeys("Nehete");
		driver.findElement(By.id("Email")).sendKeys("nehetehemant2004@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hemant@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Hemant@123");
		driver.findElement(By.id("register-button")).click();
		}

}
