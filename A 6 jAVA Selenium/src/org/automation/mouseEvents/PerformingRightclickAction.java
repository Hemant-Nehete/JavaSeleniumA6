package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightclickAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
		WebElement splitPDF = driver.findElement(By.linkText("SPLIT PDF"));
		Actions actions = new Actions(driver);
		//actions.contextClick(splitPDF).perform();
		actions.moveToElement(splitPDF).contextClick().perform();
	}

}
