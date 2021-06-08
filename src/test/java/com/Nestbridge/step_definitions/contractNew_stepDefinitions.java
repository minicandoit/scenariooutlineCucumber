package com.Nestbridge.step_definitions;

import com.Nestbridge.pages.BasePageForVytrac;
import com.Nestbridge.pages.FleetPage;
import com.Nestbridge.pages.VyLoginPage;
import com.Nestbridge.utilities.BrowserUtils;
import com.Nestbridge.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class contractNew_stepDefinitions {
    VyLoginPage vyLoginPage = new VyLoginPage();
    FleetPage fleetPage = new FleetPage();
    BasePageForVytrac basePageForVytrac = new BasePageForVytrac();

    @Given("users are logged into vytrac homepage and on contract page n")
    public void users_are_logged_into_vytrac_homepage_and_on_contract_page_n() {
        vyLoginPage.StoreManagerLogin();
        BrowserUtils.waitForVisibility(basePageForVytrac.fleet, 3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePageForVytrac.fleet).perform();


        fleetPage.vehicleContractButton.click();
        fleetPage.createButton.click();
    }

    @When("users fill out the form as followed from the table below n")
    public void users_fill_out_the_form_as_followed_from_the_table_below_n() {

    }



    @When("users enter {string} to Responsible n")
    public void users_enter_to_responsible_n(String string) {
        fleetPage.Responsible.sendKeys(Keys.BACK_SPACE + string);
    }

    @Then("users enter {string} to Activation Cost n")
    public void users_enter_to_activation_cost_n(String string) {
        fleetPage.ActivationCost.sendKeys(Keys.BACK_SPACE+string);
    }

        @When("users select {string} form choose a value n")
    public void users_select_form_choose_a_value_n(String string) {
        Select select = new Select(fleetPage.typeDropdown);
        select.selectByVisibleText(string);
    }

    @When("users enter {string} to Recurring Cost Amount\\(Depreciated) n")
    public void users_enter_to_recurring_cost_amount_depreciated_n(String string) {
        fleetPage.RecurringCostAmountDepreciated.sendKeys(Keys.BACK_SPACE+string);

    }





    @When("users select {string} to Recurring Cost Amount n")
    public void users_select_to_recurring_cost_amount_n(String string) {

        Select select=new Select(fleetPage.RecurringCostAmount);
        select.selectByVisibleText(string);

    }




    @And("users enter {string}to Odometer Details n")
    public void usersEnterToOdometerDetailsN(String arg0) {

        fleetPage.OdometerDetails.sendKeys(Keys.BACK_SPACE+arg0);
        BrowserUtils.sleep(3);

    }

    @And("users select {string}toInvoice Date n")
    public void usersSelectToInvoiceDateN(String arg0) {
        BrowserUtils.waitForVisibility(fleetPage.InvoiceDate,3);
fleetPage.InvoiceDate.sendKeys(Keys.BACK_SPACE+arg0);



    }

    @And("users select {string}to Contract Start Date n")
    public void usersSelectToContractStartDateN(String arg0) {
        BrowserUtils.waitForVisibility(fleetPage.ContractStartDate,6);

        fleetPage.ContractStartDate.sendKeys(Keys.BACK_SPACE);
        fleetPage.ContractStartDate.sendKeys(arg0);
        BrowserUtils.sleep(3);

    }

    @And("users select {string}to Contract Expiration Date n")
    public void usersSelectToContractExpirationDateN(String arg0) {
        BrowserUtils.waitForVisibility(fleetPage.ContractExpirationDate,25);
        fleetPage.ContractExpirationDate.sendKeys(Keys.BACK_SPACE);
        fleetPage.ContractExpirationDate.sendKeys(arg0);
        BrowserUtils.sleep(3);

    }



    @Then("users enter {string}to Vendor n")
    public void usersEnterToVendorN(String arg0) {
        fleetPage.Vendor.sendKeys(Keys.BACK_SPACE+arg0);
    }

    @And("users enter {string}to Driver")
    public void usersEnterToDriver(String arg0) {
        fleetPage.DriverBox.sendKeys(Keys.BACK_SPACE+arg0);
    }

    @And("users enter {string}to Contract Reference")
    public void usersEnterToContractReference(String arg0) {
        fleetPage.ContractReference.sendKeys(Keys.BACK_SPACE+arg0);
    }

    @And("users enter {string}to Terms and Conditions")
    public void usersEnterToTermsAndConditions(String arg0) {
        fleetPage.TermsAndConditions.sendKeys(Keys.BACK_SPACE+arg0);
    }

    @When("users select {string} to status")
    public void users_select_to_status(String string) {
      fleetPage.Status.sendKeys(Keys.BACK_SPACE+string);
    }

    @Then("user click the save and close button")
    public void userClickTheSaveAndCloseButton() {
//        BrowserUtils.waitForVisibility(fleetPage.triangleButton,3);
//        fleetPage.triangleButton.click();
//        fleetPage.dropDownSaveAndClose.click();
        fleetPage.saveCloseButton.click();
    }
}
