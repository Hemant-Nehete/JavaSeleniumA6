package org.automation.BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Motorola {
  @Test
  public void launchingEdge40()
  {   
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.motorola.in/smartphones-motorola-edge-40/p?skuId=363");
	  Reporter.log("launched edge 40", true);
  }
}
