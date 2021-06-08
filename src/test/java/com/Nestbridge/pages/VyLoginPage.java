package com.Nestbridge.pages;

import com.Nestbridge.utilities.ConfigurationReader;
import com.Nestbridge.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyLoginPage {
    public VyLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement username;
    @FindBy(id = "prependedInput2")
    public WebElement password;
    @FindBy(id = "_submit")
    public WebElement loginButton;
    public void StoreManagerLogin(){
        username.sendKeys(Keys.BACK_SPACE+ ConfigurationReader.getProperty("StoreManagerUserName"));
        password.sendKeys(Keys.BACK_SPACE+ConfigurationReader.getProperty("StoreManagerPassword"));
        loginButton.click();

    }
}
