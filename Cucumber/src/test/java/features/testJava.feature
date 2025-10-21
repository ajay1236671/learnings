Feature: Application Login
  Scenario: Admin Page default login
    Given User is on net banking landing page
    When User Login into application
    Then Home Page is displayed
    And Cards are displayed
