Feature: Login functionality for ShopHub Pro

  Scenario Outline: Login with Valid and Invalid credentials
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then Appropriate message should be displayed

    Examples: 
      | username           | password   |
      | admin@shophub.com  | admin123   |  
      | admin@shophub.com  | admin1234  |