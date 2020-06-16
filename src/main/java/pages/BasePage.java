package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class BasePage {
	
	/**
	 * pokusava da dohvati element i validira ga da li je upotrebljiv ako nije 10
	 * puta pokusava maksimalno da ga dohvati na ovaj nacin smo se izolovali od
	 * brzine kojom browser prikazuje/webdriver dohvata elemente
	 * 
	 * @param xpath
	 * @return
	 */
	
	public WebElement findElement(String xpath) {
		try {
			return getElement(xpath);
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public WebElement click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		return element;
	}

	private WebElement getElement(String xpath) {
		WebElement element = null;
		for (int i = 1; i <= 10; i++) {
			Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			element = Browser.getBrowser().findElementByXPath(xpath);
			if (element.isEnabled() && element.isDisplayed()) {
				return element;
			}
		}
		return element;
	}
}
