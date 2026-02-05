package org.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//a[text()='Smartphone']/../..//input[@name='removefromcart']") private WebElement smartPhoneCartItem;
	@FindBy(xpath = "//input[@value='Update shopping cart']") private WebElement updateCartButton;
	@FindBy(name="continueshopping") private WebElement continueShoppingButton;
	@FindBy(id="termsofservice") private WebElement agrreChekBox;
	@FindBy(id="checkout") private WebElement checkoutButton;
	
	
	public ShoppingCartPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }


	public WebElement getSmaertPhoneCartItem() {
		return smartPhoneCartItem;
	}


	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}


	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}


	public WebElement getAgrreChekBox() {
		return agrreChekBox;
	}


	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public void removeSmartPhoneMethod()
	{
		smartPhoneCartItem.click();
		updateCartButton.click();
	}
}
