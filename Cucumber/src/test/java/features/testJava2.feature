Feature: Application Login
  Scenario: Admin Page default login
    Given User is on net banking landing page
    When User Login into application with "<Username>" and password "<password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
    |Username|password|
    |ajay123 |pas123  |
    |ak100  | 2347paa |
