package com.pagefactory.test;

import org.openqa.selenium.WebDriver;

public class Helper {

    static WebDriver driver;

    public static WebDriver startBrowser(String url) {

        driver.manage().window().maximize();
        driver.get(url);

        return driver;

    }

}
