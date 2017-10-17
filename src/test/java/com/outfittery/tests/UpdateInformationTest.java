package com.outfittery.tests;

import org.junit.Test;

import com.outfittery.actions.HomePageAction;
import com.outfittery.actions.LoginAction;
import com.outfittery.actions.UpdateInformationAction;
import com.outfittery.base.BaseTest;
import com.outfittery.pages.HomePageObject;
import com.outfittery.pages.LoginPageObject;
import com.outfittery.pages.UpdateInformationPageObject;
import com.outfittery.path.OutfitteryPaths;
import com.outfittery.utils.OutfitteryUser;

public class UpdateInformationTest extends BaseTest {

	private OutfitteryUser outfitteryUser;

	public UpdateInformationTest() {
		this.outfitteryUser = new OutfitteryUser();
	}

	@Test
	public void shouldNotBePossibleToSavePhoneNumberWithLetters() {
		driver.navigate().to(OutfitteryPaths.getHomePageURL());
		HomePageObject homePageObject = new HomePageObject(driver);
		HomePageAction homePageAction = new HomePageAction(homePageObject);

		homePageAction.clickOnLogin();

		LoginPageObject loginPageObject = new LoginPageObject(driver);
		LoginAction loginAction = new LoginAction(loginPageObject);
		loginAction.typeEmail(outfitteryUser.getUserEmail()).typePassword(outfitteryUser.getUserPassword())
		        .clickOnLogin();

		driver.navigate().to(OutfitteryPaths.getUpdateInformationURL());

		UpdateInformationPageObject updateInformationPageObject = new UpdateInformationPageObject(driver);
		UpdateInformationAction updateInformationAction = new UpdateInformationAction(updateInformationPageObject);

		updateInformationAction.typePhoneNumber("111222abcde").clickOnSaveButton();

	}
}
