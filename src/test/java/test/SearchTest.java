package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import browser.Browser;

public class SearchTest extends BaseTest {

	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
		Browser.getBrowser().manage().window().maximize();
	}

	@Test
	public void checkTheSearchIconTest() {
		ikea.getHomePage().getSearchField().sendKeys("m");
		assertTrue(ikea.getHomePage().getSearchIcon().isDisplayed());
	}

	@Test
	public void searchingForParticularItemTest() {
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		ikea.getHomePage().getSearchIcon().click();
		assertTrue(ikea.getHomePage().getChairLink().isDisplayed());
	}
}
