package org.automation.popup;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalanderPopupDOB {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a date:");
		int date = sc.nextInt();
		System.out.println("Enter a month:");
		Thread.sleep(2000);
		String month = sc.nextLine();
	//	String month = monthtemp.charAt(0)+monthtemp.substring(1).toLowerCase();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+date+"']")).click();
	}

}
