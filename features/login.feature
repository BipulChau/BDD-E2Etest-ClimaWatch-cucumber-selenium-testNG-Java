#Feature: Login
#  Scenario: Valid Login
#    Given I open the chrome browser
#    When I open the page "http://127.0.0.1:5501/index.html"
#    Then The page title should be "ClimaWatch"
#    When I click on Sign in tab
#    Then Sign in form should display
#    When I enter correct user name "bipul513"
#    And correct password  "password"
#    Then I should see the message "Welcome to ClimaWatch !!!"




Feature: Homepage
  Scenario: Page Opens
    Given I open the chrome browser
    When I open the page "http://127.0.0.1:5501/index.html"
    Then The page title should be "ClimaWatch"