package com.outfittery.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Class containing elements from Home page.
 * 
 * @author Kassiane Andrade
 *
 */
public class HomePageObject {

	@FindBy(css = ".login.open-login")
	private WebElement loginButton;

	public HomePageObject(final WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
