package com.pagefactory.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ButtonAndInputFieldTest {

    WebDriver driver;

    @Test
    @Parameters({ "browser" })
    public void multiBrowserTest(String browser)
    {
        if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");
        }
        else if (browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        }

        else if (browser.equalsIgnoreCase("safari"))
        {
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.get("http://choozle.vm/users/login");

        driver.quit();
    }

}
