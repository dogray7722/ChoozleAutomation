package com.pagefactory.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogOutLoginTest {

    @Test
    public void LogOutLogin()
    {

        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");

        LogOutLogin login_page= PageFactory.initElements(driver, LogOutLogin.class);

        login_page.login_logout("devs@choozle.com", "choozle123");

        driver.quit();

    }
}
