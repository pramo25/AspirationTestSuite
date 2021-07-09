package com.aspiration.scripts;

import com.aspiration.pages.Base;
import com.aspiration.pages.SpendAndSave;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SpendAndSaveTest {

    private static WebDriver driver;

    @Before
    public void setUp() {
        final String ASPIRATION_URL = "https://aspiration.com";
        System.setProperty("webdriver.chrome.driver", "//Users//paulineramo//Documents//chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASPIRATION_URL);
        Base.navigateToSpendAndSave(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testNavigateToGetAspiration() {
        System.out.println("Testing navigation to Get Aspiration...");
        SpendAndSave.navigateToGetAspiration(driver);
        Boolean isInputEmailBoxDisplayed = SpendAndSave.inputEmailBox(driver).isDisplayed();

        assertTrue(isInputEmailBoxDisplayed);
    }

    @Test
    public void testNavigateToGetAspirationPlus() {
        System.out.println("Testing navigation to Get Aspiration Plus...");
        SpendAndSave.navigateToGetAspirationPlus(driver);
        Boolean isYearlyPlanDisplayed = SpendAndSave.yearlyPlan(driver).isDisplayed();
        Boolean isMonthlyPlanDisplayed = SpendAndSave.monthlyPlan(driver).isDisplayed();

        assertTrue(isYearlyPlanDisplayed);
        assertTrue(isMonthlyPlanDisplayed);

    }

    @Test
    public void verifyAspirationPlusPlanPrice() {
        System.out.println("Verifying Aspiration Plus Plan Price...");
        SpendAndSave.navigateToGetAspirationPlus(driver);
        String actualYearlyPlanPrice = "$71.88";
        String actualMonthlyPlanPrice = "$7.99";

        assertEquals(SpendAndSave.yearlyPlanPrice(driver).getText(), actualYearlyPlanPrice);
        assertEquals(SpendAndSave.monthlyPlanPrice(driver).getText(), actualMonthlyPlanPrice);
    }
}
