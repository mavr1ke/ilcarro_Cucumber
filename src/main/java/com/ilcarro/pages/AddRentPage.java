package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRentPage extends BasePage {
    public AddRentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement locationInput;

    @FindBy(id = "make")
    WebElement manufactureInput;

    @FindBy(id = "model")
    WebElement modelInput;

    @FindBy(id = "year")
    WebElement yearInput;

    @FindBy(id = "fuel")
    WebElement fuelDropDown;

    @FindBy(id = "seats")
    WebElement seatsInput;

    @FindBy(id = "class")
    WebElement classInput;

    @FindBy(id = "serialNumber")
    WebElement regNumberInput;

    @FindBy(id = "price")
    WebElement priceInput;

    @FindBy(id = "about")
    WebElement aboutInput;
    public AddRentPage enterCarData(String location, String manufacture, String model,
                                    String year, String fuel, String seats, String carClass,
                                    String regNumber, String price, String about, String path) {
        type(locationInput, location);
        type(manufactureInput, manufacture);
        type(modelInput, model);
        type(yearInput, year);

        type(seatsInput, seats);
        type(classInput, carClass);
        type(regNumberInput, regNumber);
        type(priceInput, price);
        type(aboutInput, about);
        return this;
    }

    @FindBy(css = "button[type='submit']")
    WebElement submit;

    public AddRentPage clickSubmitButton() {
//        clickWithJs(submit, 0, 300);
        return this;
    }
}
