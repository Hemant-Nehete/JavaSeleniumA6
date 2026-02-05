package org.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhones {
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input") private WebElement smartPhoneAddToCart;
	@FindBy(linkText = "Used phone") private WebElement usedPhoneLink;
	@FindBy(xpath = "//a[text()='Phone Cover']/../..//input") private WebElement phoneCoverAddToCart;
	@FindBy(xpath = "//p[text()='The product has been added to your ']") private WebElement productAddToCartMsg;
	

	public CellPhones(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getSmartPhoneAddToCart() {
		return smartPhoneAddToCart;
	}

	public WebElement getUsedPhoneLink() {
		return usedPhoneLink;
	}

	public WebElement getPhoneCoverAddToCart() {
		return phoneCoverAddToCart;
	}
	
	public WebElement getProductAddToCartMsg() {
		return productAddToCartMsg;
	}

}
