package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	public ShoppingCartPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[3]/a[@class='product-name']")
	private WebElement shoppingCartAddProductName;

	public WebElement getProductName() {
		shoppingCartAddProductName.getText();
		return shoppingCartAddProductName;
	}

	public WebElement getShoppingCartAddProductName() {
		return shoppingCartAddProductName;
	}

	public void setShoppingCartAddProductName(WebElement shoppingCartAddProductName) {
		this.shoppingCartAddProductName = shoppingCartAddProductName;
	}

	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[1]/input[@type='checkbox']")
	private WebElement removeCheckBox;

	public void clickCheckBox() {
		removeCheckBox.click();
	}

	public WebElement getRemoveCheckBox() {
		return removeCheckBox;
	}

	public void setRemoveCheckBox(WebElement removeCheckBox) {
		this.removeCheckBox = removeCheckBox;
	}

	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[4]/span[2]")
	WebElement shoppingCartAddproductPrice;

	public WebElement getProductPrice() {
		shoppingCartAddproductPrice.getText();
		return shoppingCartAddproductPrice;
	}

	public WebElement getShoppingCartAddproductPrice() {
		return shoppingCartAddproductPrice;
	}

	public void setShoppingCartAddproductPrice(WebElement shoppingCartAddproductPrice) {
		this.shoppingCartAddproductPrice = shoppingCartAddproductPrice;
	}

	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[5]/input[@class='qty-input valid']")
	private WebElement shoppingCartAddProductQuantity;

	public WebElement getProductQuantity() {
		shoppingCartAddProductQuantity.getText();
		return shoppingCartAddProductQuantity;
	}

	public WebElement getShoppingCartAddProductQuantity() {
		return shoppingCartAddProductQuantity;
	}

	public void setShoppingCartAddProductQuantity(WebElement shoppingCartAddProductQuantity) {
		this.shoppingCartAddProductQuantity = shoppingCartAddProductQuantity;
	}

	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[6]/span[@class='product-subtotal']")
	private WebElement shoppingCartAddProductGrandTotal;

	public WebElement getGrandTotal() {
		shoppingCartAddProductGrandTotal.getText();
		return shoppingCartAddProductGrandTotal;
	}

	public WebElement getShoppingCartAddProductGrandTotal() {
		return shoppingCartAddProductGrandTotal;
	}

	public void setShoppingCartAddProductGrandTotal(WebElement shoppingCartAddProductGrandTotal) {
		this.shoppingCartAddProductGrandTotal = shoppingCartAddProductGrandTotal;
	}

	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement UpdateShoppingCartButton;

	public void clickOnUpdateShoppingCart() {
		UpdateShoppingCartButton.click();
	}

	public WebElement getUpdateShoppingCartButton() {
		return UpdateShoppingCartButton;
	}

	public void setUpdateShoppingCartButton(WebElement updateShoppingCartButton) {
		UpdateShoppingCartButton = updateShoppingCartButton;
	}

	@FindBy(name = "continueshopping")
	private WebElement continueShoppingButton;

	public void clickOnContinueShopping() {
		continueShoppingButton.click();
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public void setContinueShoppingButton(WebElement continueShoppingButton) {
		this.continueShoppingButton = continueShoppingButton;
	}

	@FindBy(name = "discountcouponcode")
	private WebElement discountCodeTextField;

	public void enterCouponCode(String couponcode) {
		discountCodeTextField.sendKeys(couponcode);
	}

	public WebElement getDiscountCodeTextField() {
		return discountCodeTextField;
	}

	public void setDiscountCodeTextField(WebElement discountCodeTextField) {
		this.discountCodeTextField = discountCodeTextField;
	}

	@FindBy(name = "applydiscountcouponcode")
	private WebElement applyCouponButton;

	public void clickOnApplyCouponButton() {
		applyCouponButton.click();
	}

	public WebElement getApplyCouponButton() {
		return applyCouponButton;
	}

	public void setApplyCouponButton(WebElement applyCouponButton) {
		this.applyCouponButton = applyCouponButton;
	}

	@FindBy(name = "giftcardcouponcode")
	private WebElement giftCardTextField;

	public void clickOngiftCardTextField() {
		giftCardTextField.click();
	}

	public WebElement getGiftCardTextField() {
		return giftCardTextField;
	}

	public void setGiftCardTextField(WebElement giftCardTextField) {
		this.giftCardTextField = giftCardTextField;
	}

	@FindBy(name = "applygiftcardcouponcode")
	WebElement giftCardButton;

	public void clickOnGiftCardButton() {
		giftCardButton.click();
	}

	public WebElement getGiftCardButton() {
		return giftCardButton;
	}

	public void setGiftCardButton(WebElement giftCardButton) {
		this.giftCardButton = giftCardButton;
	}

	@FindBy(id = "CountryId")
	private WebElement countryDropdown;

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public void setCountryDropdown(WebElement countryDropdown) {
		this.countryDropdown = countryDropdown;
	}

	@FindBy(id = "StateProvinceId")
	private WebElement stateDropdown;

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public void setStateDropdown(WebElement stateDropdown) {
		this.stateDropdown = stateDropdown;
	}

	@FindBy(id = "ZipPostalCode")
	private WebElement postalCodeTextField;

	public void enterPostalcode(String postalCode) {
		postalCodeTextField.sendKeys(postalCode);
	}

	public WebElement getPostalCodeTextField() {
		return postalCodeTextField;
	}

	public void setPostalCodeTextField(WebElement postalCodeTextField) {
		this.postalCodeTextField = postalCodeTextField;
	}

	@FindBy(name = "estimateshipping")
	private WebElement estimateShippingButton;

	public void clickOnEstimateShipping() {
		estimateShippingButton.click();
	}

	public WebElement getEstimateShippingButton() {
		return estimateShippingButton;
	}

	public void setEstimateShippingButton(WebElement estimateShippingButton) {
		this.estimateShippingButton = estimateShippingButton;
	}

	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement terms_conditioncheckbox;

	public void clickontermsofservice() {
		terms_conditioncheckbox.click();
	}

	public WebElement getTerms_conditioncheckbox() {
		return terms_conditioncheckbox;
	}

	public void setTerms_conditioncheckbox(WebElement terms_conditioncheckbox) {
		this.terms_conditioncheckbox = terms_conditioncheckbox;
	}

	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	private WebElement checkOutButton;

	public void clickOnCheckOutButton() {
		checkOutButton.click();
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

	public void setCheckOutButton(WebElement checkOutButton) {
		this.checkOutButton = checkOutButton;
	}
	
	

}
