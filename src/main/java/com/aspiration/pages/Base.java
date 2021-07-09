package com.aspiration.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

    private static WebElement element = null;

    public static void navigateToSpendAndSave(WebDriver driver) {
        spendAndSave_btn(driver).click();
    }

    public static void navigateToCredit(WebDriver driver) {
        credit_btn(driver).click();
    }

    public static void navigateToWhoWeAre(WebDriver driver) {
        whoWeAre_btn(driver).click();
    }

    public static void navigateToGiving(WebDriver driver) {
        giving_btn(driver).click();
    }

    public static void navigateToLearn(WebDriver driver) {
        learn_btn(driver).click();
    }

    public static WebElement spendAndSave_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/our-products']"));
        return element;
    }

    public static WebElement credit_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/zero']"));
        return element;
    }

    public static WebElement whoWeAre_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/who-we-are']"));
        return element;
    }

    public static WebElement giving_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/dimes-worth-of-difference']"));
        return element;
    }

    public static WebElement learn_btn(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@href='https://www.aspiration.com/education']"));
        return element;
    }

}
