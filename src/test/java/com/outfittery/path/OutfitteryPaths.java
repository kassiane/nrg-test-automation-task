package com.outfittery.path;

/**
 * Class that contains the paths of the application.
 * 
 * @author Kassiane Andrade
 *
 */
public class OutfitteryPaths {

	private static final String OUTFITTERY_HOME_PAGE = "https://www.outfittery.com";
	private static final String OUTFITTERY_MY_SETTINGS = "/account/settings";
	private static final String OUTFITTERY_SETTINGS_UPDATE_INFO = "/personalinfo";

	public static String getHomePageURL() {
		return new StringBuilder(OUTFITTERY_HOME_PAGE).toString();
	}

	public static String getMySettingsURL() {
		return new StringBuilder(OUTFITTERY_HOME_PAGE).append(OUTFITTERY_MY_SETTINGS).toString();
	}

	public static String getUpdateInformationURL() {
		return new StringBuilder(OUTFITTERY_HOME_PAGE).append(OUTFITTERY_MY_SETTINGS)
		        .append(OUTFITTERY_SETTINGS_UPDATE_INFO).toString();
	}
}
