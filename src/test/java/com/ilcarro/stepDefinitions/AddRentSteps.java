package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.AddRentPage;
import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddRentSteps {

    @And("User clicks on Add rent link")
    public void click_on_Add_rent_link() {
        new HomePage(driver).clickOnAddRentLink();
    }

    @And("User enters car data")
    public void enter_car_data() {
        new AddRentPage(driver).enterCarData("Tel Aviv", "Tesla", "Model S",
                "2018", "Electric", "5", "Luxury sedan",
                "ABC459", "999", "qwe", "C:/Tools/1.jpg");
    }

    @And("User clicks submit button")
    public void click_submit_button() {
        new AddRentPage(driver).clickSubmitButton();
    }

    @Then("User verifies Success rent message displayed")
    public void verify_Success_rent_message() {
        new AddRentPage(driver).isSuccessMessageDisplayed();
    }
}
