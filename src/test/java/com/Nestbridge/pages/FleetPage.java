package com.Nestbridge.pages;

import com.Nestbridge.utilities.Driver;
import com.sun.tools.javadoc.Start;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {
    public FleetPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractButton;
    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createButton;


    @FindBy (xpath = "(//select)[1]")
    public WebElement typeDropdown;
    @FindBy(xpath = "(//div[@class='select2-result-label'])[4]")
    public WebElement cashButton;
    @FindBy(xpath = "//input[@data-name='field__responsible']")
    public WebElement Responsible;
    @FindBy(xpath = "//input[@data-name='field__activation-cost']")
    public WebElement ActivationCost;
    @FindBy(xpath = "//input[@data-name='field__recurring-cost-amount']")
    public WebElement RecurringCostAmountDepreciated;
    @FindBy(xpath = "(//select)[2]")
    public WebElement RecurringCostAmount;
    @FindBy(xpath = "//input[@data-name='field__odometer-details']")
    public WebElement OdometerDetails;
    @FindBy(xpath = "//input[@class='datepicker-input hasDatepicker'][1]")
    public WebElement InvoiceDate;

    @FindBy(xpath = "(//input[@class='datepicker-input hasDatepicker'])[2]")
    public WebElement ContractStartDate;
    @FindBy(xpath = "(//input[@class='datepicker-input hasDatepicker'])[3]")
    public WebElement ContractExpirationDate;

    @FindBy(xpath = "//input[@data-name='field__vendor']")
    public WebElement Vendor;
    @FindBy(xpath = "//input[@data-name='field__driver']")
    public WebElement DriverBox;
    @FindBy(xpath = "//input[@data-name='field__contract-reference']")
    public WebElement ContractReference;
    @FindBy(xpath = "//textarea[@data-name='field__termsand-conditions']")
    public WebElement TermsAndConditions;
    @FindBy(xpath = "(//select)[3]")
    public WebElement Status;



    @FindBy(xpath = "//button[@class='btn btn-success action-button']")
    public WebElement saveCloseButton;
    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement triangleButton;
    @FindBy(xpath = "//button[@class='action-button dropdown-item']")
    public WebElement dropDownSaveAndClose;















}
