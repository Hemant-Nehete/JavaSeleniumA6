package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PerformingClickAndHoldAndRelease {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemant%20Nehete/Downloads/DragDrop.html");
		
		Actions actions = new Actions(driver);
		WebElement capital = driver.findElement(By.xpath("//div[text()='Washington']"));
		WebElement country = driver.findElement(By.xpath("//div[text()='United States']"));
		actions.clickAndHold(capital).release(country).perform();
		
        
        


        
	}
}