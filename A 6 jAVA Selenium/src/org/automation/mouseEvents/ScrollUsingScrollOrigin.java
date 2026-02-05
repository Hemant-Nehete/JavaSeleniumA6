package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollUsingScrollOrigin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");
		WebElement target = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Actions actions = new Actions(driver);
		ScrollOrigin scrollOrigin = ScrollOrigin.fromElement(target);
		actions.scrollFromOrigin(scrollOrigin, 0, 200).perform();
		target.click();
		//actions.scrollFromOrigin( ScrollOrigin.fromElement(target), 0, 250).perform();
	}

}
