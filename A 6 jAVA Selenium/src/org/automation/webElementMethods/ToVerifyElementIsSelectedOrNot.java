package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsSelectedOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement penCheckBox = driver.findElement(By.xpath("//input[@value='Pen' and @name]"));
		System.out.println(penCheckBox.isSelected()?"penCheckBox is selected":"penCheckBox is not selected");
		WebElement bookCheckBox = driver.findElement(By.xpath("//input[@value='Book']"));
		System.out.println(bookCheckBox.isSelected()?"bookCheckbox is selected":"bookCheckBox is not selected");
	}

}
