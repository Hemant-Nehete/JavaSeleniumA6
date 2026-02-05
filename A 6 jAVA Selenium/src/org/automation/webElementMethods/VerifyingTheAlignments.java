package org.automation.webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTheAlignments {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	     WebElement emailTextBox = driver.findElement(By.id("email"));
         WebElement passwordTextBox = driver.findElement(By.id("passContainer"));

         Dimension emailTBSize = emailTextBox.getSize();
	     Dimension passwordTBSize = passwordTextBox.getSize();
	     Point emailTBLoc = emailTextBox.getLocation();
	     Point passwordTBLoc = passwordTextBox.getLocation();
	     
	     if(emailTBLoc.getX() == passwordTBLoc.getX())
	    	 System.out.println("left alignment is proper");
	     else
	    	 System.out.println("left alignment is improper");
	     
	     if(emailTBLoc.getX() + emailTBSize.getWidth() == passwordTBLoc.getX()+passwordTBSize.getWidth())
	    	 System.out.println("right alinment is proper");
	     else
	    	 System.out.println("right alingment is improper");
	     if(passwordTBLoc.getY()- (emailTBLoc.getY()+ emailTBSize.getHeight())>0)
	    	 System.out.println("element is not overlapping");
	     else
	    	 System.out.println("element is overlapping");
	}

}
