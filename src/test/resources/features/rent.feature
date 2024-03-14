Feature: Add Rent

  @addRent
  Scenario: Check User can add car to rent
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on OK button
    And User clicks on Add rent link
    And User enters car data
    And User clicks submit button
    Then User verifies Success rent message displayed
    And User quites browser
