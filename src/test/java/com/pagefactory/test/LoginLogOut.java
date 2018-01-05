package com.pagefactory.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginLogOut {

    WebDriver driver;

    public LoginLogOut(WebDriver driver) { this.driver=driver; }

    @FindBy(how = How.ID,using =  "UserEmail")
    WebElement username;

    @FindBy(how = How.ID,using = "UserPassword")
    WebElement password;

    @FindBy(how = How.XPATH,using = "//*[@id=\"UserLoginForm\"]/div[3]/div/div/input")
    WebElement submit;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Hi ")
    WebElement dropdown;

    @FindBy(how = How.LINK_TEXT,using = "Logout")
    WebElement logout;

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "User Info")
    WebElement userInfo;

    public void login_logout(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Hi ")));
        element.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        logout.click();

    }

    public void login_choozle(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Hi ")));
        element.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebDriverWait wait1 = new WebDriverWait(driver,5);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("User Info")));
        element1.click();
    }

}
