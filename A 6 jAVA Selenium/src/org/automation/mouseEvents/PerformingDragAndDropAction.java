package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		 driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='Search Products & Brands' and @ aria-label]")).sendKeys("moiles",Keys.ENTER);
		 Thread.sleep(5000);
		 WebElement slider = driver.findElement(By.xpath("(//div[text()=' Price ']/../..//div[@class='vue-slider-dot-handle'])[1]"));
		 
		 Actions action = new Actions(driver);
		 action.dragAndDropBy(slider, 5, 0);
		 Thread.sleep(3000);
		 action.dragAndDropBy(slider, -2, 0);
		
	}

}
