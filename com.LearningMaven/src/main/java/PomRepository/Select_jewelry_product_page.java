package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_jewelry_product_page {
	
	public Select_jewelry_product_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-wishlist-button-14")
	WebElement addToWishlistButton;
	
	public void clickAddToWishlistButton()
	{
		addToWishlistButton.click();
	}
	

}
