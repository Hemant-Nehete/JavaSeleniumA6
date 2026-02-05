package org.automation.modulerFramework;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_RemoveAddToCart_002 extends BaseTest {
	@Test
	public void removingProductFromCart()
	{
		BasePage bp = new BasePage(driver);
		  bp.getElectronicsLink().click();
		  
		  Electronics ep = new Electronics(driver);
		  ep.getCellPhoneLink().click();
		  
		  CellPhones cp = new CellPhones(driver);
		  cp.getSmartPhoneAddToCart().click();
		  
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(cp.getProductAddToCartMsg().isDisplayed(), true, "Product is not added to cart!!");
		  
		  
		  bp.getShoppingCartLink().click();
		  
		  ShoppingCartPage scp = new ShoppingCartPage(driver);
		  scp.removeSmartPhoneMethod();
		  try {
		    sa.assertEquals(  scp.getSmaertPhoneCartItem().isDisplayed(),false);
		  } catch (NoSuchElementException e) {
		     Reporter.log("product remove from cart",true);
		  }
           sa.assertAll();
	}

}
