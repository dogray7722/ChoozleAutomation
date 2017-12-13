package com.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

    static WebDriver driver;

    public static WebDriver startBrowser(String url) {
            WebDriver driver=new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");

//        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");

        driver.manage().window().maximize();
        driver.get(url);

        return driver;

    }

}
