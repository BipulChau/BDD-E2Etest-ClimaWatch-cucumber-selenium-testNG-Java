Feature: Homepage

  Scenario: Page Opens
    Given I open the chrome browser
    When I open the home page
    Then The page title should be "ClimaWatch"

  Scenario: Search City
    Given I am at the home page
    When I type city name "Atlanta"
    And Click search button
    Then I should see the weather information of the city

  Scenario: Current Location
    Given I am at the home page
    When I click on Current Location
    Then I should see the weather information of the city

#  Scenario: Sign in successfully
#    Given I am at the home page
#    When I click on Sign in link
#    And Type username "bipul513"
#    And Type password "password"
#    And Click sign in button
#    Then I should be logged into my profile and see my username "bipul513, Welcome to ClimaWatch !!!" in the page

    Scenario Outline: Sign in successfully
      Given I am at the home page
      When I click on Sign in link
      And Type username <username>
      And Type password <password>
      And Click sign in button
      Then I should be logged into my profile and see my username <username>", Welcome to ClimaWatch !!!" in the page

      Examples:
      |username   |password  |
      |"bipul513" |"password"|
      |"shaquera7"|"password"|
      |"kareem11" |"password"|







