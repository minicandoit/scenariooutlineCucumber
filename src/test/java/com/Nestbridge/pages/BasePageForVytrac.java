package com.Nestbridge.pages;

import com.Nestbridge.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class BasePageForVytrac {
    public BasePageForVytrac(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a//span[@class='title title-level-1'])[2]")
    public WebElement fleet;
    @FindBy(xpath = "(//a//span[@class='title title-level-1'])[3]")
    public WebElement customers;
    @FindBy(xpath = "(//a//span[@class='title title-level-1'])[5]")
    public WebElement activities;
    @FindBy (xpath = "(//a//span[@class='title title-level-1'])[8]")
    public WebElement systemButton;











}
