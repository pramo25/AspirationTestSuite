package com.aspiration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This class is for the Spend and Save page
public class SpendAndSave {

    private static WebElement element = null;

    //Action to click the Get Aspiration button
    public static void navigateToGetAspiration(WebDriver driver) {
        getAspiration_btn(driver).click();
    }

    //Action to click the Get Aspiration Plus button
    public static void navigateToGetAspirationPlus(WebDriver driver) {
        getAspirationPlus_btn(driver).click();
    }

    // WebElement for the Spend and Save Header
    public static WebElement spendAndSave_header(WebDriver driver) {
        element = driver.findElement(By.xpath("//h1[text()='Spend & Save Plans']"));
        return element;
    }

    // WebElement for the Get Aspiration button
    public static WebElement getAspiration_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[contains(text(), 'Get Aspiration')]"));
        return element;
    }

    // WebElement for the Get Aspiration Plus button
    public static WebElement getAspirationPlus_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[contains(text(), 'Get Aspiration Plus')]"));
        return element;
    }

    // WebElement for the input field for an email address
    public static WebElement inputEmailBox(WebDriver driver) {
        element = driver.findElement(By.id("join-waitlist-input"));
        return element;
    }

    // WebElement for the Yearly Plan
    public static WebElement yearlyPlan(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('yearly')\"]"));
        return element;
    }

    // WebElement for the Monthly Plan
    public static WebElement monthlyPlan(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('monthly')\"]"));
        return element;
    }

    // WebElement for the Yearly Plan Price
    public static WebElement yearlyPlanPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('yearly')\"]/p/b"));
        return element;
    }

    // WebElement for the Monthly Plan Price
    public static WebElement monthlyPlanPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('monthly')\"]/p/b"));
        return element;
    }
}
