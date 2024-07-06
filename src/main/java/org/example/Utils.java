package org.example;

import org.openqa.selenium.By;

// we keep all the reusable method is here
public class Utils extends BasePage{

    public static void clickOnElement(By by){
    driver.findElement(by).click();
    }

    public static void typeIn(By by, String text){
    driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by){
    return driver.findElement(by).getText();
    }

}
