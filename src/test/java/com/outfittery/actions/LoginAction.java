package com.outfittery.actions;

import com.outfittery.pages.LoginPageObject;

/**
 * Class containing all actions that can be made on the elements of
 * {@link LoginPageObject}.
 * 
 * @author Kassiane Andrade
 *
 */
public class LoginAction {

	private LoginPageObject loginPageObject;

	public LoginAction(final LoginPageObject loginPageObject) {
		this.loginPageObject = loginPageObject;
	}

	public LoginAction typeEmail(final String email) {
		this.loginPageObject.getEmail().clear();
		this.loginPageObject.getEmail().sendKeys(email);

		return this;
	}

	public LoginAction typePassword(final String password) {
		this.loginPageObject.getPassword().clear();
		this.loginPageObject.getPassword().sendKeys(password);

		return this;
	}

	public LoginAction clickOnLogin() {
		this.loginPageObject.getLoginButton().click();

		return this;
	}
}
