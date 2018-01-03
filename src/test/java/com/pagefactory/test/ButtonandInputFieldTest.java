package com.pagefactory.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ButtonandInputFieldTest {

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

        driver.manage().window().maximize();
        driver.get("http://choozle.vm/users/login");
        System.out.println(driver.getTitle());
        driver.quit();
    }


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
