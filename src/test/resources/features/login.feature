Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Check User can't login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And User quites browser
    Examples:
      | email | password |
      | mav@gm.com | Qwerty82 |
      | mav@gm.com | qwerty8! |
      | mav@gm.com | QWERTY8! |
      | mav@gm.com | Qwertyq! |
      | mav@gm.com | 1234568! |
      | mav@gm.com | !!!!!!!! |