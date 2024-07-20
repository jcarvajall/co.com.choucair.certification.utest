# Autor: Juan
@scenarios
Feature: Add to cart functionality
  As a user
  I want to be able to add products to the cart
  So that I can purchase them later

  Background:
    Given enter the page

  @scenario1
  Scenario: Add a single product to the cart
    When selects "Samsung galaxy s6"
    Then go to home page

  @scenario2
  Scenario: Create a new user account
    When enter the username "Juan9090"
    And enter the password "123"
    And submit the registration form
    Then should see a confirmation message "Sign up successful."

  @scenario3
  Scenario: User login
    When perform login
    Then validate login with message "Welcome"

  @scenario4
  Scenario: User Log out
    When perform login
    When perform logout
    Then validate logout

  @scenario5
  Scenario: Fill out the contact form and handle alert
    Given go the contact page
    Then fill out the contact form with email "test@pragma.com", name "Juan Carvajal", and message "This is a test message"

  @scenario6
  Scenario: Add a monitor to the cart
    Given go the monitors
    When selects "Apple monitor 24"
    Then go to home page







