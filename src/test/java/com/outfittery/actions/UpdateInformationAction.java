package com.outfittery.actions;

import com.outfittery.pages.UpdateInformationPageObject;

/**
 * Class containing all actions that can be made on the elements of
 * {@link UpdateInformationPageObject}.
 * 
 * @author Kassiane Andrade
 *
 */
public class UpdateInformationAction {

	private UpdateInformationPageObject updateInformationPage;

	public UpdateInformationAction(final UpdateInformationPageObject updateInformationPage) {
		this.updateInformationPage = updateInformationPage;
	}

	public UpdateInformationAction clickOnSaveButton() {
		this.updateInformationPage.getSave().click();

		return this;
	}

	public UpdateInformationAction typeFirstName(final String firstName) {
		this.updateInformationPage.getFirstName().clear();
		this.updateInformationPage.getFirstName().sendKeys(firstName);

		return this;
	}

	public UpdateInformationAction typeLastName(final String lastName) {
		this.updateInformationPage.getLastName().clear();
		this.updateInformationPage.getLastName().sendKeys(lastName);

		return this;
	}

	public UpdateInformationAction typePhoneNumber(final String phoneNumber) {
		this.updateInformationPage.getPhone().clear();
		this.updateInformationPage.getPhone().sendKeys(phoneNumber);

		return this;
	}
}
