package com.pagefactory.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginLogOutTest {

    @Test
    public void LogOutLogin()
    {

        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");

        LoginLogOut login_page= PageFactory.initElements(driver, LoginLogOut.class);

        login_page.login_logout("devs@choozle.com", "choozle123");

        driver.quit();

    }
}
