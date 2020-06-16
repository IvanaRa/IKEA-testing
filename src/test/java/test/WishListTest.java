package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import browser.Browser;

public class WishListTest extends BaseTest {

	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
		Browser.getBrowser().manage().window().maximize();
		ikea.getHomePage().getAcceptCookies().click();
	}

	@Test
	public void addToWishListTest() {
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		ikea.getHomePage().getChairLink().click();
		ikea.getChairPage().click(ikea.getChairPage().getAddToWishListButton());
		ikea.getHomePage().getWishListButton().click();
		assertTrue(ikea.getChairPage().getChairDescriptionLabelWishList().isDisplayed());

	}

}
