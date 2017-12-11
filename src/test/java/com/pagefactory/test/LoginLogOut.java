package com.pagefactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginLogOut {

    WebDriver driver;

    public LoginLogOut(WebDriver driver) { this.driver=driver; }

    @FindBy(how = How.ID,using =  "UserEmail")
    WebElement username;

    @FindBy(how = How.ID,using = "UserPassword")
    WebElement password;

    @FindBy(how = How.XPATH,using = "//*[@id=\"UserLoginForm\"]/div[3]/div/div/input")

    @CacheLookup
    WebElement submit;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Hi ")

    @CacheLookup
    WebElement dropdown;

    @FindBy(how = How.LINK_TEXT,using = "Logout")

    @CacheLookup
    WebElement logout;

    public void login_logout(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
        dropdown.click();
        logout.click();

    }

    public void login_choozle(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
    }





}
