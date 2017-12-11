//package com.pagefactory.test;
//
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPageTest {
//
//    @Test
//    public void checkValidUser()
//    {
//
//        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");
//
//        //Create page object using page factory
//        LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
//
//        //Call the method
//        login_page.login_choozle("devs@choozle.com", "choozle123");
//
//        driver.quit();
//
//    }
//
//}
