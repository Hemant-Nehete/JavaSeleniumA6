package org.automation.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PerformingDragAndDroping {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemant%20Nehete/Downloads/DragDrop.html");
		WebElement  oslo= driver.findElement(By.id("box1"));
		WebElement stock = driver.findElement(By.id("box2"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement  copen= driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));
	
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement unitedstate= driver.findElement(By.id("box103"));
        WebElement denmark= driver.findElement(By.id("box104"));
        WebElement southkorea = driver.findElement(By.id("box105"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain= driver.findElement(By.id("box107"));
        
        Thread.sleep(3000);
        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(washington, unitedstate).perform();
        actions.dragAndDrop(seoul, italy).perform();
        actions.dragAndDrop(rome, norway).perform();
        actions.dragAndDrop(oslo, denmark).perform();
        actions.dragAndDrop(stock, spain).perform();
        actions.dragAndDrop(madrid, southkorea).perform();
        actions.dragAndDrop(copen, sweden).perform();
        
        


        
	}
}