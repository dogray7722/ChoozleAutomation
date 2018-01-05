package com.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginLogOutTest {

    WebDriver driver;

    @Test
    @Parameters({ "browser" })
    public void LogOutLogin(String browser)
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


        LoginLogOut login_page= PageFactory.initElements(driver, LoginLogOut.class);

        login_page.login_logout("devs@choozle.com", "choozle123");

        driver.quit();

    }



    @Test
    @Parameters({ "browser" })
    public void checkValidUser(String browser)
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


        //Create page object using page factory
        LoginLogOut login_page=PageFactory.initElements(driver, LoginLogOut.class);

        //Call the method
        login_page.login_choozle("devs@choozle.com", "choozle123");

        driver.quit();

    }

}
