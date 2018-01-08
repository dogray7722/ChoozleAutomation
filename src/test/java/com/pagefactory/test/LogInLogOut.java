package com.pagefactory.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogInLogOut {

    WebDriver driver;

    public LogInLogOut(WebDriver driver) { this.driver=driver; }

    @FindBy(how = How.ID,using =  "UserEmail")
    WebElement username;

    @FindBy(how = How.ID,using = "UserPassword")
    WebElement password;

    @FindBy(how = How.XPATH,using = "//*[@id=\"UserLoginForm\"]/div[3]/div/div/input")
    WebElement submit;

    @FindBy(how = How.LINK_TEXT,using = "Logout")
    WebElement logout;

    public void login_logout(String uid, String pass)
    {
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Hi ")));
        element.click();
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
        WebDriverWait wait1 = new WebDriverWait(driver,5);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("User Info")));
        element1.click();
    }

}
