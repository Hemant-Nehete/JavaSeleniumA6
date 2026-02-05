package org.automation.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingControlToActiveElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Rohit Sharma");
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("hemantnehete");
	}

}
