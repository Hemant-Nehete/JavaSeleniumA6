package org.automation.locatorstrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingXpathByLogicalAndOR {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemant%20Nehete/Downloads/XpathLogicalAnd.html");
	WebElement firstnametextbox = driver.findElement(By.xpath("//input[@id='f-name' or @name='first' ]"));
	firstnametextbox.clear();
	firstnametextbox.sendKeys("Hemant");
	driver.findElement(By.xpath("//input[@name='gender' and @value='M']")).click();
	}

}
