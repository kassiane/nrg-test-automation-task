package com.outfittery.pages;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginButtonShouldBeAvailable() {
        WebElement loginButton = driver.findElement(By.cssSelector(".login.open-login"));

        assert loginButton.isDisplayed();
    }
}
