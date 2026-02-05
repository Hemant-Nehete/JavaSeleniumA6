package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsEnabledOrNot {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement textBox1 = driver.findElement(By.id("textbox1"));
		System.out.println(textBox1.isEnabled()?"textbox1 is enabled":"textbox1 is disabled");
		WebElement textBox2 = driver.findElement(By.id("tb2"));
		System.out.println(textBox2.isEnabled()?"textbox2 is enabled":"textbox2 is disabled");
	}

}
