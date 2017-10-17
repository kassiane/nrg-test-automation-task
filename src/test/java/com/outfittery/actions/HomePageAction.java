package com.outfittery.actions;

import com.outfittery.pages.HomePageObject;
import com.outfittery.pages.LoginPageObject;

/**
 * Class containing all actions that can be made on the elements of
 * {@link HomePageObject}.
 * 
 * @author Kassiane Andrade
 *
 */
public class HomePageAction {

	private HomePageObject homePage;

	public HomePageAction(HomePageObject homePage) {
		this.homePage = homePage;
	}

	public HomePageAction clickOnLogin() {
		this.homePage.getLoginButton().click();

		return this;
	}
}
