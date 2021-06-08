package com.Nestbridge.step_definitions;



import com.Nestbridge.pages.VyLoginPage;
import com.Nestbridge.utilities.ConfigurationReader;
import com.google.common.collect.Maps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.Map;

public class login_stepDefinition {
VyLoginPage vyLoginPage=new VyLoginPage();
    @When("driver is on the login page")
    public void driver_is_on_the_login_page() {

    }



    @When("put the username")
    public void put_the_username() {
        vyLoginPage.username.sendKeys(Keys.BACK_SPACE+ ConfigurationReader.getProperty("StoreManagerUserName"));
    }
    @When("put the password")
    public void put_the_password() {
vyLoginPage.password.sendKeys(Keys.BACK_SPACE+ConfigurationReader.getProperty("StoreManagerPassword"));
    }
    @Then("login successful")
    public void login_successful() {
vyLoginPage.loginButton.click();
    }

 //dataTable

    @When("put the storeManager")
    public void put_the_store_manager(Map<String,String> logInfo) {
        String username=logInfo.get("username");
        String password=logInfo.get("password");
        vyLoginPage.username.sendKeys(username);
        vyLoginPage.password.sendKeys(password);

    }


    //scenario outline
    @When("salesmanager and storemanager put the {string}")
    public void salesmanager_and_storemanager_put_the(String string) {
       vyLoginPage.username.sendKeys(string);
    }

    @When("salesmanager and storemanager type {string}")
    public void salesmanager_and_storemanager_type(String string) {
      vyLoginPage.password.sendKeys(string);
    }





}
