package com.outfittery.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Class containing elements of the Update Information page.
 * 
 * @author Kassiane Andrade
 *
 */
public class UpdateInformationPageObject {

	@FindBy(css = ".user-info__firstname > input")
	private WebElement firstName;

	@FindBy(css = ".user-info__lastname > input")
	private WebElement lastName;

	@FindBy(css = ".prefix > input")
	private WebElement prefix;

	@FindBy(css = ".number > input")
	private WebElement phone;

	@FindBy(css = ".rounded")
	private WebElement save;

	public UpdateInformationPageObject(final WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPrefix() {
		return prefix;
	}

	public WebElement getSave() {
		return save;
	}
}
