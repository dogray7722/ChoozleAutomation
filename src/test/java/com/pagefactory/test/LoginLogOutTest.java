//package com.pagefactory.test;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.PageFactory;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//public class LoginLogOutTest {
//
////    public static String USERNAME = "redacted";
////    public static String ACCESSKEY = "redacted";
////    public static String URL = "https://"+USERNAME+":"+ACCESSKEY+"@hub.browserstack.com/wd/hub";
////
////    @Test
////    public void openSTM() throws MalformedURLException
////    {
////        DesiredCapabilities capability = new DesiredCapabilities();
////        capability.setPlatform(Platform.MAC);
////        capability.setBrowserName("firefox");
////        capability.setVersion("57");
////
////        URL browserStackURL = new URL(URL);
////        WebDriver driver = new RemoteWebDriver(browserStackURL, capability);
////
////        driver.get("https://choozle.com/users/login");
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        String actualURL = driver.getCurrentUrl();
////        String expectedURL = "https://choozle.com/users/login";
////        Assert.assertEquals(actualURL, expectedURL);
////        driver.quit();
////
////    }
//
//
//
//    @Test
//    public void LogOutLogin()
//    {
//
//        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");
//
//        LoginLogOut login_page= PageFactory.initElements(driver, LoginLogOut.class);
//
//        login_page.login_logout("devs@choozle.com", "choozle123");
//
//        driver.quit();
//
//    }
//
//    @Test
//    public void checkValidUser()
//    {
//
//        WebDriver driver=Helper.startBrowser("http://choozle.vm/users/login");
//
//        //Create page object using page factory
//        LoginLogOut login_page=PageFactory.initElements(driver, LoginLogOut.class);
//
//        //Call the method
//        login_page.login_choozle("devs@choozle.com", "choozle123");
//
//        driver.quit();
//
//    }
//
//
//}
