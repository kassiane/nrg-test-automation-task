package com.outfittery.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public static void setSystemPathForDrivers() {
        String os = null;
        String osFullName = System.getProperty("os.name");

        if (osFullName.toLowerCase().contains("mac")) {
            os = "mac";
        } else if (osFullName.toLowerCase().contains("linux")) {
            os = "linux";
        } else if (osFullName.toLowerCase().contains("windows")) {
            os = "windows";
        } else {
            throw new IllegalStateException("OS not supported");
        }

        System.setProperty("webdriver.chrome.driver", "src/main/resources/"+ os + "/chromedriver");
    }

    @Before
    public void setUp() {
        setSystemPathForDrivers();
        driver = new ChromeDriver();
        driver.get("http://www.outfittery.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
