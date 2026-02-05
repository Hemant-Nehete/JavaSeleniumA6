package org.automation.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsappTexting {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	
		 WebElement link = driver.findElement(By.xpath("//div[text()='Log in with phone number']"));
		 explicitWait.until(ExpectedConditions.elementToBeClickable(link));
		 link.click();
		 WebElement icon = driver.findElement(By.xpath("(//span[@aria-hidden='true']//*[name()='svg' and@x=\"0px\"])[2]"));
		// explicitWait.until(ExpectedConditions.presenceOfElementLocated("icon"));
		 icon.click();
		 
		//WebElement mNTF = driver.findElement(By.xpath("//input[@type='text']"));
		//mNTF.clear();
		//mNTF.sendKeys(Keys.BACK_SPACE);
		//mNTF.sendKeys("91");
	    }

}
