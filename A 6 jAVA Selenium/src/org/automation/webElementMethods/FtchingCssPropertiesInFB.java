package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FtchingCssPropertiesInFB
{
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
	System.out.println("background colour :"+loginButton.getCssValue("background-color"));
	System.out.println("text color :"+loginButton.getCssValue("color"));
	System.out.println("padding :"+loginButton.getCssValue("padding"));
}
}
