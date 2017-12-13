package com.pagefactory.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ZButtonandInputFieldTest {

    @Test
    public void ButtonandInputField()
    {

        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");

        LoginLogOut login_page= PageFactory.initElements(driver, LoginLogOut.class);

        login_page.login_logout("devs@choozle.com", "choozle123");

        driver.quit();

    }

    @Test
    public void MyOrg()
    {
        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");

        LoginLogOut login_page = PageFactory.initElements(driver, LoginLogOut.class);

        login_page.login_choozle("dufuscookie@mailinator.com", "choozle123");

        driver.quit();

    }


}
