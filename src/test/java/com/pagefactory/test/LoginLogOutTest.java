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

    @Test
    public void checkValidUser()
    {

        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");

        //Create page object using page factory
        LoginLogOut login_page=PageFactory.initElements(driver, LoginLogOut.class);

        //Call the method
        login_page.login_choozle("devs@choozle.com", "choozle123");

        driver.quit();

    }


}
