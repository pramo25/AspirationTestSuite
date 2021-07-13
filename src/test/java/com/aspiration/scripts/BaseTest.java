package com.aspiration.scripts;

import com.aspiration.dataprovider.ConfigFileReader;
import com.aspiration.pages.Base;
import com.aspiration.pages.SpendAndSave;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class BaseTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        ConfigFileReader configFileReader= new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(configFileReader.getApplicationUrl());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testNavigateToSpendAndSave() {
        System.out.println("Testing navigation to Spend & Save...");
        Base.navigateToSpendAndSave(driver);
        Boolean isSpendAndSavePlansDisplayed = SpendAndSave.spendAndSave_header(driver).isDisplayed();
        Boolean isGetAspirationBtnDisplayed = SpendAndSave.getAspiration_btn(driver).isDisplayed();
        Boolean isGetAspirationPlusBtnDisplayed = SpendAndSave.getAspirationPlus_btn(driver).isDisplayed();

        //Verifying if the Spend and Save Plans are displayed
        assertTrue(isSpendAndSavePlansDisplayed);
        //Verifying there are 2 card products, Aspiration and Aspiration Plus
        assertTrue(isGetAspirationBtnDisplayed);
        assertTrue(isGetAspirationPlusBtnDisplayed);
    }


}
