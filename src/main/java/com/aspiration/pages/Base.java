package com.aspiration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This class is for the elements common in multiple pages
public class Base {

    private static WebElement element = null;

    //Action to click the spend and save button
    public static void navigateToSpendAndSave(WebDriver driver) {
        spendAndSave_btn(driver).click();
    }

    //Action to click the credit button
    public static void navigateToCredit(WebDriver driver) {
        credit_btn(driver).click();
    }

    //Action to click the who we are button
    public static void navigateToWhoWeAre(WebDriver driver) {
        whoWeAre_btn(driver).click();
    }

    //Action to click the giving button
    public static void navigateToGiving(WebDriver driver) {
        giving_btn(driver).click();
    }

    //Action to click the learn button
    public static void navigateToLearn(WebDriver driver) {
        learn_btn(driver).click();
    }

    // WebElement for the Spend and Save button
    public static WebElement spendAndSave_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/our-products']"));
        return element;
    }

    // WebElement for the Credit button
    public static WebElement credit_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/zero']"));
        return element;
    }

    // WebElement for the Who We Are button
    public static WebElement whoWeAre_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/who-we-are']"));
        return element;
    }

    // WebElement for the Giving button
    public static WebElement giving_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/dimes-worth-of-difference']"));
        return element;
    }

    // WebElement for the Learn button
    public static WebElement learn_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/education']"));
        return element;
    }

}
