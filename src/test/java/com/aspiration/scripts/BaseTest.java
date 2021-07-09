package com.aspiration.scripts;

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
        final String ASPIRATION_URL = "https://aspiration.com";
        System.setProperty("webdriver.chrome.driver", "//Users//paulineramo//Documents//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASPIRATION_URL);
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

        assertTrue(isSpendAndSavePlansDisplayed);
        assertTrue(isGetAspirationBtnDisplayed);
        assertTrue(isGetAspirationPlusBtnDisplayed);
    }


}
