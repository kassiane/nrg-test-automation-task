package com.outfittery.tests;

import com.outfittery.base.BaseTest;
import com.outfittery.pages.HomePage;
import org.junit.Test;

public class TestClassExample extends BaseTest{

    HomePage homePage;

    @Test
    public void loginButtonShouldBeAvailable(){
        homePage = new HomePage(driver);
        homePage.loginButtonShouldBeAvailable();
    }
}
