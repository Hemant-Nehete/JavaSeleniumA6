package org.generic.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pomrepository.BasePage;
import org.pomrepository.Login;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements FrameWorkConstants 
{
	public static WebDriver driver ;
	@BeforeClass
	public void browserSetUP()
	{
	    String browserValue = Flib.getPropertyValue( PROPERTIES_PATH_MAIN,"chrome");
	    String url = Flib.getPropertyValue( PROPERTIES_PATH_MAIN,"url");
	    if (browserValue.equalsIgnoreCase("chrome")) 
	    {
	    	driver = new ChromeDriver();
		}
	    else if (browserValue.equalsIgnoreCase("firefox")) 
	    {
			driver = new FirefoxDriver();
		}
	    else 
	    {
	    	driver = new EdgeDriver();
	    }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login()
	{
		String email = Flib.getPropertyValue( PROPERTIES_PATH_MAIN,"email");
		String password = Flib.getPropertyValue(PROPERTIES_PATH_MAIN,"password");
		
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		
		Login lp  = new Login(driver);
		lp.getLogiEmailTB().sendKeys(email);
		lp.getLoginPasswordTB().sendKeys(password);
		lp.getLoginButton().click();

	}
	@AfterMethod
	public void logout()
	{   
	    BasePage bp = new BasePage(driver);
		bp.getLogoutLink().click();
	}
	
	@AfterClass
	public void browserTearDown()
	{
		driver.quit();
	}

}
