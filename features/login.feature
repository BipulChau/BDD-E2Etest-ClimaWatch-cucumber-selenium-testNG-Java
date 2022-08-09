Feature: Login
  Scenario: Valid Login
    Given I open the chrome browser
    When I open the page "http://127.0.0.1:5501/index.html"
    Then The page should open
    When I click on Sign in tab
    Then Sign in form should display
    When I enter correct user name "bipul513"
    And correct password "password"
    Then I should successfully log in
    And see the message "bipul513, Welcome to ClimaWatch !!!"