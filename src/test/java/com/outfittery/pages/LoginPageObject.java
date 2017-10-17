package com.outfittery.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Class containing elements from Login page.
 * 
 * @author Kassiane Andrade
 *
 */
public class LoginPageObject {

	@FindBy(id = "username")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "submit")
	private WebElement loginButton;

	public LoginPageObject(final WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
