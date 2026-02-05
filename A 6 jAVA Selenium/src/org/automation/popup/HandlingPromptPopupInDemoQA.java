package org.automation.popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class HandlingPromptPopupInDemoQA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement button = driver.findElement(By.id("promtButton"));
		Actions actions = new Actions(driver);
		actions.scrollFromOrigin(ScrollOrigin.fromElement(button), 0, 200).perform();
		button.click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Hemant");
		alert.accept();
	}

}
