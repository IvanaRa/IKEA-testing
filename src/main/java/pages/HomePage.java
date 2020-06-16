package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	private String acceptCookies = "/html/body/div[10]/div[3]/div/div/div[2]/div/button[2]";
	private String searchField = "//input[@name='q']";
	private String searchIcon = "//span[contains(@class,'search-box__wrapper')]";
	private String logInButton = "//li[@class='hnf-header__profile-link']//span[@class='hnf-btn__copy']//*[local-name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]";
	private String cartButton = "//li[@class='hnf-header__shopping-cart-link']//a[@class='hnf-btn hnf-btn--icon-tertiary hnf-link--black']";
	private String wishListButton = "//li[@class='hnf-header__shopping-list-link']//a[@class='hnf-btn hnf-btn--icon-tertiary hnf-link--black']";
	private String chairLink = "//div[@class='range-revamp-product-compact__bottom-wrapper']//a";
	

	public WebElement getChairLink() {
		return findElement(chairLink);
	} 
	
	public WebElement getSearchField() {
		return findElement(searchField);
	}

	public WebElement getSearchIcon() {
		return findElement(searchIcon);
	}

	public WebElement getLogInButton() {
		return findElement(logInButton);
	}

	public WebElement getCartButton() {
		return findElement(cartButton);
	}

	public WebElement getWishListButton() {
		return findElement(wishListButton);
	}

	public WebElement getAcceptCookies() {
		return findElement(acceptCookies);
	}

}
