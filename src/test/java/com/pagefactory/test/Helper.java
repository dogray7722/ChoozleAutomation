package com.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

//    static WebDriver driver;

    public static WebDriver startBrowser(String url) {
            WebDriver driver=new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");

        driver.manage().window().maximize();
        driver.get(url);

        return driver;

    }

}
