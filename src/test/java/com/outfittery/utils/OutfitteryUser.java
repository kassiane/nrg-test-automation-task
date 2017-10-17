package com.outfittery.utils;

import java.util.ResourceBundle;

/**
 * A bundle so we don't need to keep data hardcoded.
 * 
 * @author Kassiane Andrade
 *
 */
public class OutfitteryUser {

	private final ResourceBundle resource = ResourceBundle.getBundle("user");

	private final String userEmail;
	private final String userPassword;
	private final String userFirstName;
	private final String userLastName;
	private final String userPrefix;
	private final String userPhone;

	public OutfitteryUser() {
		this.userEmail = resource.getString("user.email");
		this.userPassword = resource.getString("user.password");
		this.userFirstName = resource.getString("user.first.name");
		this.userLastName = resource.getString("user.last.name");
		this.userPrefix = resource.getString("user.prefix");
		this.userPhone = resource.getString("user.phone");
	}

	public ResourceBundle getResource() {
		return resource;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserPrefix() {
		return userPrefix;
	}

	public String getUserPhone() {
		return userPhone;
	}
}
