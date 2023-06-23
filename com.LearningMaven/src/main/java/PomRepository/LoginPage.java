package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;

	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;

	public void clickRememberMeCheckBox() {
		rememberMeCheckBox.click();
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public void setRememberMeCheckBox(WebElement rememberMeCheckBox) {
		this.rememberMeCheckBox = rememberMeCheckBox;
	}

	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink;

	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

}
