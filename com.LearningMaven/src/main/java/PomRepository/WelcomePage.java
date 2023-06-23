package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Register Link
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	public void registerClick() {
		registerLink.click();
	}

	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	//Login Link
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;

	public void loginClick() {
		loginLink.click();
	}

	
	public WebElement getLoginLink() {
		return loginLink;
	}

	
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	//Shopping Cart Link
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	public void shoppingCartLinkClick() {
		shoppingCartLink.click();
	}

	// getter
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	// setter
	public void setShoppingCartLink(WebElement shoppinCartLink) {
		this.shoppingCartLink = shoppinCartLink;
	}

	//Wishlist Link
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlist;

	public void wishlistClick() {
		wishlist.click();
	}

	// getter
	public WebElement getWishlist() {
		return wishlist;
	}

	// setter
	public void setWishlist(WebElement wishlist) {
		this.wishlist = wishlist;
	}

	//Search Text field
	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;

	public void enterSearchitems(String productname) {
		searchTextField.sendKeys(productname);
	}

	// getter
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	// setter
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	// Search Button
	@FindBy(className = "search-box-button")
	private WebElement searchbutton;

	public void searchClick() {
		searchbutton.click();
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}

	//Header Books Link
	@FindBy(partialLinkText = "BOOKS")
	private WebElement headerBooksLink;

	public void clickHeaderBooksLink() {
		headerBooksLink.click();
	}

	public WebElement getHeaderBooksLink() {
		return headerBooksLink;
	}

	public void setHeaderBooksLink(WebElement headerBooksLink) {
		this.headerBooksLink = headerBooksLink;
	}

	//Header Computers Link
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement headerComputersLink;

	public void clickHeaderComputerLinks() {
		headerComputersLink.click();
	}

	public WebElement getHeaderComputersLink() {
		return headerComputersLink;
	}

	public void setHeaderComputersLink(WebElement headerComputersLink) {
		this.headerComputersLink = headerComputersLink;
	}

	//Header electronics Link
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement headerElectronicsLink;

	public void clickHeaderElectronicsLinks() {
		headerElectronicsLink.click();
	}

	public WebElement getHeaderElectronicsLink() {
		return headerElectronicsLink;
	}

	public void setHeaderElectronicsLink(WebElement headerElectronicsLink) {
		this.headerElectronicsLink = headerElectronicsLink;
	}

	//Header apparel & shoes Link
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement headerApparelShoesLink;

	public void clickHeaderApparelShoesLink() {
		headerApparelShoesLink.click();
	}

	public WebElement getHeaderApparelShoesLink() {
		return headerApparelShoesLink;
	}

	public void setHeaderApparelShoesLink(WebElement headerApparelShoesLink) {
		this.headerApparelShoesLink = headerApparelShoesLink;
	}

	//header digital downloads Link
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement headerDigitalDownloadsLink;

	public void clickHeaderDigitalDownloadsLink() {
		headerDigitalDownloadsLink.click();
	}

	public WebElement getHeaderDigitalDownloadsLink() {
		return headerDigitalDownloadsLink;
	}

	public void setHeaderDigitalDownloadsLink(WebElement headerDigitalDownloadsLink) {
		this.headerDigitalDownloadsLink = headerDigitalDownloadsLink;
	}

	//Header jewelry link
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement headerJewelryLink;

	public void clickHeaderJewelryLink() {
		headerJewelryLink.click();
	}

	public WebElement getHeaderJewelryLink() {
		return headerJewelryLink;
	}

	public void setHeaderJewelryLink(WebElement headerJewelryLink) {
		this.headerJewelryLink = headerJewelryLink;
	}

	//header gift cards link
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement headerGiftCardsLink;

	public void clickHeaderGiftCardsLink() {
		headerGiftCardsLink.click();
	}

	public WebElement getHeaderGiftCardsLink() {
		return headerGiftCardsLink;
	}

	public void setHeaderGiftCardsLink(WebElement headerGiftCardsLink) {
		this.headerGiftCardsLink = headerGiftCardsLink;
	}

	//Body books link
	@FindBy(partialLinkText = "Books")
	private WebElement bodyBooksLink;

	public void clickBodyBooksLink() {
		bodyBooksLink.click();
	}

	public WebElement getBodyBooksLink() {
		return bodyBooksLink;
	}

	public void setBodyBooksLink(WebElement bodyBooksLink) {
		this.bodyBooksLink = bodyBooksLink;
	}

	//body computers Link
	@FindBy(partialLinkText = "Computers")
	private WebElement bodyComputersLink;

	public void clickBodyComputerLinks() {
		bodyBooksLink.click();
	}

	public WebElement getBodyComputersLink() {
		return bodyComputersLink;
	}

	public void setBodyComputersLink(WebElement bodyComputersLink) {
		this.bodyComputersLink = bodyComputersLink;
	}

	//
	@FindBy(partialLinkText = "Electronics")
	private WebElement bodyElectronicsLink;

	public void clickbodyElectronicsLinks() {
		bodyElectronicsLink.click();
	}

	public WebElement getBodyElectronicsLink() {
		return bodyElectronicsLink;
	}

	public void setBodyElectronicsLink(WebElement bodyElectronicsLink) {
		this.bodyElectronicsLink = bodyElectronicsLink;
	}

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement bodyApparelShoesLink;

	public void clickBodyApparelShoesLink() {
		bodyApparelShoesLink.click();
	}

	public WebElement getBodyApparelShoesLink() {
		return bodyApparelShoesLink;
	}

	public void setBodyApparelShoesLink(WebElement bodyApparelShoesLink) {
		this.bodyApparelShoesLink = bodyApparelShoesLink;
	}

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement bodyDigitalDownloadsLink;

	public void clickBodyDigitalDownloadsLink() {
		bodyDigitalDownloadsLink.click();
	}

	public WebElement getBodyDigitalDownloadsLink() {
		return bodyDigitalDownloadsLink;
	}

	public void setBodyDigitalDownloadsLink(WebElement bodyDigitalDownloadsLink) {
		this.bodyDigitalDownloadsLink = bodyDigitalDownloadsLink;
	}

	@FindBy(partialLinkText = "Jewelry")
	private WebElement bodyJewelryLink;

	public void clickbodyJewelryLink() {
		bodyJewelryLink.click();
	}

	public WebElement getBodyJewelryLink() {
		return bodyJewelryLink;
	}

	public void setBodyJewelryLink(WebElement bodyJewelryLink) {
		this.bodyJewelryLink = bodyJewelryLink;
	}

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement bodyGiftCardsLink;

	public void clickBodyGiftCardsLink() {
		bodyGiftCardsLink.click();
	}

	public WebElement getBodyGiftCardsLink() {
		return bodyGiftCardsLink;
	}

	public void setBodyGiftCardsLink(WebElement bodyGiftCardsLink) {
		this.bodyGiftCardsLink = bodyGiftCardsLink;
	}

	@FindBy(xpath = "//input[@id='pollanswers-1']")
	private WebElement excellentRadioButton;

	public void clickExcellentRadioButton() {
		excellentRadioButton.click();
	}

	public WebElement getExcellentRadioButton() {
		return excellentRadioButton;
	}

	public void setExcellentRadioButton(WebElement excellentRadioButton) {
		this.excellentRadioButton = excellentRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-2']")
	private WebElement goodRadioButton;

	public void clickGoodRadioButton() {
		goodRadioButton.click();
	}

	public WebElement getGoodRadioButton() {
		return goodRadioButton;
	}

	public void setGoodRadioButton(WebElement goodRadioButton) {
		this.goodRadioButton = goodRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-3']")
	private WebElement poorRadioButton;

	public void clickPoorRadioButton() {
		poorRadioButton.click();
	}

	public WebElement getPoorRadioButton() {
		return poorRadioButton;
	}

	public void setPoorRadioButton(WebElement poorRadioButton) {
		this.poorRadioButton = poorRadioButton;
	}

	@FindBy(xpath = "//input[@id='pollanswers-4']")
	private WebElement veryBadRadioButton;

	public void clickVeryBadRadioButton() {
		veryBadRadioButton.click();
	}

	public WebElement getVeryBadRadioButton() {
		return veryBadRadioButton;
	}

	public void setVeryBadRadioButton(WebElement veryBadRadioButton) {
		this.veryBadRadioButton = veryBadRadioButton;
	}

	@FindBy(xpath = "//input[@id='vote-poll-1']")
	private WebElement voteButton;

	public void clickVoteButton() {
		voteButton.click();
	}

	public WebElement getVoteButton() {
		return voteButton;
	}

	public void setVoteButton(WebElement voteButton) {
		this.voteButton = voteButton;
	}
	
	@FindBy(id="newsletter-email")
	private WebElement newsletterEmailTextField;
	
	public void enterNewsletterEmail(String newsletteremail)
	{
		newsletterEmailTextField.sendKeys(newsletteremail);
	}


	public WebElement getNewsletterEmailTextField() {
		return newsletterEmailTextField;
	}


	public void setNewsletterEmailTextField(WebElement newsletterEmailTextField) {
		this.newsletterEmailTextField = newsletterEmailTextField;
	}
	
	@FindBy(id="newsletter-subscribe-button")
	private WebElement subscribeButton;
	
	public void clickOnSubscribe()
	{
		subscribeButton.click();
	}


	public WebElement getSubscribeButton() {
		return subscribeButton;
	}


	public void setSubscribeButton(WebElement subscribeButton) {
		this.subscribeButton = subscribeButton;
	}

}
