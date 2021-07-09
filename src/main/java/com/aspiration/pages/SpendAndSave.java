package com.aspiration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpendAndSave {

    private static WebElement element = null;

    public static void navigateToGetAspiration(WebDriver driver) {
        getAspiration_btn(driver).click();
    }

    public static void navigateToGetAspirationPlus(WebDriver driver) {
        getAspirationPlus_btn(driver).click();
    }

    public static WebElement spendAndSave_header(WebDriver driver) {
        element = driver.findElement(By.xpath("//h1[text()='Spend & Save Plans']"));
        return element;
    }

    public static WebElement getAspiration_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[text()=' Get Aspiration ']"));
        return element;
    }

    public static WebElement getAspirationPlus_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[text()=' Get Aspiration Plus ']"));
        return element;
    }

    public static WebElement inputEmailBox(WebDriver driver) {
        element = driver.findElement(By.id("join-waitlist-input"));
        return element;
    }

    public static WebElement yearlyPlan(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('yearly')\"]"));
        return element;
    }

    public static WebElement monthlyPlan(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('monthly')\"]"));
        return element;
    }

    public static WebElement yearlyPlanPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('yearly')\"]/p/b"));
        return element;
    }

    public static WebElement monthlyPlanPrice(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@ng-click=\"selectPlan('monthly')\"]/p/b"));
        return element;
    }
}
