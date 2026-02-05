package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class PerformingScrollingToDraggable {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable/");
	WebElement droppable = driver.findElement(By.xpath("//span[text()='Droppable']"));
	Actions actions = new Actions(driver);
	actions.scrollFromOrigin(ScrollOrigin.fromElement(droppable), 0, 200).perform();
	
}
}
