package pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {

	private String emailField = "//input[@id='username']";
	private String passwordField = "//input[@id='Password']";
	private String signInButton = "//button[@class='btn btn--transactional']";
	private String greetMessage = "//h1[@id='profile-page-headline']";
	private String errorEmail = "//span[contains(text(),'i imejl ili broj telefona')]";
	private String errorPassword = "//p[contains(text(),'e ne! Molimo te da proveri')]";
	private String noEmailError = "//span[contains(text(),'IKEA.rs te ne prepoznaje... jo')]";
	private String noPasswordError = "//span[contains(text(),'emo da te prijavimo bez lozinke.')]";

	public WebElement getEmailField() {
		return findElement(emailField);
	}

	public WebElement getPasswordField() {
		return findElement(passwordField);
	}

	public WebElement getSignInButton() {
		return findElement(signInButton);
	}

	public WebElement getGreetMessage() {
		return findElement(greetMessage);
	}

	public WebElement getErrorEmail() {
		return findElement(errorEmail);
	}

	public WebElement getErrorPassword() {
		return findElement(errorPassword);
	}

	public WebElement getNoEmailError() {
		return findElement(noEmailError);
	}

	public WebElement getNoPasswordError() {
		return findElement(noPasswordError);
	}

}
