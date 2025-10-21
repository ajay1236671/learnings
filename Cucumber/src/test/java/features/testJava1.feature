Feature: Application Login
  Scenario: Admin Page default login
    Given User is on net banking landing page
    When User Login into application with "user" and password "0953"
    Then Home Page is displayed
    And Cards are displayed
