package com.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

    WebDriver driver;

    public LoginPageNew(WebDriver driver)
    {
        this.driver=driver;
    }

    @FindBy(how = How.ID,using = "UserEmail")
    WebElement username;

    @FindBy(how = How.ID,using = "UserPassword")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"UserLoginForm\"]/div[3]/div/div/input")

    @CacheLookup
    WebElement submit;


    public void login_choozle(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
    }

}
