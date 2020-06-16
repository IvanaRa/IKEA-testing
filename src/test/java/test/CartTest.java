package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class CartTest extends BaseTest {

	int testFlag = 0;

	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
		Browser.getBrowser().manage().window().maximize();
		if (ikea.getHomePage().getAcceptCookies() != null) {
			ikea.getHomePage().getAcceptCookies().click();
		}
	}

	@After
	public void emptyCart() {
		if (testFlag == 1 || testFlag == 2 || testFlag == 3) {
			Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
			ikea.getHomePage().click(ikea.getHomePage().getCartButton());
			ikea.getChairPage().click(ikea.getChairPage().getRemoveFromCartButton());
		}
	}

	@Test
	public void addItemToCartTest() {
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		testFlag = 1;
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
			ikea.getChairPage().getCloseCartPopUpButton().click();
		}
		ikea.getHomePage().getCartButton().click();
		assertTrue(ikea.getChairPage().getChairDescriptionLabel().isDisplayed());
	}

	@Test
	public void increaseItemsQuantityInCartTest() {
		testFlag = 2;
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
        ikea.getChairPage().getCloseCartPopUpButton().click();
		}
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
	        ikea.getChairPage().getCloseCartPopUpButton().click();
		}
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
	        ikea.getChairPage().getCloseCartPopUpButton().click();
		}
		ikea.getHomePage().getCartButton().click();
		assertEquals("38.997 RSD", ikea.getChairPage().getChairTripledPriceLabel().getText());
	}

	@Test
	public void checkOutTest() {
		testFlag = 3;
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
      }
		ikea.getHomePage().click(ikea.getHomePage().getCartButton());
		ikea.getChairPage().click(ikea.getChairPage().getCheckOutButton());
		new WebDriverWait(Browser.getBrowser(), 2);
		String  value = ikea.getChairPage().getYourOrderDetails().getText();
		assertEquals("1 × FRIHETEN", value);
	}

	@Test
	public void deleteItemFromCartTest() {
		testFlag = 4;
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().click(ikea.getHomePage().getChairLink());
		ikea.getChairPage().click(ikea.getChairPage().getAddToCartButton());
		if (ikea.getChairPage().getCloseCartPopUpButton() != null) {
	        ikea.getChairPage().getCloseCartPopUpButton().click();
		}
		ikea.getHomePage().getCartButton().click();
		ikea.getChairPage().getRemoveFromCartButton().click();
		ikea.getHomePage().getCartButton().click();
		assertEquals("Tvoja korpa za kupovinu je trenutno prazna",
				ikea.getChairPage().getYourCartIsEmptyMessage().getText());
	}

}
