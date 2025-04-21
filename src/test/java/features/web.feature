Feature: Test Automation Web www.saucedemo.com

  @web
  Scenario: Login logout using valid user name and password (TC-01)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    Then user is on home page
    And user click button menu
    Then user click button logout
#    berhasil

  @web
  Scenario: Login with invalid user but valid password (TC-02)
    Given user is on login page
    And user input user name "Tes Invalid User"
    And user input password "secret_sauce"
    When user click button login
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"
# berhasil

  @web
  Scenario: Login with valid user but invalid password (TC-03)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "tes_invalid"
    When user click button login
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"
# berhasil

  @web
  Scenario: Click login without input user name and password (TC-04)
    Given user is on login page
    When user click button login
    Then user able to see login error message "Epic sadface: Username is required"
#    berhasil

  @web
  Scenario: Click login and shopping cart (TC-05)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    And user click button login
    When user click icon shopping cart
    Then user will directed to the your cart page
#    Berhasil

  @web
  Scenario: Login and add three items to cart (TC-06)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    And user will see icon to cart in home page
    And user add "3" item to cart
    Then user verify cart item is match "3"
#    Berhasil

  @web
  Scenario: Login and manage items in cart (TC-07)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    And user will see icon to cart in home page
    And user add "3" item to cart
    Then user verify cart item is match "3"
    When user remove "2" item to cart
    Then user verify cart item is match "1"
#    Berhasil

  @web
  Scenario: Login, add items, and checkout (TC-08)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    And user will see icon to cart in home page
    And user add "2" item to cart
    Then user verify cart item is match "2"
    When user click icon shopping cart
    And user will be directed to the your cart page
    And user click btn checkout
    Then user will be directed to your information page
    When user input first name "Heri"
    And user input last name "Setyo Aji"
    And user input postal code "45312"
    And user click btn continue
    And user click btn finish
    Then user will be directed to the last page and sees the word "Thank you for your order!"
#    berhasil

  @web
  Scenario: Login, add item, checkout, and back to home page (TC-09)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    And user will see icon to cart in home page
    And user add "1" item to cart
    Then user verify cart item is match "1"
    When user click icon shopping cart
    And user will be directed to the your cart page
    And user click btn checkout
    Then user will be directed to your information page
    When user click btn cancel
    And user click btn continue shopping
    Then user is on home page
    When user click button menu
    Then user click button logout
#    berhasil

  @web
  Scenario: Login, add item, checkout, but not input your information (TC-10)
    Given user is on login page
    And user input user name "standard_user"
    And user input password "secret_sauce"
    When user click button login
    And user will see icon to cart in home page
    And user add "1" item to cart
    Then user verify cart item is match "1"
    When user click icon shopping cart
    And user will be directed to the your cart page
    And user click btn checkout
    Then user will be directed to your information page
    When user click btn continue
    Then user able to see error message "Error: First Name is required"
#    berhasil