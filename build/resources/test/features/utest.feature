# Autor:Juan
@scenarios
Feature: utest
  As a developer I will automate the blazedemo page.

  @scenario:
  Scenario: blazeDemo flight log
    Given enter the page
    When  go to find flights
    And go to select flight
    Then validate data for flight purchase


  @scenario:
  Scenario: blazeDemo login
    Given enter the page
    When perform login
    Then validate login