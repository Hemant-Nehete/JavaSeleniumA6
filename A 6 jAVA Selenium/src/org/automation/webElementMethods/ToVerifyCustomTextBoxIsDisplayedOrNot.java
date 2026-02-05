package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCustomTextBoxIsDisplayedOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
		WebElement customGenderTB = driver.findElement(By.id("custom_gender"));
		if (!customGenderTB.isDisplayed()) {
			driver.findElement(By.xpath("//label[text()='Custom']/input")).click();
		}
		customGenderTB.sendKeys("LGBTQ+");
	}

}
