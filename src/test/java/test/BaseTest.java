package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import browser.Browser;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import pages.Ikea;

public class BaseTest {

	protected static Ikea ikea;

	@BeforeClass
	public static void setup() {
		ikea = new Ikea();
		ChromeDriverManager.chromedriver().setup();
	}

	@AfterClass
	public static void cleanUp() {
		Browser.getBrowser().quit();
	}
	
}
