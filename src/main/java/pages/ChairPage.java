package pages;

import org.openqa.selenium.WebElement;

import browser.Browser;

public class ChairPage extends BasePage {

	private String addToCartButton = "//button[@class='range-revamp-btn range-revamp-btn--transactional']//span[@class='range-revamp-btn__label'][contains(text(),'Dodaj u korpu')]";
	private String addToWishListButton = "//button[@class='range-revamp-btn range-revamp-btn--icon-secondary']//span[@class='range-revamp-btn__copy']";
	private String increaseQuantityButton = "//button[@class='range-quantity-field__button range-btn range-btn--plain range-quantity-field__increase js-amount-input-plus']//*[@class='range-svg-icon range-btn__icon']";
	private String removeFromCartButton = "//div[@class='product-controls__remove _Rfxs_']//button[contains(@class,'button button--secondary')]";
	private String checkOutButton = "//div[@class='shoppingbag__headline']//span[@class='button__text'][contains(text(),'Nastavi')]";
    private String closeCartPopUpButton = "//button[@class='rec-btn rec-btn--icon-tertiary rec-btn--small rec-modal__close']//span[@class='rec-btn__copy']//*[local-name()='svg']";
	private String chairDescriptionLabel = "//ul[@class='product__description-list']";
	private String chairDescriptionLabelWishList = "//div[@class='details']";
	private String chairTripledPriceLabel = "//div[@class='product__total product__total-regular']";
	private String yourOrderDetails = "body.js-focus-visible.checkout-delivery:nth-child(2) main.one-checkout.oneweb-translatable:nth-child(10) div.checkout-process.delivery section.checkout-section:nth-child(1) div.checkout-section-sleeve div.minibag.summary._Rfxw_ div.miniproduct.miniproduct__with-info.miniproduct__without-product-id:nth-child(3) div.miniproduct__data:nth-child(2) p.miniproduct__data-first-row:nth-child(1) > span:nth-child(1)";
	
	
	private String yourCartIsEmptyMessage = "//p[contains(text(),'Tvoja korpa za kupovinu je trenutno prazna')]";

	public WebElement getAddToCartButton() {
		return findElement(addToCartButton);
	}

	public WebElement getAddToWishListButton() {
		return findElement(addToWishListButton);
	}

	public WebElement getCheckOutButton() {
		return findElement(checkOutButton);
	}

	public WebElement getIncreaseQuantityButton() {
		return findElement(increaseQuantityButton);
	}

	public WebElement getRemoveFromCartButton() {
		return findElement(removeFromCartButton);
	}

	public WebElement getCloseCartPopUpButton() {
		return findElement(closeCartPopUpButton);
	}

	public WebElement getChairDescriptionLabel() {
		return findElement(chairDescriptionLabel);
	}

	public WebElement getChairTripledPriceLabel() {
		return findElement(chairTripledPriceLabel);
	}

	public WebElement getYourOrderDetails() {
		return Browser.getBrowser().findElementByCssSelector(yourOrderDetails);
	}

	public WebElement getYourCartIsEmptyMessage() {
		return findElement(yourCartIsEmptyMessage);
	}

	public WebElement getChairDescriptionLabelWishList() {
		return findElement(chairDescriptionLabelWishList);
	}
}
