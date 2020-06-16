package main;

import browser.Browser;
import pages.Ikea;

public class Main {

	public static void main(String[] args) {

		Ikea ikea = new Ikea();
		Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
		ikea.getHomePage().getSearchField().clear();
		ikea.getHomePage().getSearchField().sendKeys("FRIHETEN fotelja");
		Browser.getBrowser().quit();
	}

}
