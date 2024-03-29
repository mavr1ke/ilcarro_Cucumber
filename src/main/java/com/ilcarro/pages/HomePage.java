package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement title;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(title);
        return this;
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;

    public LoginPage clickonLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(3)")
    WebElement addRentLink;

    public AddRentPage clickOnAddRentLink() {
        pause(1000);
        click(addRentLink);
        return new AddRentPage(driver);
    }
}
