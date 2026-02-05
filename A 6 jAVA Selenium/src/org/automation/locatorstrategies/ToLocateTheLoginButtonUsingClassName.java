package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLoginButtonUsingClassName {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("nehetehemant2004@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Hemant@123");
    driver.findElement(By.cssSelector("input[value='Log in']")).click();
    driver.findElement(By.linkText("Log out")).click();
}
}
