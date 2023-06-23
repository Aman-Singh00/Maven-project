package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Thankyou_page {
	
	
	public Thankyou_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//a[text()='Click here for order details.']")
	private WebElement orderDetailsLink;
	
	public void clickonOrderDetails()
	{
		orderDetailsLink.click();
	}
	
	public WebElement getOrderDetailsLink() {
		return orderDetailsLink;
	}

	public void setOrderDetailsLink(WebElement orderDetailsLink) {
		this.orderDetailsLink = orderDetailsLink;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(WebElement continueButton) {
		this.continueButton = continueButton;
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	
	

}
