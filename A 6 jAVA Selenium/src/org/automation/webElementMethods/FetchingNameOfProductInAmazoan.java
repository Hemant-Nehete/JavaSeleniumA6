package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingNameOfProductInAmazoan {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trending lighters");
	driver.findElement(By.id("nav-search-submit-button")).click();
WebElement productName = driver.findElement(By.xpath("//span[contains(text(),'Metal Gold')]"));
  String product   = productName.getText();	
  System.out.println(product);
}
}
