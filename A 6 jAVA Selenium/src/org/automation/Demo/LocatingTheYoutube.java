package org.automation.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatingTheYoutube {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.findElement(By.name("search_query")).sendKeys("palkhi nighali rajachi",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Mix - पालखी निघाली राजाची | Palkhi Nighali Rajachi | Lalbaugchya Rajacha Vijay Aso | Lalabugcha Raja Song']")).click();
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();

		 try {
			 WebElement skipButton = driver.findElement(By.xpath("//button[@class='ytp-skip-ad-button ytp-ad-component--clickable']"));
	            explicitWait.until(ExpectedConditions.elementToBeClickable(skipButton));
	            skipButton.click();
	           
	        } catch (TimeoutException te) {
	            
	            System.out.println("Add are skipped");
	        }

		WebElement slider = driver.findElement(By.xpath("//div[@class='ytp-progress-bar']"));
		Actions action = new Actions(driver);
		 action.dragAndDropBy(slider,100 ,0).perform();
			WebElement searchBar = driver.findElement(By.name("search_query"));
			searchBar.clear();
			searchBar.sendKeys("mumbaicha raja",Keys.ENTER);
			
			driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'गणेशगल्ली वाला माझा मुंबईचा राजा आला ')]")).click();
			driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
			driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
			action.dragAndDropBy(slider,100 ,0).perform();
			driver.findElement(By.xpath("//button[@class='ytp-button ytp-settings-button']"));
			
	//.findElement(By.xpath("(//button[@class='ytp-miniplayer-close-button ytp-button']//*[name()='svg'  ])[2]")).click();


		
	    
		
		
		
	}

}
