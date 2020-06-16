package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

import browser.Browser;

public class LogInTest extends BaseTest {

	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://www.ikea.com/rs/sr/");
		Browser.getBrowser().manage().window().maximize();
	}

	@Test
	public void successfullLogInTest() {
		ikea.getHomePage().getLogInButton().click();
		ikea.getLogInPage().getEmailField().sendKeys("ivanaracic994@gmail.com");
		ikea.getLogInPage().getPasswordField().sendKeys("034382979Ir");
		ikea.getLogInPage().getSignInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertEquals("Zdravo, Ivana!", ikea.getLogInPage().getGreetMessage().getText());
	}

	@Test
	public void invalidEmailTest() {
		ikea.getHomePage().getLogInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ikea.getLogInPage().getEmailField().sendKeys("ivanaracic994gmail.com");
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ikea.getLogInPage().getPasswordField().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(ikea.getLogInPage().getErrorEmail().isDisplayed());

	}

	@Test
	public void invalidPasswordTest() {
		ikea.getHomePage().getLogInButton().click();
		ikea.getLogInPage().getEmailField().sendKeys("ivanaracic994@gmail.com");
		ikea.getLogInPage().getPasswordField().sendKeys("034382979");
		ikea.getLogInPage().getSignInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(ikea.getLogInPage().getErrorPassword().isDisplayed());
	}

	@Test
	public void logInWithoutEmalAndPasswordTest() {
		ikea.getHomePage().getLogInButton().click();
		ikea.getLogInPage().getSignInButton().click();
		Browser.getBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(ikea.getLogInPage().getNoEmailError().isDisplayed()
				&& ikea.getLogInPage().getNoPasswordError().isDisplayed());

	}
}
