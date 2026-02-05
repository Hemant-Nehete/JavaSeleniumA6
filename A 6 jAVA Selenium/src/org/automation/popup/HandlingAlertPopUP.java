package org.automation.popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopUP {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
	}

}
